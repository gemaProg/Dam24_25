package org.example;

import java.io.Serializable;
import java.util.Random;

public class Mascota implements Comparable<Mascota>, Serializable {
    private String nombre;
    private int edad;
    private String especie;

    public Mascota() {
        Random random = new Random();
        this.nombre = Constantes.NOMBRES[random.nextInt(Constantes.NOMBRES.length)];
        this.edad = random.nextInt(15);
        this.especie = Constantes.ESPECIE[random.nextInt(Constantes.ESPECIE.length)];;
    }
    public Mascota(String linea){
        String[] tokens = linea.split(";");
        this.nombre = tokens[0];
        this.edad = Integer.parseInt(tokens[1]);
        this.especie = tokens[2];
    }
    public Mascota(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", especie='" + especie + '\'' +
                '}'+"\n";
    }

    /*public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre);
        sb.append(";");
        sb.append(edad);
        sb.append(";");
        sb.append(especie);
        sb.append("\n");
        return sb.toString();
    }*/

    public String toStringFichero() {
        return nombre + ';' + edad + ';'+ especie;
    }

    @Override
    public int compareTo(Mascota mascota) {
        return this.nombre.compareTo(mascota.nombre);
        //return this.especie.compareTo(mascota.especie);
        //return Integer.compare(this.getEdad(), mascota.getEdad());
    }
}
