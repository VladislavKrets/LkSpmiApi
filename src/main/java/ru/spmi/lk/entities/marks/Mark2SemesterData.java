package ru.spmi.lk.entities.marks;

public class Mark2SemesterData {
    private int semester;
    private String date;
    private int year;
    private String hours;
    private String control_type;
    private int mark;
    private String mark_title;
    private int scale;
    private String subject;
    private String subject_type;
    private String zet;
    private String lecturers;

    public int getSemester() {
        return semester;
    }

    public String getDate() {
        return date;
    }

    public int getYear() {
        return year;
    }

    public String getHours() {
        return hours;
    }

    public String getControlType() {
        return control_type;
    }

    public int getMark() {
        return mark;
    }

    public String getMarkTitle() {
        return mark_title;
    }

    public int getScale() {
        return scale;
    }

    public String getSubject() {
        return subject;
    }

    public String getSubjectType() {
        return subject_type;
    }

    public String getZet() {
        return zet;
    }

    public String getLecturers() {
        return lecturers;
    }
}
