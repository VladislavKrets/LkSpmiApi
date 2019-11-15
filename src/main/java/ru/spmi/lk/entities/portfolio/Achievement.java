package ru.spmi.lk.entities.portfolio;

public class Achievement {
    private int id;
    private int rating_id;
    private String criterion;
    private String level3_title;
    private String level4_title;
    private String last_title;
    private int year;
    private int semester;
    private String date;
    private String date_end;
    private String description;
    private String status;
    private String updated_at;
    private int user_id;
    private int points;
    private String type;
    private AchievementAttachment[] attachments;
    private UserAchievementRatingPublic rating_public;

    public int getId() {
        return id;
    }

    public int getRatingId() {
        return rating_id;
    }

    public String getCriterion() {
        return criterion;
    }

    public String getLevel3Title() {
        return level3_title;
    }

    public String getLevel4Title() {
        return level4_title;
    }

    public String getLastTitle() {
        return last_title;
    }

    public int getYear() {
        return year;
    }

    public int getSemester() {
        return semester;
    }

    public String getDate() {
        return date;
    }

    public String getDateEnd() {
        return date_end;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public int getUserId() {
        return user_id;
    }

    public int getPoints() {
        return points;
    }

    public String getType() {
        return type;
    }

    public AchievementAttachment[] getAttachments() {
        return attachments;
    }

    public UserAchievementRatingPublic getRatingPublic() {
        return rating_public;
    }
}
