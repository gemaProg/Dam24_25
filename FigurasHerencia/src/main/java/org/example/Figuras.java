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

    public boolean agregarFigura (Figura figura){
        //buscar hueco y meter figura
        boolean introducido=false;
        for (int i = 0; i < lista.length && !introducido; i++) {
            if (lista[i]==null) {
                lista[i] = figura;
                introducido = true;
            }
        }
        return introducido;
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

    /**
     *
     * @param posicion
     * @return
     */
    public boolean eliminarFigura2 (int posicion){
        boolean respuesta=false;
        if (lista[posicion]!=null) {
            lista[posicion] = null;
            respuesta = true; //figura eliminada correctamente
        }
        return respuesta;
    }
    @Override
    public String toString() {
        return "Figuras{" +
                "lista=" + Arrays.toString(lista) +
                '}';
    }
    public void mostrar(){
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]!=null)
                System.out.println(lista[i]);
            else
                System.out.println("Vacía");
        }
    }

    public int getTamanyo() {
        return lista.length;
    }


    public boolean modificarFigura(int posicion2, double dato) {
        boolean modificado= false;
        if (lista[posicion2]!=null){
            lista[posicion2].setDimension(dato);
            modificado=true;
        }
        return modificado;
    }

    /**
     * Método que permite modificar el color de un círculo
     * @param posicion2 identifica la posición del círculo a actualizar en la lista de figuras
     * @param color color actualizado
     * @return true si el cículo ha sido actualizado con éxito
     */
    public boolean modificarFiguraEspecifico(int posicion2, String color) {
        boolean modificado= false;
       // if (lista[posicion2]!=null && lista[posicion2].getClass().getSimpleName().equalsIgnoreCase("Circulo")){
        if (lista[posicion2]!=null && lista[posicion2] instanceof Circulo){
            ((Circulo) lista[posicion2]).setColor(color);
            modificado=true;
        }
        return modificado;
    }
}
