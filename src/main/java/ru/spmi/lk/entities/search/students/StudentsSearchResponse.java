package ru.spmi.lk.entities.search.students;

public class StudentsSearchResponse {
    private int total;
    private int all;
    private StudentsSearchResponseItem[] items;
    private String sql;

    public int getTotal() {
        return total;
    }

    public int getAll() {
        return all;
    }

    public StudentsSearchResponseItem[] getItems() {
        return items;
    }

    public String getSql() {
        return sql;
    }
}
