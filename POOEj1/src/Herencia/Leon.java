package Herencia;

public class Leon extends Animal {
    //atributos o características
    private int area;

    //constructores
    public Leon(String nombre, int edad, float peso, boolean hembra, float kilosComidaSemanales, String cuidador, int area) {
        super(nombre,edad, peso, hembra, kilosComidaSemanales, cuidador);
        this.area = area;
    }
   public Leon(){
       super();
       this.area = 10;
   }
   public int getArea() {
        return area;
   }
   public void setArea(int area) {this.area = area;}

   public String toString(){
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Area: ").append(area).append("\n");
        return sb.toString() + "\n";
   }
}
