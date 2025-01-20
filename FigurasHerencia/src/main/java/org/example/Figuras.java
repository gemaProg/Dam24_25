package org.example;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class Figuras {
    private Figura lista[];
    public Figuras() {
        this(15);
    }
    public Figuras(int tamanyo) {
        lista = new Figura[tamanyo];
        Random random=new Random();
        for (int i = 0; i < lista.length; i++) {
            int dado = random.nextInt(3);
            if (dado==0)
                lista[i]= new Circulo();
            else if (dado==1)
                lista[i]= new Cuadrado();
            else
                lista[i]= new TrianguloEquilatero();
        }

    }
    /*
    System.out.println("G1. Mostrar el array");
    System.out.println("G2. Agregar una figura en la lista");
    System.out.println("G3. Eliminar una figura de la lista");
    * */
    public boolean agregarFigura (Figura figura){
        //buscar hueco y meter figura
        return false;
    }
    public int eliminarFigura (int posicion){
        int respuesta=0; //posicion no está dentro de los límites del array
        if (posicion>=0 && posicion<lista.length && lista[posicion]!=null){
            lista[posicion]=null;
            respuesta=2; //figura eliminada correctamente
        }else if (lista[posicion]==null){
            respuesta=1; // no había figura
        }
        return respuesta;
    }
    @Override
    public String toString() {
        return "Figuras{" +
                "lista=" + Arrays.toString(lista) +
                '}';
    }
}
