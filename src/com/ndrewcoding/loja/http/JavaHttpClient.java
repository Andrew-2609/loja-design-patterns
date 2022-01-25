package com.ndrewcoding.loja.http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL urlApi = new URL(url);
            URLConnection connection = urlApi.openConnection();
            connection.connect();
        } catch (Exception e) {
            throw new RuntimeException("Ocorreu um erro durante o envio da requisição HTTP:", e);
        }
    }

}
