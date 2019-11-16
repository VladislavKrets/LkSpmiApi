package ru.spmi.lk;

import ru.spmi.lk.authorization.LkSpmi;
import ru.spmi.lk.authorization.LkSpmiAuthorization;
import ru.spmi.lk.entities.portfolio.upload.AddResponse;
import ru.spmi.lk.entities.portfolio.upload.Attachment;
import ru.spmi.lk.entities.portfolio.upload.UploadResponse;
import ru.spmi.lk.entities.profile.ProfileCurrent;
import ru.spmi.lk.exceptions.NotAuthorizedException;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NotAuthorizedException {

        System.setProperty("http.proxyHost", "192.168.43.1");
        System.setProperty("http.proxyPort", "4333");
        System.setProperty("https.proxyHost", "192.168.43.1");
        System.setProperty("https.proxyPort", "4333");
        //System.setProperty("java.net.useSystemProxies", "true");
        LkSpmiAuthorization authorization = new LkSpmiAuthorization();
        LkSpmi lkSpmi = authorization.authorize("s180275", "#####");
        ProfileCurrent current = lkSpmi.getProfileCurrent();
    }
}
