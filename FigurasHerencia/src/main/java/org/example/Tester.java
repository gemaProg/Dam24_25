package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tester {
    public static Figura dameFigura(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca opcion: \n" +
                "1. Cuadrado\n" +
                "2. Circulo\n" +
                "3. Triangulo Equilatero\n");
        int tipo = lector.nextInt();
        Figura figura = null;
        switch (tipo) {
            case 1:
                System.out.println("Introduzca el valor del lado");
                double lado = lector.nextDouble();
                figura = new Cuadrado(lado);
                break;
            case 2:
                System.out.println("Introduzca el valor del radio");
                double radio = lector.nextDouble();
                figura = new Circulo(radio);
                break;
            case 3:
                System.out.println("Introduzca el valor del lado");
                double lado2 = lector.nextDouble();
                figura = new TrianguloEquilatero(lado2);
                break;

        }
        return figura;
    }
    public static void main(String[] args) {
        Figuras figuras = new Figuras(10);
        System.out.println(figuras);
        Scanner lector = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Introduzca opcion: \n" +
                    "1. Mostrar el array\n" +
                    "2. Agregar una figura en la lista\n" +
                    "3. Eliminar una figura de la lista\n" +
                    "4. Modificar una figura de la lista\n" +
                    "5. Modificar (específico) una figura de la lista\n" +
                    "6. Salir");
        opcion = lector.nextInt();
        switch (opcion) {
            case 1:
                figuras.mostrar();
                break;
            case 2:
                figuras.agregarFigura(dameFigura());
                break;
            case 3:
                int posicion;
                do {
                    System.out.println("Introduzca posicion de la figura a eliminar (0 a " + figuras.getTamanyo() + ")");
                    posicion = lector.nextInt();
                } while (posicion < 0 || posicion > figuras.getTamanyo());
                //posición está dentro de los límites
                boolean respuesta = figuras.eliminarFigura2(posicion);
                if (respuesta)
                    System.out.println("La figura eliminado correctamente");
                else
                    System.out.println("No había figura en esa posición");

                /*int respuesta = figuras.eliminarFigura(posicion);
                if (respuesta == 1)
                    System.out.printf("No había figura en esa posicion");
                else if (respuesta == 2)
                    System.out.printf("Figura eliminada correctamente");
                else
                    System.out.printf("Posicion no está dentro del array");
                System.out.println(figuras);*/
                break;
            case 4:
                System.out.println("Introduzca la posicion de la figura que quiere modificar");
                int posicion2 = lector.nextInt();
                System.out.println("Introduzca nuevo dato");
                double dato = lector.nextDouble();
                if (figuras.modificarFigura(posicion2,dato))
                    System.out.println("modificado correctamente");
                else
                    System.out.println("No existe la figura");

            case 5:
                System.out.println("Introduzca la posicion de la figura que quiere modificar");
                posicion2 = lector.nextInt();
                System.out.println("Introduzca nuevo dato");
                double dato2 = lector.nextDouble();
                if (figuras.modificarFiguraEspecifico(posicion2,dato2))
                    System.out.println("modificado correctamente");
                else
                    System.out.println("No existe la figura");
        }
    }while(opcion!=6);
    }
}
