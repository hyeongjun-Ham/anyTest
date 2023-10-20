package org.example;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallThread {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            executor.execute(() -> {
                sendApiRequest();
            });
        }

        executor.shutdown();
    }

    public static void sendApiRequest() {
        String apiUrl = "http://192.168.0.78:8080/ds_api/login/auth"; // Replace with your API URL

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            String jsonInputString = "{\n" +
                    "  \"encAccountPassword\": \"834e96a239196273774982e246f54ca83f23926126c86aa9f7727295264f9d611cb516c139a71d960fb3dde9ecf4fd58b01454d2078d0e414d526c042cc709525caca76c30f9883683ecfd12064fc3920ea7e30cdfb9522ed413a4714ab712702035efa2537350bd93213faebaab26f8b1a22358a0f6e67201156c3b94f73213a17160962c49e7e8a801222f53e78bd8ed9d97786298111e848ca0415bee8e7f69d1cb5c1bd431565e1929f00da668c446d5f6285bbf0e548de578a69a79b4698d57ffc1caf42e3b238cfc8822e5122d09c94d257460164eaf9f4c9c08f54e4d9a5b341be543411b6ef233cd8af5142c9352b9f71d5400643aed32e910f05811\",\n" +
                    "  \"encAccountUserName\": \"5924694934be9d64af53d22fc35525e82d847cc8a3bfe27fd0d19e7d5f3843f0f459ba9b1e18f1e3d3b1309156e91f9399b2ccd5a9443ee855e9b3ad44be556c0d2218d84cb865d6886f2b075863317331fdef938f76875744bf02f6795e4802ede227ea9d8a3e3c184b1c09904e79cfafe9cfad1d8a15206f07052ac57723e6ccd19eb069f4e9afdab884a589565290f96434c303863aa51941583ba42d6a13aebdc679351ac15c23c348818aa6b443e4f42631c274ed74d15c85d088359995d903940edcf0c694da7d5f7796e59ad2bc27e23b805d0df8f9b5545220614bb05dafad850fa6f51c6c2892e2b3bd5e0a695459c4d7b206989c37472044d017c4\",\n" +
                    "  \"step\": 0,\n" +
                    "  \"userName\": \"null\"\n" +
                    "}";

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
