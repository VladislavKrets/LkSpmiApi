package ru.spmi.lk.entities.search.employees;

public class EmployeeSearchResponseItemProfileDepartment {
    private int id;
    private String sync_id;
    private String external_id;
    private String title;
    private String short_title;
    private Integer parent_id;
    private Integer department_id;
    private Integer manager;
    private int deletion_mark;
    private String type;
    private int level;

    public int getId() {
        return id;
    }

    public String getSyncId() {
        return sync_id;
    }

    public String getExternalId() {
        return external_id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortTitle() {
        return short_title;
    }

    public Integer getParentId() {
        return parent_id;
    }

    public Integer getDepartmentId() {
        return department_id;
    }

    public Integer getManager() {
        return manager;
    }

    public int getDeletionMark() {
        return deletion_mark;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }
}
