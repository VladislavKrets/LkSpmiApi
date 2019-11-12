package ru.spmi.lk;

import ru.spmi.lk.authorization.LkSpmi;
import ru.spmi.lk.authorization.LkSpmiAuthorization;
import ru.spmi.lk.entities.attestations.Attestation;
import ru.spmi.lk.entities.bup.Bup;
import ru.spmi.lk.entities.bup.SettingsSectionBup;
import ru.spmi.lk.entities.marks.Mark2;
import ru.spmi.lk.entities.marks.SettingsSectionMarks;
import ru.spmi.lk.entities.profile.ProfileCurrent;
import ru.spmi.lk.exceptions.NotAuthorizedException;
import ru.spmi.lk.rup.Rup;
import ru.spmi.lk.rup.SettingsSectionRup;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, NotAuthorizedException {

        System.setProperty("http.proxyHost", "192.168.43.1");
        System.setProperty("http.proxyPort", "4333");
        System.setProperty("https.proxyHost", "192.168.43.1");
        System.setProperty("https.proxyPort", "4333");

        LkSpmiAuthorization authorization = new LkSpmiAuthorization();
        LkSpmi lkSpmi = authorization.authorize("s180275", "######");
        System.out.println(lkSpmi.searchEmployeesByJob().addEduFullNameFilter("Абакшонок")
                .execute().getItems()[0].getFullname());
    }
}
