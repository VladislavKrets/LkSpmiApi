package ru.spmi.lk.entities.bup;

public class Bup {
    private int id;
    private String sync_id;
    private String external_id;
    private String title;
    private String number;
    private BupSection[] sections;
    private BupPivot pivot;

    public int getId() {
        return id;
    }

    public String getSyncId() {
        return sync_id;
    }

    public String getExternalId() {
        return external_id;
    }

    public String getTitle() {
        return title;
    }

    public String getNumber() {
        return number;
    }

    public BupSection[] getSections() {
        return sections;
    }

    public BupPivot getPivot() {
        return pivot;
    }
}
