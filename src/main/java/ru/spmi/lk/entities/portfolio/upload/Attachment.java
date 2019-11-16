package ru.spmi.lk.entities.portfolio.upload;

public class Attachment {
    private String name; //filename
    private String tempName; //temp_url
    private boolean deleted = false;
    private int id; //in array
    private String type; //file type сертификат свидетельство..
    private boolean valid = false;
    private boolean isUrl = false;

    public Attachment() {
    }

    public Attachment(String name, String tempName, int id, String type) {
        this.name = name;
        this.tempName = tempName;
        this.id = id;
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public int getId() {
        return id;
    }

    public boolean isValid() {
        return valid;
    }

    public boolean isUrl() {
        return isUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTempName() {
        return tempName;
    }

    public void setTempName(String tempName) {
        this.tempName = tempName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
