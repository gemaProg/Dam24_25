package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mascotas misMascotas = new Mascotas();
        System.out.println(misMascotas);
        //misMascotas.listar("gato");
        misMascotas.ordenar();
        System.out.println(misMascotas);

    }
}