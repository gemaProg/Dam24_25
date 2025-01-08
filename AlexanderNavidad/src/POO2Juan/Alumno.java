package POO2Juan;

public class Alumno {
    // ***************************************
    // Definición de atributos
    // ***************************************
    private Asignatura a1 = null;
    private Asignatura a2 = null;
    private Asignatura a3 = null;


    // ***************************************
    // Constructores
    // ***************************************
    public Alumno(Asignatura a1, Asignatura a2, Asignatura a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public Alumno(int idx_a1, int idx_a2, int idx_a3) {
        this.a1 = new Asignatura(idx_a1);
        this.a2 = new Asignatura(idx_a2);
        this.a3 = new Asignatura(idx_a3);
    }


    // ***************************************
    // Getters
    // ***************************************
    public Asignatura getA1() {
        return this.a1;
    }

    public Asignatura getA2() {
        return this.a2;
    }

    public Asignatura getA3() {
        return this.a3;
    }


    // ***************************************
    // Métodos
    // ***************************************
    // No se pide, pero me redefino el método toString() para
    // usarlo después
    public String toString() {
        return ("(A1: " + this.getA1().toString() +
                "; A2:" + this.getA2().toString() +
                "; A3:" + this.getA3().toString()+")");
    }
}
