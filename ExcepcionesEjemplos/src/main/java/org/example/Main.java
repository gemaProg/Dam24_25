package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //1. Excepción InputMismatch
        /*System.out.println("Introduce un número");
        boolean repetir = true;
        while(repetir) {
            try {
                int numero = lector.nextInt();
                System.out.println("Enhorabuena, has conseguido introducir un número");
                repetir = false;
            }catch (InputMismatchException e) {
                    lector.nextLine(); //conseguimos evitar el bucle infinito
                    System.out.println("Usuario: un número por favor");
            }catch (Exception e) {
                throw new RuntimeException(e);
            }
        }*/
        //2. IndexOutOfBound (no hacerlo, sólo ejemplo académico
        /*int lista[]= {3,5,6,12,3,10};
        try {
            System.out.println(lista[lista.length]);
        }catch(ArrayIndexOutOfBoundsException e){
            String cadena = e.getMessage();
            System.out.println(lista.length);
        }*/
        String estaciones[] = new String[4];
        estaciones[0]= "invierno";
        estaciones[1]= "primavera";


        //3. NullPointerException (no hacerlo, sólo ejemplo académico
        for (int i = 0; i < estaciones.length; i++) {
            try {
                System.out.println(estaciones[i].charAt(0));
            }catch(NullPointerException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
    }
}