package POO2Rober;

class Profesor
{
    public void ponerNota(Alumno alumno)
    {
        alumno.getAsignatura1().setNota(9.5);
        alumno.getAsignatura2().setNota(3.2);
        alumno.getAsignatura3().setNota(6);
    }
    public double media(Alumno alumno)
    {
        return (alumno.getAsignatura1().getNota() +
                alumno.getAsignatura2().getNota() +
                alumno.getAsignatura3().getNota()) / 3;
    }

}
