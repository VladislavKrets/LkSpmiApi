package ru.spmi.lk.entities.marks;

public class MarkOptions {
    private boolean multiple;
    private String dateFormat;
    private MarkOptionsColumn[] columns;

    public boolean isMultiple() {
        return multiple;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public MarkOptionsColumn[] getColumns() {
        return columns;
    }
}
