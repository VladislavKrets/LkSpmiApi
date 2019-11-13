package ru.spmi.lk;

import ru.spmi.lk.authorization.LkSpmi;
import ru.spmi.lk.authorization.LkSpmiAuthorization;
import ru.spmi.lk.entities.disk.Disk;
import ru.spmi.lk.exceptions.NotAuthorizedException;

import java.io.*;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, NotAuthorizedException {

        //System.setProperty("http.proxyHost", "192.168.43.1");
        //System.setProperty("http.proxyPort", "4333");
        //System.setProperty("https.proxyHost", "192.168.43.1");
        //System.setProperty("https.proxyPort", "4333");
        System.setProperty("java.net.useSystemProxies", "true");
        LkSpmiAuthorization authorization = new LkSpmiAuthorization();
        LkSpmi lkSpmi = authorization.authorize("s180275", "7wTlQ4T8");
        Date start = new Date();
        Date end = new Date(System.currentTimeMillis() + 7 * 24 * 60 * 60 * 1000);

        System.out.println(lkSpmi.getSchedules(138, start, end).get(0).getDiscipline());
    }
}
