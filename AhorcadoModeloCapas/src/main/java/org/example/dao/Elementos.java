package org.example.dao;

import net.datafaker.Faker;
import org.example.domain.Elemento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Elementos {
    private final List<Elemento> listaElementos;

    public Elementos(List<Elemento> listaElementos) {
        this.listaElementos = listaElementos;
    }

    public Elementos() {
        this.listaElementos = new ArrayList<Elemento>();
        //for y crear para cada categoria unos cuantos elementos
        /*for (int i = 0; i < 5; i++) {
            listaElementos.add(new Elemento());
        }*/
        Random random = new Random();
        String categoria = "movies";
        for (int i = 0; i < 5; i++) {
            listaElementos.add(new Elemento());
        }
        categoria = "personajesTheBigBangTheory";
        for (int i = 0; i < 5; i++) {
            listaElementos.add(new Elemento(String.valueOf(random.nextInt(100)), new Faker().bigBangTheory().character(), categoria));
        }

    }

    public List<Elemento> getListaElementos() {
        return listaElementos;
        //por seguridad puedo devolver otro arrayList con los mismos elementos
        //return new ArrayList<>(listaElementos);
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

    public boolean insertarElemento(Elemento elemento) {
        return listaElementos.add(elemento);
    }


    public List<Elemento> getListaElementosCategoria(String categoria) {

        return null;
    }
}
