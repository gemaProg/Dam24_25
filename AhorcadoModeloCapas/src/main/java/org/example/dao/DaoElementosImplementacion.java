package org.example.dao;

import org.example.domain.Elemento;

import java.util.List;
import java.util.Random;

public class DaoElementosImplementacion implements DaoElementos {
    private Elementos lista;

    public DaoElementosImplementacion(Elementos lista) {
        this.lista = lista;
    }

    public DaoElementosImplementacion() {
        lista = new Elementos();
    }

    @Override
    public boolean isEmptyElementosList() {
        return false;
    }

    @Override
    public boolean insertarElemento(Elemento Elemento) {
        //return lista.getListaElementos().add(Elemento);
        return lista.insertarElemento(Elemento);
    }

    @Override
    public boolean insertarElemento(int id, String palabra, String categoria) {
        return false;
    }

    @Override
    public List<Elemento> getElementos() {
        return lista.getListaElementos();
    }

    @Override
    public List<Elemento> getElementosCategoria(String categoria) {
        return lista.getListaElementosCategoria(categoria);
    }

    @Override
    public List<Elemento> listadoOrdenado(boolean ascendente) {
        return List.of();
    }

    @Override
    public boolean modificarCategoria(int id, String categoria) {
        return false;
    }

    @Override
    public boolean modificarElemento(int id, String palabra) {
        return false;
    }

    @Override
    public void eliminarElemento(Elemento Elemento) {

    }

    @Override
    public boolean eliminarElemento(int id) {
        return false;
    }

    @Override
    public String getPalabraAdivinar(String categoria) {
        Random random = new Random();
        System.out.println(getElementosCategoria(categoria).size());
        System.out.println(getElementosCategoria(categoria));
        return getElementosCategoria(categoria).get(random.nextInt(0,getElementosCategoria(categoria).size())).getPalabra();
    }
}
