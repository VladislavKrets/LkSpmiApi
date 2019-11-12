package ru.spmi.lk.entities.search.employees;

public class EmployeeSearchResponseItemProfile {
    private int id;
    private int department_id;
    private EmployeeSearchResponseItemProfileDepartment[] department;
    private String job_title;

    public int getId() {
        return id;
    }

    public int getDepartmentId() {
        return department_id;
    }

    public EmployeeSearchResponseItemProfileDepartment[] getDepartment() {
        return department;
    }

    public String getJobTitle() {
        return job_title;
    }
}
