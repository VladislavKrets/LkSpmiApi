package ru.spmi.lk.entities.portfolio;

public class AchievementInfoChildren {
    private int id;
    private String title;
    private int level;
    private Integer parent_id;
    private int archive;
    private int show_date_end;
    private String comment;

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

    public int getArchive() {
        return archive;
    }

    public int getShowDateEnd() {
        return show_date_end;
    }

    public String getComment() {
        return comment;
    }
}
