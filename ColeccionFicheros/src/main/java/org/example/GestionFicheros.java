package org.example;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionFicheros {
    public static void escribirFichero(String fichero, List<Mascota> lista) {
        PrintWriter escribir = null;
        //escribir = new PrintWriter("C:\\Users\\gema\\IdeaProjects\\SegundaEvaluacion\\ColeccionFicheros\\Mascotas.txt");
        try {
            escribir = new PrintWriter(fichero);
            for (int i = 0; i < lista.size(); i++)
                escribir.println(lista.get(i).toStringFichero());
            escribir.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se puede escribir el fichero, no se ha encontrado");
        }
    }

    public static void escribirFicheroFW(String fichero, List<Mascota> lista) {
        FileWriter escribir = null;
        //escribir = new PrintWriter("C:\\Users\\gema\\IdeaProjects\\SegundaEvaluacion\\ColeccionFicheros\\Mascotas.txt");
        try {
            escribir = new FileWriter(fichero, true);
            for (int i = 0; i < lista.size(); i++)
                escribir.write(String.format("%s\n", lista.get(i).toStringFichero()));
            escribir.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void escribirFicheroPWFW(String fichero, List<Mascota> lista) {
        PrintWriter escribir = null;
        //escribir = new PrintWriter("C:\\Users\\gema\\IdeaProjects\\SegundaEvaluacion\\ColeccionFicheros\\Mascotas.txt");
        try {
            escribir = new PrintWriter(new FileWriter(fichero, true));
            for (int i = 0; i < lista.size(); i++)
                escribir.printf("%s\n", lista.get(i).toStringFichero());
            escribir.close();
        } catch (IOException e) {
            System.out.println("Error de E/S");
        }

    }

    public static List<Mascota> leerFichero(String fichero) {
        List<Mascota> lista = new ArrayList<Mascota>();
        try {
           /* File f = new File(fichero);
            Scanner lector = new Scanner(f);*/
            Scanner lector = new Scanner(new File(fichero));
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                /*String[] tokens = linea.split(";");
                String nombre = tokens[0];
                int edad = Integer.parseInt(tokens[1]);
                String especie = tokens[2];
                lista.add(new Mascota(nombre, edad, especie));*/
                lista.add(new Mascota(linea));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            ;
        }
        return lista;

    }

    public static List<Mascota> leerFicheroBRFR(String fichero) {
        List<Mascota> lista = new ArrayList<Mascota>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            /*String linea= br.readLine();
            while (linea!=null) {
                lista.add(new Mascota(linea));
                linea = br.readLine();
            }*/
            String linea = null;
            while ((linea= br.readLine())!=null){
                lista.add(new Mascota(linea));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

    public static void escribirFicheroBinario(String fichero, List<Mascota> lista) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fichero));
            os.writeObject(lista);
            os.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Mascota> leerFicheroBinario(String fichero) {
        List<Mascota> lista = null;
        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream(fichero));
            lista = (List<Mascota>) os.readObject();
            os.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }


}
