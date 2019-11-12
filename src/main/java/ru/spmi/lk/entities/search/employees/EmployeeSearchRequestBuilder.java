package ru.spmi.lk.entities.search.employees;

import com.google.gson.Gson;
import ru.spmi.lk.entities.search.students.StudentsSearchResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class EmployeeSearchRequestBuilder {
    private StringBuilder filters = new StringBuilder("\"filters\":{");
    private int first = 0;
    private int rows = 10;
    private String sortField = "fullname";
    private int sortOrder = 1;
    private String cookies;
    private String globalFilter;

    public EmployeeSearchRequestBuilder(String cookies) {
        this.cookies = cookies;
    }

    public EmployeeSearchRequestBuilder setFirst(int first){
        this.first = first;
        return this;
    }

    public EmployeeSearchRequestBuilder setRows(int rows){
        this.rows = rows;
        return this;
    }

    public EmployeeSearchRequestBuilder setSortField(String sortField){
        this.sortField = sortField;
        return this;
    }

    public EmployeeSearchRequestBuilder setSortOrder(int sortOrder){
        this.sortOrder = sortOrder;
        return this;
    }

    public EmployeeSearchRequestBuilder addGlobalFilter(String name){
        filters.append("\"global\":{\"value\":\"").append(name).append("\",\"matchMode\":\"contains\"}");
        globalFilter = name;
        return this;
    }

    public EmployeeSearchResponse execute() throws IOException {
        filters.append("}");
        StringBuilder request = new StringBuilder();
        request.append("{\"first\":").append(first)
                .append(",\"rows\":").append(rows).append(",\"sortField\":\"").append(sortField)
                .append("\",\"sortOrder\":").append(sortOrder).append(",")
                .append(filters).append(",\"globalFilter\":");

        if (globalFilter == null){
            request.append("null");
        }
        else {
            request.append("\"")
                    .append(globalFilter)
                    .append("\"");
        }
        request.append("}");
        URL url = new URL("https://lk.spmi.ru/bitrix/vuz/api/user/search/employee");
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
            EmployeeSearchResponse read = gson.fromJson(response.toString(), EmployeeSearchResponse.class);
            return read;
        }
    }
}
