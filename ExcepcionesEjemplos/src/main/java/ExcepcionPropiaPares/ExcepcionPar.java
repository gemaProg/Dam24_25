package ExcepcionPropiaPares;

public class ExcepcionPar extends RuntimeException {
    public ExcepcionPar() {
        super("El número es par");
    }
    public ExcepcionPar(String msg) {
        super(msg);
    }
}
