package com.market.http;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by litienan on 2017/5/10.
 */

public class HttpTools {

    private static String onLine_URL = "http://api.m.mtime.cn/PageSubArea/TrailerList.api";
    private static OkHttpClient client = new OkHttpClient();

    public static String getUrl() throws IOException {
        Request request = new Request.Builder()
                .url(onLine_URL).build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public static String postUrl() throws IOException {
//        RequestBody body = RequestBody.create()
        return "";
    }

}
