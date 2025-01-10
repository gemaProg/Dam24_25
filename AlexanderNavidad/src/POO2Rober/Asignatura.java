package POO2Rober;

class Asignatura
{
    private int tipo;
    private double nota;
    public Asignatura(int tipo) { this.tipo = tipo; }
    public Asignatura(Asignatura asignatura)
    {
        this.tipo = asignatura.tipo;
        this.nota = asignatura.nota;
    }
    public int getTipo() { return tipo; }
    public double getNota() { return nota; }
    public void setNota(double nota) { this.nota  = nota; }
}
