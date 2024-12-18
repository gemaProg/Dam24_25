package Herencia;

public class Jirafa extends Animal {
    //atributos o características
    private float longitudCuello;

    //constructores
    public Jirafa(String nombre, int edad, float peso, boolean hembra, float longitudCuello, float kilosComidaSemanales, String cuidador) {
        super(nombre,edad, peso, hembra, kilosComidaSemanales, cuidador);
        this.longitudCuello = longitudCuello;
    }
   public Jirafa(){
       super();
       this.longitudCuello = 10;
   }
   public float getLongitudCuello() {
        return longitudCuello;
   }
   public void setLongitudCuello(float longitudCuello) {this.longitudCuello = longitudCuello;}

   public String toString(){
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Longitud de cuello: ").append(longitudCuello).append("\n");
        return sb.toString()+ "\n";
   }
}
