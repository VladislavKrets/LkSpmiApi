package ru.spmi.lk.entities.rup;

public class Rup {
    private int id;
    private String sync_id;
    private String external_id;
    private String title;
    private String number;
    private RupSemester[] semesters;
    private RupPivot pivot;

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

    public RupSemester[] getSemesters() {
        return semesters;
    }

    public RupPivot getPivot() {
        return pivot;
    }
}
