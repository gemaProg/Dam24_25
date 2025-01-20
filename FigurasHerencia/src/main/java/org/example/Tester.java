package org.example;

public class Tester {
    public static void main(String[] args) {
        /*System.out.println("=== Prueba de la clase Triángulo ===");
        TrianguloEquilatero triangulo = new TrianguloEquilatero();
        System.out.println(triangulo);

        System.out.println("\n=== Prueba de la clase Círculo ===");
        Circulo circulo = new Circulo();
        System.out.println(circulo.toString());


        System.out.println("\n=== Prueba de la clase Cuadrado ===");
        Cuadrado cuadrado = new Cuadrado();
        System.out.println(cuadrado);*/
        Figuras figuras = new Figuras(5);
        System.out.println(figuras);
        int respuesta =figuras.eliminarFigura(3);
        if (respuesta == 1)
            System.out.printf("No había figura en esa posicion");
        else if (respuesta==2)
            System.out.printf("Figura eliminada correctamente");
        else
            System.out.printf("Posicion no está dentro del array");
        System.out.println(figuras);
    }
}
