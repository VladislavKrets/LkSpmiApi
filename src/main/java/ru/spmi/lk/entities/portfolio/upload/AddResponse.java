package ru.spmi.lk.entities.portfolio.upload;

public class AddResponse {
    private int rating_id;
    private String description;
    private String date;
    private String date_end;
    private boolean public_files;
    private int criterion_id;
    private int year;
    private int user_id;
    private int semester;
    private Integer level3_id;
    private Integer level4_id;
    private Integer last_level_id;
    private int points;
    private int porog;
    private String type;
    private int status_profile_id;
    private String status_date;
    private String updated_at;
    private String created_at;
    private int id;
    private AddResponseLevel[] levels;

    public int getRatingId() {
        return rating_id;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getDateEnd() {
        return date_end;
    }

    public boolean isPublicFiles() {
        return public_files;
    }

    public int getCriterionId() {
        return criterion_id;
    }

    public int getYear() {
        return year;
    }

    public int getUserId() {
        return user_id;
    }

    public int getSemester() {
        return semester;
    }

    public Integer getLevel3Id() {
        return level3_id;
    }

    public Integer getLevel4Id() {
        return level4_id;
    }

    public Integer getLastLevelId() {
        return last_level_id;
    }

    public int getPoints() {
        return points;
    }

    public int getPorog() {
        return porog;
    }

    public String getType() {
        return type;
    }

    public int getStatusProfileId() {
        return status_profile_id;
    }

    public String getStatus_date() {
        return status_date;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public int getId() {
        return id;
    }

    public AddResponseLevel[] getLevels() {
        return levels;
    }
}
