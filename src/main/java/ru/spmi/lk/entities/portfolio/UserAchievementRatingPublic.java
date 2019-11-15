package ru.spmi.lk.entities.portfolio;

public class UserAchievementRatingPublic {
    private int id;
    private String title;
    private String short_title;
    private String children_title;
    private boolean opened;
    private boolean public_files;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortTitle() {
        return short_title;
    }

    public String getChildrenTitle() {
        return children_title;
    }

    public boolean isOpened() {
        return opened;
    }

    public boolean isPublicFiles() {
        return public_files;
    }
}
