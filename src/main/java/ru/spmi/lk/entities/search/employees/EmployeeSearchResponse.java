package ru.spmi.lk.entities.search.employees;

public class EmployeeSearchResponse {
    private int total;
    private int all;
    private String sql;
    private EmployeeSearchResponseItem[] items;

    public int getTotal() {
        return total;
    }

    public int getAll() {
        return all;
    }

    public String getSql() {
        return sql;
    }

    public EmployeeSearchResponseItem[] getItems() {
        return items;
    }
}
