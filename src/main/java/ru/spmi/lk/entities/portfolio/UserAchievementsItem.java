package ru.spmi.lk.entities.portfolio;

public class UserAchievementsItem {
    private int id;
    private String title;
    private String children_title;
    private boolean opened;
    private boolean global;
    private String type;
    private int archive;
    private Achievement[] achievements;


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getChildrenTitle() {
        return children_title;
    }

    public boolean isOpened() {
        return opened;
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

    public Achievement[] getAchievements() {
        return achievements;
    }
}
