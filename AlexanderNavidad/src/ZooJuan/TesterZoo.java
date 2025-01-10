package ZooJuan;

import java.util.Random;
import java.util.Scanner;

public class TesterZoo {
    // Este método muestra el array de animales
    public static void mostrarArrrayDeAnimales(Animal[] lista) {
        for (int i = 0; i <= lista.length - 1; i++) {
            System.out.println("POSICION ANIMAL: " + i);
            System.out.println("CLASE..........: " + lista[i].getClass().getSimpleName());
            System.out.println(lista[i].toString());
        }
    }

    // Este método busca el primer mono
    public static int buscarPrimerMono(Animal[] lista) {
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
    public static int contarElefantes(Animal[] lista) {
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

    // Este método gestiona el menú y determina la opción elegida
    // llamando a otros métodos que resuelven las opciones
    public static void gestionMenu(Animal[] lista) {
        Scanner lector = new Scanner(System.in);
        int opcion;
        int aux;
        String nuevo_cuidador;

        do {
            System.out.println();
            System.out.println("Menú de opciones");
            System.out.println("****************");
            System.out.println("1. Mostrar el array");
            System.out.println("2. Buscar la posición del primer mono");
            System.out.println("3. Contar el número de Elefantes");
            System.out.println("4. Modificar el cuidador del elemento que digamos");
            System.out.println("0. Salir");

            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    // Aquí delego en un método directamente
                    mostrarArrrayDeAnimales(lista);
                    break;

                case 2:
                    // Aquí delego en un método para obtener la posición
                    // y el resto de la lógica la hago en local
                    aux = buscarPrimerMono(lista);
                    if (aux > 0)
                        System.out.println("El primero mono está en la posición " + aux);
                    else
                        System.out.println("No hay monos en la lista");
                    break;

                case 3:
                    // Aquí delego en un método para obtener la posición
                    // y el resto de la lógica la hago en local
                    aux = contarElefantes(lista);
                    System.out.println("En la lista de animales hay " + aux + " elefantes");
                    break;

                case 4:
                    // Este proceso lo voy a hacer "a la antigua", sin
                    // llamar a un procedimiento
                    System.out.println("Indique la posición del animal (0-"+(lista.length-1)+"): ");
                    aux= lector.nextInt();
                    lector.nextLine();

                    System.out.println("Indique el nombre del nuevo cuidador: ");
                    nuevo_cuidador= lector.nextLine();

                    if ((aux>=0) && (aux <= lista.length-1)) {
                        lista[aux].setCuidador(nuevo_cuidador);
                        System.out.println("Cambiado!");
                    }
                    else
                        System.out.println("No se puede cambiar el cuidador porque no ha indicado una posición correcta");
                    break;

                case 0:
                    // La opción de salida se contempla sin código para
                    // que no se de un mensaje de opción incorrecta
                    break;

                default:
                    // Por defecto la opción es incorrecta si no es
                    // ninguna de las elegidas antes
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcion != 0);
    }

    // Código principal del tester
    public static void main(String[] args) {
        // Arrays con nombres para rellenar datos aleatorios
        String[] nombres = {"Mico", "Noa", "Chispa", "Nina", "Rayo", "Toby", "Chiqui", "Rocky", "Plutón", "Thor", "Chico", "Simba", "Bruno", "Lola", "Nico", "Coco", "Bimba", "Linda", "Max"};
        String[] nombres_cuidadores = {"Juan", "Pedro", "Manuel", "Sonia", "Ana"};
        String[] tipos_mono = {"Chimpancé", "Gorila", "Mandril", "Orangután"};

        // Usaré este objeto para generar valores
        Random rnd = new Random();

        // Me creo un array de animales
        // Al hacer el array de una clase abstracta, utilizo
        // polimorfismo, ya que los animales serán de otras clases y no sabremos
        // de que clases son inicialmente
        Animal[] animales = new Animal[15];

        // Genero los animales
        for (int i = 0; i <= animales.length - 1; i++) {
            // Genero cada uno de los animales con un 33.33% de probabilidad
            switch (rnd.nextInt(0, 3)) {
                case 0:
                    // Uso el constructor con parámetros
                    animales[i] = new Mono(nombres[rnd.nextInt(0, nombres.length)],
                            rnd.nextInt(0, 30),
                            rnd.nextFloat(0, 90),
                            rnd.nextBoolean(),
                            rnd.nextFloat(15, 45),
                            nombres_cuidadores[rnd.nextInt(0, nombres_cuidadores.length)],
                            tipos_mono[rnd.nextInt(0, tipos_mono.length)]);
                    break;

                case 1:
                    // Uso el constructor con parámetros
                    animales[i] = new Ornitorrinco(nombres[rnd.nextInt(0, nombres.length)],
                            rnd.nextInt(0, 30),
                            rnd.nextFloat(0, 90),
                            rnd.nextBoolean(),
                            rnd.nextFloat(15, 45),
                            nombres_cuidadores[rnd.nextInt(0, nombres_cuidadores.length)],
                            rnd.nextBoolean(),
                            rnd.nextBoolean());
                    break;

                case 2:
                    // Uso el constructor con parámetros
                    animales[i] = new Elefante(nombres[rnd.nextInt(0, nombres.length)],
                            rnd.nextInt(0, 30),
                            rnd.nextFloat(0, 90),
                            rnd.nextBoolean(),
                            rnd.nextFloat(15, 45),
                            nombres_cuidadores[rnd.nextInt(0, nombres_cuidadores.length)],
                            rnd.nextInt(0, 300),
                            rnd.nextInt(0, 5));
                    break;
            }
        }

        // Proceso las opciones y el menú
        gestionMenu(animales);
    }
}