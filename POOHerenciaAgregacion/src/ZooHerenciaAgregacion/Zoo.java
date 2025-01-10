package ZooHerenciaAgregacion;

import java.util.Random;

public class Zoo {
    private Animal[] lista;

    public Animal[] getLista() {
        return lista;
    }

    public Zoo(){
        this(10);
    }
    public Zoo (int tamanyo){
        lista = new Animal[tamanyo];
        Random rnd = new Random();
        for(int i = 0; i<10; i++){
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

    public Zoo (Animal[] lista){
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


}
