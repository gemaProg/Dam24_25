package Original;

public class Jirafa {
    //atributos o características
    private String nombre;
    private int edad;
    private float peso;
    private boolean hembra; //hembra->true varón->false
    private float longitudCuello;
    private float kilosComidaSemanales;
    private String cuidador;

    //constructores
    public Jirafa(String nombre, int edad, float peso, boolean hembra, float longitudCuello, float kilosComidaSemanales, String cuidador) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.hembra = hembra;
        this.longitudCuello = longitudCuello;
        this.kilosComidaSemanales = kilosComidaSemanales;
        this.cuidador = cuidador;
    }
   public Jirafa(){
       this.nombre = Nombres.nombres[(int)(Math.random()*Nombres.nombres.length)];
       this.edad = (int)(Math.random()*100);
       this.peso = 100;
       this.hembra = true;
       this.longitudCuello = 10;
       this.kilosComidaSemanales = 30;
       this.cuidador = Nombres.cuidadores[(int)(Math.random()*Nombres.cuidadores.length)];
   }
   //getter
   public String getNombre() {
        return nombre;
   }

   public int getEdad() {
        return edad;
   }
   public float getPeso() {
        return peso;
   }
   public boolean isHembra() {
        return hembra;
   }
   public float getLongitudCuello() {
        return longitudCuello;
   }
   public float getKilosComidaSemanales() {
        return kilosComidaSemanales;
   }
   public String getCuidador() {
        return cuidador;
   }
   //setter

   public void setNombre(String nombre) {this.nombre = nombre;}
   public void setEdad(int edad) {this.edad = edad;}
   public void setPeso(float peso) {this.peso = peso;}
   public void setCuidador(String cuidador) {
        this.cuidador = cuidador;
   }
   public void setLongitudCuello(float longitudCuello) {this.longitudCuello = longitudCuello;}

    public void setHembra(boolean hembra) {
        this.hembra = hembra;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Edad: " + edad + "\n");
        sb.append("Peso: " + peso + "\n");
        sb.append("Hembra: " + hembra + "\n");
        sb.append("Longitud de cuello: " + longitudCuello + "\n");
        sb.append("Kilos: " + kilosComidaSemanales + "\n");
        sb.append("Cuidador: " + cuidador + "\n");
        sb.append("\n");
        return sb.toString();
        //return nombre+edad+peso+tipo+kilosComidaSemanales+cuidador+hembra;
   }
}
