package ru.spmi.lk.entities.search.students;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class StudentsSearchRequestBuilder {
    private StringBuilder filters = new StringBuilder("\"filters\":{");
    private int first = 0;
    private int rows = 10;
    private String sortField = "fullname";
    private int sortOrder = 1;
    private String cookies;


    public StudentsSearchRequestBuilder(String cookies) {
        this.cookies = cookies;
    }

    public StudentsSearchRequestBuilder setFirst(int first){
        this.first = first;
        return this;
    }

    public StudentsSearchRequestBuilder setRows(int rows){
        this.rows = rows;
        return this;
    }

    public StudentsSearchRequestBuilder setSortField(String sortField){
        this.sortField = sortField;
        return this;
    }

    public StudentsSearchRequestBuilder setSortOrder(int sortOrder){
        this.sortOrder = sortOrder;
        return this;
    }

    public StudentsSearchRequestBuilder addDepartmentFilter(int value){
        filters.append("\"department\":{\"value\":\"").append(value).append("\",\"matchMode\":\"any\"},");
        return this;
    }

    public StudentsSearchRequestBuilder addEduQualificationFilter(int value){
        filters.append("\"edu_qualification\":{\"value\":\"").append(value).append("\",\"matchMode\":\"any\"},");
        return this;
    }

    public StudentsSearchRequestBuilder addEduSpecializationFilter(int value){
        filters.append("\"edu_specialization\":{\"value\":\"").append(value).append("\",\"matchMode\":\"any\"},");
        return this;
    }

    public StudentsSearchRequestBuilder addEduFullNameFilter(String name){
        filters.append("\"fullname\":{\"value\":\"").append(name).append("\",\"matchMode\":\"any\"},");
        return this;
    }
    public StudentsSearchRequestBuilder addEduCourseFilter(int value){
        filters.append("\"edu_course\":{\"value\":\"").append(value).append("\",\"matchMode\":\"any\"},");
        return this;
    }

    public StudentsSearchResponse execute() throws IOException {
        if (filters.toString().endsWith(",")) filters = new StringBuilder(
                filters.substring(0, filters.length() - 1));
        filters.append("}");
        StringBuilder request = new StringBuilder();
        request.append("{\"first\":").append(first)
                .append(",\"rows\":").append(rows).append(",\"sortField\":\"").append(sortField)
                .append("\",\"sortOrder\":").append(sortOrder).append(",")
                .append(filters).append(",\"globalFilter\":null}");
        URL url = new URL("https://lk.spmi.ru/bitrix/vuz/api/profiles/students");
        HttpURLConnection con = (HttpURLConnection)url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json; utf-8");
        con.setRequestProperty("Accept", "application/json");
        con.setRequestProperty("Cookie", cookies);
        con.setDoOutput(true);
        try(OutputStream os = con.getOutputStream()) {
            byte[] input = request.toString().getBytes(StandardCharsets.UTF_8);
            os.write(input, 0, input.length);
        }
        try(BufferedReader br = new BufferedReader(
                new InputStreamReader(con.getInputStream(), StandardCharsets.UTF_8))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            Gson gson = new Gson();
            StudentsSearchResponse read = gson.fromJson(response.toString(), StudentsSearchResponse.class);
            return read;
        }
    }
}
