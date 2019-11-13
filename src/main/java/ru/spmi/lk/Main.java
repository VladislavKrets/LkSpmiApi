package ru.spmi.lk;

import ru.spmi.lk.authorization.LkSpmi;
import ru.spmi.lk.authorization.LkSpmiAuthorization;
import ru.spmi.lk.entities.disk.Disk;
import ru.spmi.lk.exceptions.NotAuthorizedException;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, NotAuthorizedException {

        System.setProperty("http.proxyHost", "192.168.43.1");
        System.setProperty("http.proxyPort", "4333");
        System.setProperty("https.proxyHost", "192.168.43.1");
        System.setProperty("https.proxyPort", "4333");

        LkSpmiAuthorization authorization = new LkSpmiAuthorization();
        LkSpmi lkSpmi = authorization.authorize("s180275", "#####");

        String link = lkSpmi.getDisk().get(0).getLink();
        List<Disk> list = lkSpmi.getDisk(link);
        for (Disk disk : list){
            if (disk.isFile()){
                lkSpmi.downloadFile(disk.getId(), disk.getName(), null);
            }

        }
    }
}
