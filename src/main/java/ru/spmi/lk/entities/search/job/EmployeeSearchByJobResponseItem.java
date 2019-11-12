package ru.spmi.lk.entities.search.job;

public class EmployeeSearchByJobResponseItem {
    private int id;
    private int user_id;
    private String fullname;
    private String fullname_en;
    private String job_title;
    private String job_type;
    private String email;
    private String mobile;
    private int department_id;
    private String department;
    private EmployeeSearchByJobResponseItemPhoto photo;

    public int getId() {
        return id;
    }

    public int getUserId() {
        return user_id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getFullnameEn() {
        return fullname_en;
    }

    public String getJobTitle() {
        return job_title;
    }

    public String getJobType() {
        return job_type;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public String getDepartment() {
        return department;
    }

    public EmployeeSearchByJobResponseItemPhoto getPhoto() {
        return photo;
    }
}
