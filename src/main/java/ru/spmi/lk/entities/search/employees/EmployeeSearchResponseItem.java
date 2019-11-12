package ru.spmi.lk.entities.search.employees;

public class EmployeeSearchResponseItem {
    private int id;
    private String fullname;
    private EmployeeSearchResponseItemPhoto photo;
    private EmployeeSearchResponseItemProfile[] profiles;

    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public EmployeeSearchResponseItemPhoto getPhoto() {
        return photo;
    }

    public EmployeeSearchResponseItemProfile[] getProfiles() {
        return profiles;
    }
}
