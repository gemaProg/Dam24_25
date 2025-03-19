package org.example.dao;

import org.example.domain.Elemento;

import java.util.List;

public interface DaoElementos {
    public boolean isEmptyElementosList() ;
    public boolean insertarElemento(Elemento Elemento) ;
    public boolean insertarElemento(int id, String palabra, String categoria);
    public List<Elemento> getElementos();
    public List<Elemento> getElementosCategoria(String categoria);
    public List<Elemento> listadoOrdenado(boolean ascendente);
    public boolean modificarCategoria(int id, String categoria);
    public boolean modificarElemento(int id, String palabra);
    public void eliminarElemento(Elemento Elemento) ;
    public boolean eliminarElemento(int id) ;
    }
