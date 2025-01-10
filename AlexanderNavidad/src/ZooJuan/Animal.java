package ZooJuan;

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


    // ***************************************
    // Constructores
    // ***************************************
    public Animal() {
        this.nombre = "";
        this.edad = 0;
        this.peso = 0;
        this.esHembra = true;
        this.kilosComidaSemanales = 0;
        this.cuidador = "";
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
