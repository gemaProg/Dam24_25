package org.example;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.json.JSONObject;
import org.json.JSONArray;

public class MarvelAPI {
    public static void main(String[] args) {
        try {
            String publicKey = "TU_CLAVE_PUBLICA"; // Coloca tu clave pública aquí
            String privateKey = "TU_CLAVE_PRIVADA"; // Coloca tu clave privada aquí

            // Crear un timestamp y un hash MD5
            String ts = String.valueOf(System.currentTimeMillis()); // Timestamp actual
            String hash = md5(ts + privateKey + publicKey); // Generar hash MD5

            // URL para obtener los personajes de Marvel
            String urlStr = "https://gateway.marvel.com/v1/public/characters?ts=" + ts + "&apikey=" + publicKey + "&hash=" + hash;
            URL url = new URL(urlStr);

            // Conexión HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Leer la respuesta de la API
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Convertir la respuesta a un objeto JSON
            JSONObject jsonResponse = new JSONObject(response.toString());
            JSONArray results = jsonResponse.getJSONObject("data").getJSONArray("results");

            // Imprimir los nombres de los personajes
            for (int i = 0; i < results.length(); i++) {
                String characterName = results.getJSONObject(i).getString("name");
                System.out.println(characterName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para generar el hash MD5
    private static String md5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hashBytes = md.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}