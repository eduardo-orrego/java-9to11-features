package org.xuaxpedia.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Logger;

public class HttpClientDemo01 {

    public static void main(String[] args) {

        // Java 11 standardizes the HTTP client introduced in Java 9 as an API in java.net.http,
        // providing a more modern and efficient way to handle requests and responses,
        // supporting HTTP/1.1, HTTP/2, and WebSocket, with improvements in flexibility,
        // asynchronous programming, and efficiency compared to HttpURLConnection.

        Logger logger = Logger.getLogger(HttpClientDemo01.class.getName());

        int statusCode = 0;
        String urlApi = "https://dummyapi.online/api/users/1";

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlApi))
                .GET()
                .header("Accept", "text/html")
                .build();

        HttpResponse<String> response = null;
        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            statusCode = response.statusCode();
        } catch (IOException | InterruptedException e) {
            logger.warning("Interrupted!\n" + e);
            Thread.currentThread().interrupt();
        }

        if (statusCode == 200) {
            String body = response.body();
            System.out.println("Response:\n" + body);
        } else {
            System.out.println("Error: Status Code " + statusCode);
        }

    }
}
