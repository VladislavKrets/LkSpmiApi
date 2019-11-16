package ru.spmi.lk.authorization;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ru.spmi.lk.entities.attestations.Attestation;
import ru.spmi.lk.entities.bup.Bup;
import ru.spmi.lk.entities.bup.SettingsSectionBup;
import ru.spmi.lk.entities.disk.Disk;
import ru.spmi.lk.entities.marks.Mark2;
import ru.spmi.lk.entities.marks.SettingsSectionMarks;
import ru.spmi.lk.entities.orders.Order;
import ru.spmi.lk.entities.orders.SettingsSectionOrder;
import ru.spmi.lk.entities.portfolio.*;
import ru.spmi.lk.entities.portfolio.upload.AddResponse;
import ru.spmi.lk.entities.profile.Profile;
import ru.spmi.lk.entities.profile.ProfileCurrent;
import ru.spmi.lk.entities.attestations.SettingsSectionAttestations;
import ru.spmi.lk.entities.schedule.Schedule;
import ru.spmi.lk.entities.schedule.ScheduleGroup;
import ru.spmi.lk.entities.search.employees.EmployeeSearchRequestBuilder;
import ru.spmi.lk.entities.search.job.Dep;
import ru.spmi.lk.entities.search.job.EmployeeSearchByJobRequestBuilder;
import ru.spmi.lk.entities.search.job.JobTitle;
import ru.spmi.lk.entities.search.students.EduDep;
import ru.spmi.lk.entities.search.students.Qualification;
import ru.spmi.lk.entities.search.students.Specialization;
import ru.spmi.lk.entities.search.students.StudentsSearchRequestBuilder;
import ru.spmi.lk.entities.rup.Rup;
import ru.spmi.lk.entities.rup.SettingsSectionRup;
import ru.spmi.lk.entities.stipend.SettingsSectionStipend;
import ru.spmi.lk.entities.stipend.Stipend;
import ru.spmi.lk.entities.portfolio.upload.AchievementRequest;
import ru.spmi.lk.entities.portfolio.upload.Attachment;
import ru.spmi.lk.entities.portfolio.upload.UploadResponse;

import java.io.*;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class LkSpmi
{
    private String cookies;
    public static String DEFAULT_AVATAR_URL = "https://lk.spmi.ru/app/assets/images/default_image.svg";
    private static String BASE_URL = "https://lk.spmi.ru";
    private static String DEFAULT_DOWNLOAD_FILE_URL = "/disk/downloadFile/%d/?&ncc=1";

    LkSpmi(String cookies) {
        this.cookies = cookies;
    }
    public List<Profile> getProfile() throws IOException {
        Gson gson = new Gson();
        String json = getRequest("https://lk.spmi.ru/bitrix/vuz/api/profile");
        Type type = new TypeToken<List<Profile>>(){}.getType();
        List<Profile> read = gson.fromJson(json, type);
        return read;
    }

    public ProfileCurrent getProfileCurrent() throws IOException {
        Gson gson = new Gson();
        String json = getRequest("https://lk.spmi.ru/bitrix/vuz/api/profile/current");
        ProfileCurrent read = gson.fromJson(json, ProfileCurrent.class);
        return read;
    }

    public SettingsSectionAttestations getSettingsSectionAttestations() throws IOException {
        Gson gson = new Gson();
        String json = getRequest("https://lk.spmi.ru/bitrix/vuz/api/settings/section/attestations");
        SettingsSectionAttestations read = gson.fromJson(json, SettingsSectionAttestations.class);
        return read;
    }

    public List<Attestation> getAttestations() throws IOException{
        Gson gson = new Gson();
        String json = getRequest("https://lk.spmi.ru/bitrix/vuz/api/attestations/");
        Type type = new TypeToken<List<Attestation>>(){}.getType();
        List<Attestation> read = gson.fromJson(json, type);
        return read;
    }

    public SettingsSectionMarks getSettingsSectionMarks() throws IOException{
        Gson gson = new Gson();
        String json = getRequest("https://lk.spmi.ru/bitrix/vuz/api/settings/section/marks");
        SettingsSectionMarks read = gson.fromJson(json, SettingsSectionMarks.class);
        return read;
    }

    public List<Mark2> getMarks() throws IOException{
        Gson gson = new Gson();
        String json = getRequest("https://lk.spmi.ru/bitrix/vuz/api/marks2/");
        Type type = new TypeToken<List<Mark2>>(){}.getType();
        List<Mark2> read = gson.fromJson(json, type);
        return read;
    }

    public SettingsSectionBup getSettingsSectionBup() throws IOException{
        Gson gson = new Gson();
        String json = getRequest("https://lk.spmi.ru/bitrix/vuz/api/settings/section/bup");
        SettingsSectionBup read = gson.fromJson(json, SettingsSectionBup.class);
        return read;
    }

    public Bup getBup() throws IOException{
        Gson gson = new Gson();
        String json = getRequest("https://lk.spmi.ru/bitrix/vuz/api/bups/");
        Bup read = gson.fromJson(json, Bup.class);
        return read;
    }

    public SettingsSectionRup getSettingsSectionRup() throws IOException{
        Gson gson = new Gson();
        String json = getRequest("https://lk.spmi.ru/bitrix/vuz/api/settings/section/rup");
        SettingsSectionRup read = gson.fromJson(json, SettingsSectionRup.class);
        return read;
    }

    public Rup getRup() throws IOException{
        Gson gson = new Gson();
        String json = getRequest("https://lk.spmi.ru/bitrix/vuz/api/rups/");
        Rup read = gson.fromJson(json, Rup.class);
        return read;
    }

    // направление
    public List<Specialization> getAllSpecializations() throws IOException{
        Gson gson = new Gson();
        String json = getRequest("https://lk.spmi.ru/bitrix/vuz/api/specializations/");
        Type type = new TypeToken<List<Specialization>>(){}.getType();
        List<Specialization> read = gson.fromJson(json, type);
        return read;
    }

    //бакалавры там
    public List<Qualification> getAllQualifications() throws IOException{
        Gson gson = new Gson();
        String json = getRequest("https://lk.spmi.ru/bitrix/vuz/api/qualifications/");
        Type type = new TypeToken<List<Qualification>>(){}.getType();
        List<Qualification> read = gson.fromJson(json, type);
        return read;
    }

    //department группа
    public List<EduDep> getAllEduDeps() throws IOException{
        Gson gson = new Gson();
        String json = getRequest("https://lk.spmi.ru/bitrix/vuz/api/select/edudeps/");
        Type type = new TypeToken<List<EduDep>>(){}.getType();
        List<EduDep> read = gson.fromJson(json, type);
        return read;
    }

    public StudentsSearchRequestBuilder searchStudents(){
        return new StudentsSearchRequestBuilder(cookies);
    }

    public EmployeeSearchRequestBuilder searchEmployees(){
        return new EmployeeSearchRequestBuilder(cookies);
    }
    //какое управление
    public List<Dep> getAllDeps() throws IOException{
        Gson gson = new Gson();
        String json = getRequest("https://lk.spmi.ru/bitrix/vuz/api/select/deps/");
        Type type = new TypeToken<List<Dep>>(){}.getType();
        List<Dep> read = gson.fromJson(json, type);
        return read;
    }

    public List<JobTitle> getAllJobTitles() throws IOException{
        Gson gson = new Gson();
        String json = getRequest("https://lk.spmi.ru/bitrix/vuz/api/jobtitles/");
        Type type = new TypeToken<List<JobTitle>>(){}.getType();
        List<JobTitle> read = gson.fromJson(json, type);
        return read;
    }

    public EmployeeSearchByJobRequestBuilder searchEmployeesByJob(){
        return new EmployeeSearchByJobRequestBuilder(cookies);
    }

    public SettingsSectionStipend getSettingsSectionStipend() throws IOException{
        Gson gson = new Gson();
        String json = getRequest("https://lk.spmi.ru/bitrix/vuz/api/settings/section/stipend");
        SettingsSectionStipend read = gson.fromJson(json, SettingsSectionStipend.class);
        return read;
    }

    public List<Stipend> getStipend() throws IOException{
        Gson gson = new Gson();
        String json = getRequest("https://lk.spmi.ru/bitrix/vuz/api/stipends/");
        Type type = new TypeToken<List<Stipend>>(){}.getType();
        List<Stipend> read = gson.fromJson(json, type);
        return read;
    }
    public SettingsSectionOrder getSettingsSectionOrder() throws IOException{
        Gson gson = new Gson();
        String json = getRequest("https://lk.spmi.ru/bitrix/vuz/api/settings/section/orders");
        SettingsSectionOrder read = gson.fromJson(json, SettingsSectionOrder.class);
        return read;
    }

    public List<Order> getOrders() throws IOException{
        Gson gson = new Gson();
        String json = getRequest("https://lk.spmi.ru/bitrix/vuz/api/orders/");
        Type type = new TypeToken<List<Order>>(){}.getType();
        List<Order> read = gson.fromJson(json, type);
        return read;
    }

    public List<Disk> getDisk() throws IOException {
        int bitrixId = getProfileCurrent().getBitrixId();
        return getDisk("/company/personal/user/" + bitrixId + "/disk/path/");
    }

    public List<Disk> getDisk(String url) throws IOException{
        String answer = getRequest(BASE_URL + url);
        answer = answer.split("var +gridTile *= *new +BX\\.Main\\.TileGrid\\(")[1];
        char[] chars = answer.toCharArray();
        int open = 0;
        int closed = 0;
        int first = 0;
        int last = 0;
        for (int i = 0; i < chars.length; i++){
            if (chars[i] == '[' && open == 0) first = i;
            if (chars[i] == '[') open++;
            if (chars[i] == ']') closed++;
            if (open > 0 && closed > 0 && open == closed){
                last = i;
                break;
            }
        }
        answer = answer.substring(first, last + 1);
        Gson gson = new Gson();
        Type type = new TypeToken<List<Disk>>(){}.getType();
        List<Disk> read = gson.fromJson(answer, type);
        return read;
    }

    // null saveDir if to current folder
    public void downloadFile(int fileId, String fileName, String saveDir)
            throws IOException {
        String fileURL = String.format(DEFAULT_DOWNLOAD_FILE_URL, fileId);
        System.out.println(fileURL);
        download(fileName, saveDir, fileURL);
    }
    // null saveDir if to current folder
    public void downloadImage(String imageName, String imageUrl, String saveDir) throws IOException{
        if(imageName == null) {
            int index = imageUrl.lastIndexOf("/");
            imageName = imageUrl.substring(index + 1);
        }
        download(imageName, saveDir, imageUrl);
    }

    private void download(String fileName, String saveDir, String fileURL) throws IOException {
        URL url = new URL(BASE_URL + fileURL);
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        httpConn.setRequestProperty("Cookie", cookies);
        int responseCode = httpConn.getResponseCode();

        // always check HTTP response code first
        if (responseCode == HttpURLConnection.HTTP_OK) {
            String disposition = httpConn.getHeaderField("Content-Disposition");
            String contentType = httpConn.getContentType();
            int contentLength = httpConn.getContentLength();

            // opens input stream from the HTTP connection
            InputStream inputStream = httpConn.getInputStream();
            String saveFilePath = saveDir == null ? fileName : (saveDir + File.separator + fileName);

            // opens an output stream to save into file
            FileOutputStream outputStream = new FileOutputStream(saveFilePath);

            int bytesRead = -1;
            byte[] buffer = new byte[1024];
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            outputStream.close();
            inputStream.close();

            System.out.println("File downloaded");
        } else {
            System.out.println("No file to download. Server replied HTTP code: " + responseCode);
        }
        httpConn.disconnect();
    }

    public List<ScheduleGroup> getScheduleGroups(String group) throws IOException{
        Gson gson = new Gson();
        group = URLEncoder.encode(group, "utf-8");
        String json = getRequest(String.format("https://lk.spmi.ru/ruzapi/search?term=%s&type=group", group));
        Type type = new TypeToken<List<ScheduleGroup>>(){}.getType();
        List<ScheduleGroup> read = gson.fromJson(json, type);
        return read;
    }

    public List<Schedule> getSchedules(int groupId, Date startDate, Date finishDate) throws IOException{
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        String start = dateFormat.format(startDate);
        String finish = dateFormat.format(finishDate);
        String json = getRequest(String.format("https://lk.spmi.ru/ruzapi/schedule/group/%d?start=%s&finish=%s&lng=1", groupId, start, finish));
        Gson gson = new Gson();
        Type type = new TypeToken<List<Schedule>>(){}.getType();
        List<Schedule> read = gson.fromJson(json, type);
        return read;
    }

    //use getId from currentProfile semesterInYear(1, 2)
    public UserAchievements getUserAchievements(int id, int year, int semesterInYear) throws IOException{
        Gson gson = new Gson();
        String json = getRequest(String
                .format("https://lk.spmi.ru/bitrix/vuz/api/mon/achievements/user/%d/common/%d/%d",
                        id, year, semesterInYear));
        UserAchievements read = gson.fromJson(json, UserAchievements.class);
        return read;
    }

    public UserAchievementsPoints getPoints(int id, int year, int semesterInYear) throws IOException{
        Gson gson = new Gson();
        String json = getRequest(String
                .format("https://lk.spmi.ru/bitrix/vuz/api/mon/points/%d/%d/%d",
                        id, year, semesterInYear));
        UserAchievementsPoints read = gson.fromJson(json, UserAchievementsPoints.class);
        return read;
    }
    public List<AchievementsType> getAllAchievementsTypes() throws IOException{
        Gson gson = new Gson();
        String json = getRequest("https://lk.spmi.ru/bitrix/vuz/api/mon/achievements/file/types/-1");
        Type type = new TypeToken<List<AchievementsType>>(){}.getType();
        List<AchievementsType> read = gson.fromJson(json, type);
        return read;
    }
    //для добавления
    // children тоже использовать в запрос до конца
    public AchievementInfo getAchievementInfo(int id, int achievementId) throws IOException{
        Gson gson = new Gson();
        String json = getRequest(String
                .format("https://lk.spmi.ru/bitrix/vuz/api/mon/achievements/level/%d/%d",
                        id, achievementId));
        AchievementInfo read = gson.fromJson(json, AchievementInfo.class);
        return read;
    }

    public List<AchievementFileType> getAchievementFileTypes(int achievementId) throws IOException{
        Gson gson = new Gson();
        String json = getRequest("https://lk.spmi.ru/bitrix/vuz/api/mon/achievements/file/types/" + achievementId);
        Type type = new TypeToken<List<AchievementFileType>>(){}.getType();
        List<AchievementFileType> read = gson.fromJson(json, type);
        return read;
    }

    public UploadResponse uploadFile(File file) throws IOException{
        String request = "https://lk.spmi.ru/bitrix/vuz/attachments/upload";
        URL url = new URL(request);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        byte[] boundaryStart = "------WebKitFormBoundary1E2kXwOkt9JODrQ0\r\n".getBytes("utf-8");
        byte[] disposition = String.format("Content-Disposition: form-data; name=\"file\"; filename=\"%s\"\r\n",
                file.getName()).getBytes("utf-8");
        byte[] type = fileTypeFactory(file.getName()).getBytes("utf-8");
        byte[] boundaryEnd = "------WebKitFormBoundary1E2kXwOkt9JODrQ0--\r\n".getBytes("utf-8");
        long length = file.length() + boundaryStart.length + disposition.length + type.length + boundaryEnd.length;
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Cookie", cookies);
        conn.setRequestProperty("content-type", "multipart/form-data; boundary=----WebKitFormBoundary1E2kXwOkt9JODrQ0");
        conn.setRequestProperty("content-length", String.valueOf(length));
        try(OutputStream output = conn.getOutputStream()) {
            output.write(boundaryStart);
            output.write(disposition);
            output.write(type);
            Files.copy(file.toPath(), output);
            output.write("\r\n".getBytes("utf-8"));
            output.write(boundaryEnd);
            output.flush();
        }
        StringBuilder lines = new StringBuilder();
        try(InputStream inputStream = conn.getInputStream()) {
            BufferedReader bufferedReader = new BufferedReader(new
                    InputStreamReader(inputStream));
            String line;
            lines = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                lines.append(line);
            }
        }
        Gson gson = new Gson();
        UploadResponse read = gson.fromJson(lines.toString(), UploadResponse.class);
        return read;
    }

    public AddResponse addAchievement(int ratingId /*global parent achievement id*/, String description,
                             int userId /* user getId */,int year, int semester,
                             int[] levels /* all ids in achievement hierarchy */,
                             Attachment[] attachments) throws IOException{
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        AchievementRequest achievementRequest = new AchievementRequest();
        achievementRequest.setRatingId(ratingId);
        achievementRequest.setDescription(description);
        achievementRequest.setDate(dateFormat.format(new Date()));
        achievementRequest.setDateEnd("");
        achievementRequest.setAttachments(attachments);
        achievementRequest.setLevels(levels);
        achievementRequest.setCriterionId(0);
        achievementRequest.setYear(year);
        achievementRequest.setUserId(userId);
        achievementRequest.setSemester(semester);
        Gson gson = new Gson();
        String json = gson.toJson(achievementRequest);

        String request = "https://lk.spmi.ru/bitrix/vuz/api/mon/achievements/add";
        byte[] bytes = json.getBytes("utf-8");
        URL url = new URL(request);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Cookie", cookies);
        conn.setRequestProperty("content-type", "text/plain");
        conn.setRequestProperty("content-length", String.valueOf(bytes.length));
        try(OutputStream output = conn.getOutputStream()) {
            output.write(bytes);
            output.flush();
        }
        StringBuilder lines = new StringBuilder();
        try(InputStream inputStream = conn.getInputStream()) {
            BufferedReader bufferedReader = new BufferedReader(new
                    InputStreamReader(inputStream));
            String line;
            lines = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                lines.append(line);
            }
        }
        AddResponse read = gson.fromJson(lines.toString(), AddResponse.class);
        return read;
    }

    public void deleteAchievement(int achievementId) throws IOException{
        String response = getRequest("https://lk.spmi.ru/bitrix/vuz/api/mon/achievements/delete/"
                + achievementId);

    }

    private String fileTypeFactory(String filename){
        filename = filename.trim();
        if (filename.endsWith(".pdf")){
            return "Content-Type: application/pdf\r\n\r\n";
        }
        else if (filename.endsWith(".png")){
            return "Content-Type: image/png\r\n\r\n";
        }
        else if (filename.endsWith(".jpg")){
            return "Content-Type: image/jpg\r\n\r\n";
        }
        else if (filename.endsWith(".docx")){
            return "Content-Type: application/vnd.openxmlformats-officedocument.wordprocessingml.document\r\n\r\n";
        }
        else if (filename.endsWith(".doc")){
            return "Content-Type: application/msword\r\n\r\n";
        }
        else {
            return "";
        }
    }

    //tests
    // какой-то запрос через ajax с sessid хз что это но пусть будет
    private void example() throws IOException{
        String sessid = getRequest("https://lk.spmi.ru/company/personal/user/11441/disk/path/%D0%9A%D1%83%D0%B7/?grid_id=folder_list_11456&internal=true");
        //sessid = Jsoup.parse(sessid).body().getElementById("sessid").attr("value");
        sessid = sessid.split("'bitrix_sessid':'")[1];
        sessid = sessid.substring(0, sessid.indexOf("'"));
        String urlParameters = "resetFilter=1&SITE_ID=s1&sessid=" + sessid;
        byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);
        int postDataLength = postData.length;
        String request = "https://lk.spmi.ru/company/personal/user/11441/disk/path/%D0%9A%D1%83%D0%B7/?grid_id=folder_list_11456&internal=true";
        URL url = new URL(request);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Cookie", cookies);
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setRequestProperty("charset", "utf-8");
        conn.setRequestProperty("Content-Length", Integer.toString( postDataLength ));
        conn.setUseCaches(false);
        try(DataOutputStream wr = new DataOutputStream( conn.getOutputStream())) {
            wr.write(postData);
        }
        try(BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            System.out.println(response.toString());
        }
    }

    private String getRequest(String url) throws IOException{
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Cookie", cookies);
        StringBuilder json = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null){
                json.append(line);
            }
        }
        return json.toString();
    }

}
