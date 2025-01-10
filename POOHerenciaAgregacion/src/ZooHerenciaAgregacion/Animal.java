package ZooHerenciaAgregacion;

import java.util.Random;

/*
    Nombre de clase: Animal
    Tipo de clase..: Abstracta
    Hereda de......: Nadie. Es clase base para que hereden de ella todos los demás animales
*/
public abstract class Animal {
    // ***************************************
    // Atributos que tendrán todas las clases hijas
    // ***************************************
    private String nombre;
    private int edad;
    private float peso;
    private boolean esHembra; //hembra->true varón->false
    private float kilosComidaSemanales;
    private String cuidador;
    public static final String[] nombres = {"Mico", "Noa", "Chispa", "Nina", "Rayo", "Toby", "Chiqui", "Rocky", "Plutón", "Thor", "Chico", "Simba", "Bruno", "Lola", "Nico", "Coco", "Bimba", "Linda", "Max"};
    private static String[] nombres_cuidadores = {"Juan", "Pedro", "Manuel", "Sonia", "Ana"};
    public static final String[] tipos_mono = {"Chimpancé", "Gorila", "Mandril", "Orangután"};

    // ***************************************
    // Constructores
    // ***************************************
    public Animal() {
        Random rnd = new Random();
        this.nombre = nombres[rnd.nextInt(0, nombres.length)];
        this.edad = rnd.nextInt(0, 30);
        this.peso = rnd.nextFloat(0, 90);
        this.esHembra = rnd.nextBoolean();
        this.kilosComidaSemanales = rnd.nextFloat(15, 45);
        this.cuidador = nombres_cuidadores[rnd.nextInt(0, nombres_cuidadores.length)];
    }

    public Animal(String nombre, int edad, float peso, boolean esHembra, float kilosComidaSemanales, String cuidador) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.esHembra = esHembra;
        this.kilosComidaSemanales = kilosComidaSemanales;
        this.cuidador = cuidador;
    }


    // ***************************************
    // Setters
    // ***************************************
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setEsHembra(boolean esHembra) {
        this.esHembra = esHembra;
    }

    public void setCuidador(String cuidador) {
        this.cuidador = cuidador;
    }

    public void setKilosComidaSemanales(float kilosComidaSemanales) {
        this.kilosComidaSemanales = kilosComidaSemanales;
    }


    // ***************************************
    // Getters
    // ***************************************
    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public float getPeso() {
        return this.peso;
    }

    public boolean getEsHembra() {
        return this.esHembra;
    }

    public float getKilosComidaSemanales() {
        return this.kilosComidaSemanales;
    }

    public String getCuidador() {
        return this.cuidador;
    }


    public static String getNombreCuidador(){
        return nombres_cuidadores[(int)(Math.random()*nombres_cuidadores.length)];
    }
    // ***************************************
    // Métodos
    // ***************************************
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Genero la salida
        // En vez de acceder al atributo directamente, uso el getter
        // asociado. Se puede hacer de ambas formas, en otras clases lo
        // haré de otro modo
        sb.append("Nomnbre........: ").append(this.getNombre()).append("\n");
        sb.append("Edad...........: ").append(this.getEdad()).append("\n");
        sb.append("Peso...........: ").append(this.getPeso()).append("\n");
        sb.append("Hembra.........: ").append(this.getEsHembra()).append("\n");
        sb.append("Kilos..........: ").append(this.getKilosComidaSemanales()).append("\n");
        sb.append("Cuidador.......: ").append(this.getCuidador()).append("\n");

        // Devuelvo el resultado
        return sb.toString();
    }
}
