package ExcepcionPropiaPares;

public class Comprobaciones {
    public static void comprobarNumero (int num) throws ExcepcionPar, ExcepcionImpar {
        if (num%2==0)
         //   throw new ExcepcionPar("El número " +num+ " es par");
            throw new ExcepcionPar();
        else
            throw new ExcepcionImpar();
    }
}
