package org.example;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PokemonFetcher {
    public static void main(String[] args) {
        try {
            // URL de la PokeAPI para obtener la lista de Pokémon
            URL url = new URL("https://pokeapi.co/api/v2/pokemon?limit=1000"); // Puedes aumentar el límite si es necesario

            // Crear la conexión HTTP
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

            // Imprimir la respuesta
            System.out.println(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
