package ru.spmi.lk.entities.attestations;

public class AttestationSemesterData {
    private int discipline_id;
    private String discipline;
    private AttestationDisciplineData[] data;

    public int getDisciplineId() {
        return discipline_id;
    }

    public String getDiscipline() {
        return discipline;
    }

    public AttestationDisciplineData[] getData() {
        return data;
    }
}
