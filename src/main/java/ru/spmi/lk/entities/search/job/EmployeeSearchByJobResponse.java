package ru.spmi.lk.entities.search.job;

public class EmployeeSearchByJobResponse {
    private int total;
    private int all;
    private EmployeeSearchByJobResponseItem[] items;
    private String sql;

    public int getTotal() {
        return total;
    }

    public int getAll() {
        return all;
    }

    public EmployeeSearchByJobResponseItem[] getItems() {
        return items;
    }

    public String getSql() {
        return sql;
    }
}
