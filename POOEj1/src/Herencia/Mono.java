package Herencia;

public class Mono extends Animal{
   //atributos o características
   private String tipo;

    //constructores
   public Mono (String nombre, int edad, float peso, boolean hembra, String tipo, float kilosComidaSemanales, String cuidador) {
        super(nombre,edad, peso,hembra,kilosComidaSemanales,cuidador);
        this.tipo = tipo;
    }
   public Mono(){
       super();
       tipo = Nombres.tipos[(int)(Math.random()* Nombres.tipos.length)];
   }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString(){
       return super.toString() + "Tipo: " + tipo + "\n";
   }
}
