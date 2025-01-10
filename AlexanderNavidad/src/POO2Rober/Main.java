package POO2Rober;

import java.nio.file.ProviderNotFoundException;

public class Main
{
    public static void main(String[] args)
    {
        Asignatura asignatura1 = new Asignatura(1);
        Asignatura asignatura2 = new Asignatura(2);
        Asignatura asignatura3 = new Asignatura(3);
        Alumno alumno = new Alumno(asignatura1, asignatura2, asignatura3);
        Profesor profesor = new Profesor();
        profesor.ponerNota(alumno);
        System.out.println("\n\n"+ profesor.media(alumno));
    }
}