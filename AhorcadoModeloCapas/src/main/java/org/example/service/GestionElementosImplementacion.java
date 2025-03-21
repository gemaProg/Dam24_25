package org.example.service;

import org.example.dao.DaoElementos;
import org.example.dao.DaoElementosImplementacion;
import org.example.domain.Elemento;

import java.io.IOException;
import java.util.List;

public class GestionElementosImplementacion implements GestionElementos{
    private DaoElementos daoElementos;

    public GestionElementosImplementacion(DaoElementos daoElementos) {
        this.daoElementos = daoElementos;
    }

    public GestionElementosImplementacion() {
        this.daoElementos = new DaoElementosImplementacion();
    }

    @Override
    public boolean isEmptyElementosList() {
        return false;
    }

    @Override
    public List<Elemento> getListaElementos() {
        return  daoElementos.getElementos();
    }

    @Override
    public boolean insertarElemento(Elemento Elemento) {
        return daoElementos.insertarElemento(Elemento);
    }

    @Override
    public List<Elemento> listar(String categoria) {
        return List.of();
    }

    @Override
    public List<Elemento> listarElementos(boolean ascendente) {
        return List.of();
    }

    @Override
    public boolean modificarElemento(String id, String incognita) {
        return false;
    }

    @Override
    public List<Elemento> getListaElementosCategoria() {
        return List.of();
    }

    @Override
    public void eliminarElemento(Elemento Elemento) {

    }

    @Override
    public void crearFicheros() throws IOException {

    }

    @Override
    public boolean cargarFichero() throws IOException {
        return false;
    }

    @Override
    public boolean escribirFichero() {
        return false;
    }

    @Override
    public boolean escribirFicheroBinario() {
        return false;
    }

    @Override
    public boolean cargarFicheroBinario() {
        return false;
    }

    @Override
    public boolean eliminarElemento(String id) {
        return false;
    }
}
