package ru.spmi.lk.entities.rup;

public class RupSemesterSectionTerm {
    private int id;
    private String sync_id;
    private String external_id;
    private int rup_section_id;
    private Integer num;
    private Integer exam;
    private Integer test;
    private Integer testdif;
    private Integer kp;
    private Integer kr;
    private Integer testwork;
    private Integer labs;
    private Integer lections;
    private Integer practice;
    private Integer self;
    private Integer practice_lecturer_id;
    private Integer lections_lecturer_id;
    private Integer labs_lecturer_id;

    public int getId() {
        return id;
    }

    public String getSyncId() {
        return sync_id;
    }

    public String getExternalId() {
        return external_id;
    }

    public int getRup_sectionId() {
        return rup_section_id;
    }

    public Integer getNum() {
        return num;
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

    public Integer getPracticeLecturerId() {
        return practice_lecturer_id;
    }

    public Integer getLectionsLecturerId() {
        return lections_lecturer_id;
    }

    public Integer getLabsLecturerId() {
        return labs_lecturer_id;
    }
}
