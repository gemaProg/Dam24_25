package Herencia;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Animal [] listaAnimales = new Animal[20];
        System.out.println(Arrays.toString(listaAnimales));
        for (int i = 0; i < listaAnimales.length ; i++) {
            int opcion = (int)(Math.random()*3);
            switch (opcion) {
                case 0:
                    listaAnimales[i]=new Leon();
                    break;
                case 1:
                    listaAnimales[i]=new Mono();
                    break;
                case 2:
                    listaAnimales[i]=new Jirafa();
                    break;
            }
        }
        System.out.println(Arrays.toString(listaAnimales));
    }
}