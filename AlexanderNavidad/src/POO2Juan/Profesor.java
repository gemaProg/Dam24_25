package POO2Juan;

public class Profesor {
    // ***************************************
    // Métodos
    // ***************************************

    // Ya que tengo que poner la nota, que sea siempre
    // aprobado como mínimo! ;-D
    public static void ponerNota(Alumno a) {
        a.getA1().setCalificacion(5 + Math.random() * 5);
        a.getA2().setCalificacion(5 + Math.random() * 5);
        a.getA3().setCalificacion(5 + Math.random() * 5);
    }

    public static double calculaMedia(Alumno a) {
        return ((a.getA1().getCalificacion() +
                a.getA2().getCalificacion() +
                a.getA3().getCalificacion()) / 3);
    }
}
