public class Mono {
    //atributos o características
    private String nombre;
    private int edad;
    private float peso;
    private boolean hembra; //hembra->true varón->false
    private String tipo;
    private float kilosComidaSemanales;
    private String cuidador;

    //constructores
    public Mono (String nombre, int edad, float peso, boolean hembra, String tipo, float kilosComidaSemanales, String cuidador) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.hembra = hembra;
        this.tipo = tipo;
        this.kilosComidaSemanales = kilosComidaSemanales;
        this.cuidador = cuidador;
    }
   public Mono(){
       this.nombre = "miMonoPreferido";
       this.edad = (int)(Math.random()*100);
       this.peso = 15;
       this.hembra = true;
       this.tipo = "Gorila";
       this.kilosComidaSemanales = 2;
       this.cuidador = "YoMismo";
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
   public String getTipo() {
        return tipo;
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

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Edad: " + edad + "\n");
        sb.append("Peso: " + peso + "\n");
        sb.append("Hembra: " + hembra + "\n");
        sb.append("Tipo: " + tipo + "\n");
        sb.append("Kilos: " + kilosComidaSemanales + "\n");
        sb.append("Cuidador: " + cuidador + "\n");
        sb.append("\n");
        return sb.toString();
        //return nombre+edad+peso+tipo+kilosComidaSemanales+cuidador+hembra;
   }
}
