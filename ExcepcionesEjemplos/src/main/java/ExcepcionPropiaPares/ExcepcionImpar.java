package ExcepcionPropiaPares;

public class ExcepcionImpar extends RuntimeException {
    public ExcepcionImpar() {
        super("El número es impar");
    }
    public ExcepcionImpar(String msg) {
        super(msg);
    }
}
