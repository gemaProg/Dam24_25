package POO2Juan;

public class TesterEjercicioP2 {
    public static void main(String[] args) {

        Asignatura a1 = new Asignatura(1);
        Asignatura a2 = new Asignatura(2);
        Asignatura a3 = new Asignatura(3);

        Alumno alumno = new Alumno(a1, a2,a3);

        // No necesito instancia de profesor porque
        // uso métodos estáticos
        Profesor.ponerNota(alumno);

        // Hago llamadas a toString() en las que se ejecuta código de varias clases
        // después de aplicar herencia
        System.out.println("Las notas del alumno son: " + alumno.toString());
        System.out.println("La media del alumno es: " + Profesor.calculaMedia(alumno));
    }
}
