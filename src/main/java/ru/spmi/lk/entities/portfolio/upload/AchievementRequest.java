package ru.spmi.lk.entities.portfolio.upload;

public class AchievementRequest {
    private int rating_id;
    private String description;
    private String date;
    private String date_end;
    private Attachment[] attachments;
    private int[] levels;
    private boolean public_files;
    private int criterion_id;
    private int year;
    private int user_id;
    private int semester;

    public void setRatingId(int rating_id) {
        this.rating_id = rating_id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDateEnd(String date_end) {
        this.date_end = date_end;
    }

    public void setAttachments(Attachment[] attachments) {
        this.attachments = attachments;
    }

    public void setLevels(int[] levels) {
        this.levels = levels;
    }

    public void setPublicFiles(boolean public_files) {
        this.public_files = public_files;
    }

    public void setCriterionId(int criterion_id) {
        this.criterion_id = criterion_id;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
