package ru.spmi.lk.entities.portfolio;

public class AchievementAttachment {
    private int id;
    private Integer external_id;
    private String section_type;
    private int section_id;
    private String name;
    private String path;
    private String type;
    private int order;
    private String created_at;
    private String updated_at;
    private String thumbnail;
    private String thumbnail_custom;
    private String original;
    private String mime;
    private int size;
    private String md5;
    private boolean is_url;

    public int getId() {
        return id;
    }

    public Integer getExternalId() {
        return external_id;
    }

    public String getSectionType() {
        return section_type;
    }

    public int getSectionId() {
        return section_id;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public String getType() {
        return type;
    }

    public int getOrder() {
        return order;
    }

    public String getCreatedAt() {
        return created_at;
    }

    public String getUpdatedAt() {
        return updated_at;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getThumbnailCustom() {
        return thumbnail_custom;
    }

    public String getOriginal() {
        return original;
    }

    public String getMime() {
        return mime;
    }

    public int getSize() {
        return size;
    }

    public String getMd5() {
        return md5;
    }

    public boolean isUrl() {
        return is_url;
    }
}
