package ZooHerenciaAgregacion;

import java.util.Random;

/*
    Nombre de clase: Mono
    Tipo de clase..: Regular
    Hereda de......: Animal
 */
public class Mono extends Animal {
    // ***************************************
    // Atributos propios de la clase
    // ***************************************
    private String tipo;


    // ***************************************
    // Constructores
    // ***************************************
    public Mono() {
        // primero se invoca al constructor de la clase padre, luego actualizo
        // los atributos propios
        super();
        Random rnd = new Random();
        this.tipo =  tipos_mono[rnd.nextInt(0, tipos_mono.length)];
    }

    /**
     * Método que me permite construir un Mono
     * @param nombre String
     * @param edad entero que
     * @param peso
     * @param esHembra
     * @param kilosComidaSemanales
     * @param cuidador
     * @param tipo
     */
    public Mono(String nombre, int edad, float peso, boolean esHembra, float kilosComidaSemanales, String cuidador,
                String tipo) {
        // primero se invoca al constructor de la clase padre, luego actualizo
        // los atributos propios
        super(nombre, edad, peso, esHembra, kilosComidaSemanales, cuidador);
        this.tipo = tipo;
    }


    // ***************************************
    // Setters
    // ***************************************
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    // ***************************************
    // Getters
    // ***************************************

    /**
     *
     * @return
     */
    public String getTipo() {
        return this.tipo;
    }


    // ***************************************
    // Métodos
    // ***************************************
    // Redefinición de toString
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Partimos de la clase base
        sb.append(super.toString());

        // Añado los valores propios
        // En vez de llamar a "tipo" o "this.tipo"
        // llamo a this.getTipo(). Cualquiera de
        // todas ellas es correcta.
        sb.append("Tipo...........: ").append(this.getTipo()).append("\n");

        return sb.toString();
    }
}
