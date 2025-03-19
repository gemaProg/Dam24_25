package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
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
}
