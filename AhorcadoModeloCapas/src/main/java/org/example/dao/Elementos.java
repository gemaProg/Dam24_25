package org.example.dao;

import org.example.domain.Elemento;

import java.util.ArrayList;
import java.util.List;

public class Elementos {
    private final List<Elemento> listaElementos;

    public Elementos(List<Elemento> listaElementos) {
        this.listaElementos = listaElementos;
    }
    public Elementos(){
        this.listaElementos = new ArrayList<Elemento>();
    }

    public List<Elemento> getListaElementos() {
        return listaElementos;
    }
    public void vaciarListaElementos(List<Elemento> listaElementos) {
        listaElementos.clear();
        this.listaElementos.addAll(listaElementos);
    }

    @Override
    public String toString() {
        return "Elementos{" +
                "listaElementos=" + listaElementos +
                '}';
    }
}
