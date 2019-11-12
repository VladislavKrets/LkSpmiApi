package ru.spmi.lk.entities.attestations;

public class Attestation {
    private int year;
    private String edu_year;
    private AttestationSemester[] semesters;

    public int getYear() {
        return year;
    }

    public String getEduYear() {
        return edu_year;
    }

    public AttestationSemester[] getSemesters() {
        return semesters;
    }
}
