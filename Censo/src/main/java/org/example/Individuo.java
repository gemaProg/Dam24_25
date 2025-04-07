/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author GEMA
 */
public class Individuo implements Serializable, Comparable<Individuo>{
    protected int edad;
    protected String nombre;
    protected String poblacion;

    public Individuo(int edad, String nombre, String poblacion) {
        this.edad = edad;
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Individuo individuo = (Individuo) o;
        return edad == individuo.edad && Objects.equals(nombre, individuo.nombre) && Objects.equals(poblacion, individuo.poblacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edad, nombre, poblacion);
    }

    @Override
    public String toString() {
        return String.format("%-15s %4d %15s ",nombre, edad, poblacion);
    }

    public String toStringFichero() {
        return edad + ";" + nombre + ";" + poblacion;
    }

    public String toNombreEdad(){
        return String.format("%-12s %2d",nombre, edad);
    }



    public void imprimir(){
        System.out.println(nombre+ "     "+ edad);
    }


    @Override
    public int compareTo(Individuo o) {
        return this.nombre.compareTo(o.nombre);
    }
}
