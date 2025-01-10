package POO2Rober;

class Alumno
{
    private Asignatura asignatura1, asignatura2, asignatura3;
    public Alumno(Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3)
    {
        this.asignatura1 = asignatura1;
        this.asignatura2 = new Asignatura(asignatura2);
        this.asignatura3 = new Asignatura(asignatura3);
    }
    public Alumno(int tipo1, int tipo2, int tipo3)
    {
        asignatura1 = new Asignatura(tipo1);
        asignatura2 = new Asignatura(tipo2);
        asignatura3 = new Asignatura(tipo3);
    }
    public Asignatura getAsignatura1() { return asignatura1; }
    public Asignatura getAsignatura2() { return asignatura2; }
    public Asignatura getAsignatura3() { return asignatura3; }
}
