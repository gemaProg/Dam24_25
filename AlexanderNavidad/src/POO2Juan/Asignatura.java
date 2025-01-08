package POO2Juan;

public class Asignatura {
    // ***************************************
    // Definición de atributos
    // ***************************************
    private int id;
    private double calificacion;


    // ***************************************
    // Constructores
    // ***************************************
    public Asignatura(int id) {
        this.id = id;
        this.calificacion = 0;
    }


    // ***************************************
    // Getters
    // ***************************************
    public int getId() {
        return this.id;
    }

    public double getCalificacion() {
        return this.calificacion;
    }


    // ***************************************
    // Setters
    // ***************************************
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }


    // ***************************************
    // Métodos
    // ***************************************
    // No se pide, pero me redefino el método toString() para
    // usarlo después
    public String toString() {
        return ("ID: " + this.getId()+ "; Calificación:" + this.getCalificacion());
    }
}
