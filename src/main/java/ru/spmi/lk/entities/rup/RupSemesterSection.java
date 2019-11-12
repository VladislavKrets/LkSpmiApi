package ru.spmi.lk.entities.rup;

public class RupSemesterSection {
    private int id;
    private String sync_id;
    private String external_id;
    private int rup_id;
    private int parent_id;
    private String title;
    private String num;
    private String type;
    private Integer hours;
    private String zet;
    private int level;
    private int[] sub_terms;
    private int subjects;
    private RupSemesterSectionTerm[] terms;

    public int getId() {
        return id;
    }

    public String getSyncId() {
        return sync_id;
    }

    public String getExternalId() {
        return external_id;
    }

    public int getRupId() {
        return rup_id;
    }

    public int getParent_id() {
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

    public Integer getHours() {
        return hours;
    }

    public String getZet() {
        return zet;
    }

    public int getLevel() {
        return level;
    }

    public int[] getSub_terms() {
        return sub_terms;
    }

    public int getSubjects() {
        return subjects;
    }

    public RupSemesterSectionTerm[] getTerms() {
        return terms;
    }
}
