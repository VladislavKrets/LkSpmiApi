package ru.spmi.lk.entities.rup;

public class RupSemester {
    private int semester;
    private RupSemesterSection[] sections;

    public int getSemester() {
        return semester;
    }

    public RupSemesterSection[] getSections() {
        return sections;
    }
}
