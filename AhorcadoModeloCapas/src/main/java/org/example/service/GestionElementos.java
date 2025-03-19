package org.example.service;

import org.example.domain.Elemento;

import java.io.IOException;
import java.util.List;

public interface GestionElementos {
    public boolean isEmptyElementosList();
    public List<Elemento> getListaElementos();
    public boolean insertarElemento(Elemento Elemento);
    public List<Elemento> listar(String categoria);
    public List<Elemento> listarElementos(boolean ascendente);
    public boolean modificarElemento(String id, String incognita);
    public List<Elemento> getListaElementosCategoria();
    public void eliminarElemento(Elemento Elemento);
    public void crearFicheros()throws IOException;
    public boolean cargarFichero() throws IOException;
    public boolean escribirFichero();
    public boolean escribirFicheroBinario();
    public boolean cargarFicheroBinario();
    public boolean eliminarElemento(String id);
}
