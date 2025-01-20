package org.example;

public class Tester {
    public static void main(String[] args) {
        System.out.println("=== Prueba de la clase Triángulo ===");
        TrianguloEquilatero triangulo = new TrianguloEquilatero();
        System.out.println(triangulo);

        System.out.println("\n=== Prueba de la clase Círculo ===");
        Circulo circulo = new Circulo();
        System.out.println(circulo.toString());


        System.out.println("\n=== Prueba de la clase Cuadrado ===");
        Cuadrado cuadrado = new Cuadrado();
        System.out.println(cuadrado);

    }
}
