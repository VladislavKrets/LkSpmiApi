package ru.spmi.lk.authorization;

import ru.spmi.lk.exceptions.NotAuthorizedException;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

public class LkSpmiAuthorization {
    private static final String COOKIES_HEADER = "Set-Cookie";
    static java.net.CookieManager msCookieManager = new java.net.CookieManager();
    private String cookies;

    public LkSpmi authorize(String login, String password) throws IOException, NotAuthorizedException {
        String urlParameters  = "AUTH_FORM=Y" +
                "&TYPE=AUTH" +
                "&backurl=%2Findex.php" +
                "&USER_LOGIN=" + login +
                "&USER_PASSWORD=" + password;
        byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);
        int postDataLength = postData.length;
        String request = "https://lk.spmi.ru/index.php?login=yes";
        URL url = new URL(request);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setDoOutput(true);
        conn.setInstanceFollowRedirects(false);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setRequestProperty("charset", "utf-8");
        conn.setRequestProperty("Content-Length", Integer.toString( postDataLength ));
        conn.setUseCaches(false);
        try(DataOutputStream wr = new DataOutputStream( conn.getOutputStream())) {
            wr.write(postData);
        }


        Map<String, List<String>> headerFields = conn.getHeaderFields();
        List<String> cookiesHeader = headerFields.get(COOKIES_HEADER);

        if (cookiesHeader != null) {
            for (String cookie : cookiesHeader) {
                msCookieManager.getCookieStore().add(null, HttpCookie.parse(cookie).get(0));
            }
        }


        StringBuilder sb = new StringBuilder();
        if (msCookieManager.getCookieStore().getCookies().size() > 0) {
            List<HttpCookie> cookieList = msCookieManager.getCookieStore().getCookies();
            sb.append(cookieList.get(0));
            for (int i = 1; i < cookieList.size(); i++){
                sb.append(";").append(cookieList.get(i));
            }
            cookies = sb.toString();
        }
        else throw new NotAuthorizedException("Something get wrong due your authorization");

        return new LkSpmi(cookies);
    }
}
