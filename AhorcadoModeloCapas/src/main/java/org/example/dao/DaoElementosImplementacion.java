package org.example.dao;

import org.example.domain.Elemento;

import java.util.List;

public class DaoElementosImplementacion implements DaoElementos {
    private Elementos lista;
    @Override
    public boolean isEmptyElementosList() {
        return false;
    }

    @Override
    public boolean insertarElemento(Elemento Elemento) {
        return false;
    }

    @Override
    public boolean insertarElemento(int id, String palabra, String categoria) {
        return false;
    }

    @Override
    public List<Elemento> getElementosCategoria(String categoria) {
        return List.of();
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
}
