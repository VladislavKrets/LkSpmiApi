package ru.spmi.lk.entities.attestations;

public class AttestationSemester {
    private int semester;
    private AttestationSemesterData[] data;

    public int getSemester() {
        return semester;
    }

    public AttestationSemesterData[] getData() {
        return data;
    }
}
