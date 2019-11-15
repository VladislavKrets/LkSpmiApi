package ru.spmi.lk.entities.portfolio;

public class AchievementInfo {
    private int id;
    private String title;
    private int level;
    private Integer parent_id;
    private String children_title;
    private boolean global;
    private String type;
    private int archive;
    private int show_date_end;
    private boolean public_files;
    private String comment;
    private AchievementInfoChildren[] children;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getLevel() {
        return level;
    }

    public Integer getParentId() {
        return parent_id;
    }

    public String getChildrenTitle() {
        return children_title;
    }

    public boolean isGlobal() {
        return global;
    }

    public String getType() {
        return type;
    }

    public int getArchive() {
        return archive;
    }

    public int getShowDateEnd() {
        return show_date_end;
    }

    public boolean isPublicFiles() {
        return public_files;
    }

    public String getComment() {
        return comment;
    }

    public AchievementInfoChildren[] getChildren() {
        return children;
    }
}
