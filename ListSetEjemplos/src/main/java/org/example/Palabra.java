/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.util.Objects;

/**
 * @author gema
 */
public class Palabra implements Comparable<Palabra> {
    private int id;
    private int nivel;
    private String categoriaString;
    private String adivinarString;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getCategoriaString() {
        return categoriaString;
    }

    public void setCategoriaString(String categoriaString) {
        this.categoriaString = categoriaString;
    }

    public String getAdivinarString() {
        return adivinarString;
    }

    public void setAdivinarString(String adivinarString) {
        this.adivinarString = adivinarString;
    }

    public Palabra(int id, int nivel, String categoriaString, String adivinarString) {
        this.id = id;
        this.nivel = nivel;
        this.categoriaString = categoriaString;
        this.adivinarString = adivinarString;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" + "id=" + id + ", nivel=" + nivel + ", categoriaString=" + categoriaString + ", adivinarString=" + adivinarString + '}';
    }

    public String toStringFichero() {
        return id + ";" + nivel + ";" + categoriaString + ";" + adivinarString;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        return hash;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Palabra palabra = (Palabra) o;
        return id == palabra.id && nivel == palabra.nivel && Objects.equals(categoriaString, palabra.categoriaString) && Objects.equals(adivinarString, palabra.adivinarString);
    }

    @Override
    public int compareTo(Palabra o) {
        return this.adivinarString.compareTo(o.adivinarString);
        //return Integer.compare(this.id, o.id);
    }

}
