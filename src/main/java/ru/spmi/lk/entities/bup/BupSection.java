package ru.spmi.lk.entities.bup;

public class BupSection {
    private int id;
    private String sync_id;
    private String external_id;
    private int bup_id;
    private int parent_id;
    private String title;
    private String num;
    private String type;
    private Integer exam;
    private Integer test;
    private Integer testdif;
    private Integer kp;
    private Integer kr;
    private Integer testwork;
    private Integer hours;
    private Integer labs;
    private Integer lections;
    private Integer practice;
    private Integer self;
    private String sem;
    private String zet;
    private Integer level;
    private Integer subjects;

    public int getId() {
        return id;
    }

    public String getSyncId() {
        return sync_id;
    }

    public String getExternalId() {
        return external_id;
    }

    public int getBupId() {
        return bup_id;
    }

    public int getParentId() {
        return parent_id;
    }

    public String getTitle() {
        return title;
    }

    public String getNum() {
        return num;
    }

    public String getType() {
        return type;
    }

    public Integer getExam() {
        return exam;
    }

    public Integer getTest() {
        return test;
    }

    public Integer getTestdif() {
        return testdif;
    }

    public Integer getKp() {
        return kp;
    }

    public Integer getKr() {
        return kr;
    }

    public Integer getTestwork() {
        return testwork;
    }

    public Integer getHours() {
        return hours;
    }

    public Integer getLabs() {
        return labs;
    }

    public Integer getLections() {
        return lections;
    }

    public Integer getPractice() {
        return practice;
    }

    public Integer getSelf() {
        return self;
    }

    public String getSem() {
        return sem;
    }

    public String getZet() {
        return zet;
    }

    public Integer getSubjects() {
        return subjects;
    }

    public Integer getLevel() {
        return level;
    }
}
