package ru.spmi.lk.entities.portfolio.upload;

public class AddResponseLevel {
    private int id;
    private int level;
    private int parent_id;
    private String short_title;
    private String children_title;
    private String title;

    public int getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public int getParentId() {
        return parent_id;
    }

    public String getShortTitle() {
        return short_title;
    }

    public String getChildrenTitle() {
        return children_title;
    }

    public String getTitle() {
        return title;
    }
}
