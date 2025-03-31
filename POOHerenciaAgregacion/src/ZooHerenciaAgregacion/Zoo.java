package ZooHerenciaAgregacion;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Zoo {
    private Animal[] lista;

    public Animal[] getLista() {
        return lista;
    }

    public Zoo() {
        this(10);
    }

    public Zoo(int tamanyo) {
        lista = new Animal[tamanyo];
        Random rnd = new Random();
        for (int i = 0; i < lista.length; i++) {
            switch (rnd.nextInt(0, 3)) {
                case 0:
                    // Uso el constructor con parámetros
                    lista[i] = new Mono();
                    break;

                case 1:
                    // Uso el constructor con parámetros
                    lista[i] = new Ornitorrinco();
                    break;

                case 2:
                    // Uso el constructor con parámetros
                    lista[i] = new Elefante();
                    break;
            }

        }
    }

    public Zoo(Animal[] lista) {
        this.lista = lista;
    }

    public void mostrarArrrayDeAnimales() {
        for (int i = 0; i <= lista.length - 1; i++) {
            System.out.println("POSICION ANIMAL: " + i);
            System.out.println("CLASE..........: " + lista[i].getClass().getSimpleName());
            System.out.println(lista[i].toString());
        }
    }

    // Este método busca el primer mono

    /**
     * @return el
     */
    public int buscarPrimerMono() {
        int pos;

        pos = -1;
        for (int i = 0; (i <= lista.length - 1) && (pos < 0); i++)
            // Para que el código funcione en cualquier caso comparo
            // el nombre de la clase del objeto del array con el nombre
            // de la clase que me interesa, así si cambia en algún momento
            // el nombre de la clase, el código seguirá funcionando
            if ((lista[i].getClass().toString().equalsIgnoreCase(Mono.class.toString())))
                pos = i;
            /*if (lista[i] instanceof Mono)
                pos = i;*/
        return (pos);
    }

    // Este método cuenta el número de elefantes
    public int contarElefantes() {
        int num;

        num = 0;
        for (int i = 0; i <= lista.length - 1; i++)
            // Para que el código funcione en cualquier caso comparo
            // el nombre de la clase del objeto del array con el nombre
            // de la clase que me interesa, así si cambia en algún momento
            // el nombre de la clase, el código seguirá funcionando
            if (lista[i].getClass().toString().equalsIgnoreCase(Elefante.class.toString()))
                num++;

        return (num);
    }

    public Animal darAlta() {
        Animal a = null;
        //comunica con el usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 1. Mono, 2. Elefante...");
        int opcion = scanner.nextInt();
        System.out.println("Introduce nombre, edad, peso, esHembra, kilosComidaSemanales, cuidador");
        String nombre = scanner.next();
        int edad = scanner.nextInt();
        int peso = scanner.nextInt();
        boolean esHembra = scanner.nextBoolean();
        int kilosComida = scanner.nextInt();
        String cuidador = scanner.next();
        switch (opcion) {
            case 1:
                System.out.println("Introduce Tipo");
                String tipo = scanner.next();
                a = new Mono(nombre, edad, peso, esHembra, kilosComida, cuidador, tipo);
                break;
            case 2:

                a = new Elefante();
        }

        return a;
    }
    public int hayHueco(){
        int posicion = -1;
        for (int i = 0; i < lista.length && posicion==-1; i++) {
            if (lista[i] == null) {
                posicion = i;
            }
        }
        return posicion;
    }
    public boolean introducirloZoo(Animal animal) {
        boolean respuesta = false;
        int posicion = hayHueco();
        if (posicion !=-1) {
            lista[posicion] = animal;
            respuesta = true;
        }
        return respuesta;
    }
    public boolean darBaja(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce nombre");
        String nombre = lector.next();
        boolean respuesta = false;
        for (int i = 0; i < lista.length&& !respuesta; i++) {
            if (lista[i]!=null && lista[i].getNombre().equalsIgnoreCase(nombre)){
                lista[i]=null;
                respuesta = true;
            }

        }
        return respuesta;
    }
}
