package ZooJuan;

/*
    Nombre de clase: Elefante
    Tipo de clase..: Regular
    Hereda de......: Animal
 */
public class Elefante extends Animal {
    // ***************************************
    // Atributos propios de la clase
    // ***************************************
    private int longitudTrompa;
    private int criasActualmenteASuCargo;


    // ***************************************
    // Constructores
    // ***************************************
    public Elefante() {
        // primero se invoca al constructor de la clase padre, luego actualizo
        // los atributos propios
        super();
        this.longitudTrompa = 0;
        this.criasActualmenteASuCargo = 0;
    }

    public Elefante(String nombre, int edad, float peso, boolean esHembra, float kilosComidaSemanales, String cuidador,
                    int longitudTrompa, int criasActualmenteASuCargo) {
        // primero se invoca al constructor de la clase padre,
        // pasando los atributos comunes y luego actualizo los atributos propios
        super(nombre, edad, peso, esHembra, kilosComidaSemanales, cuidador);
        this.longitudTrompa = longitudTrompa;
        this.criasActualmenteASuCargo = criasActualmenteASuCargo;
    }


    // ***************************************
    // Setters
    // ***************************************
    public void setLongitudTrompa(int longitudTrompa) {
        this.longitudTrompa = longitudTrompa;
    }

    public void setCriasActualmenteASuCargo(int criasActualmenteASuCargo) {
        this.criasActualmenteASuCargo = criasActualmenteASuCargo;
    }

    // ***************************************
    // Getters
    // ***************************************
    public int getLongitudTrompa() {
        return this.longitudTrompa;
    }

    public int getCriasActualmenteASuCargo() {
        return this.criasActualmenteASuCargo;
    }


    // ***************************************
    // Métodos
    // ***************************************
    // Redefinición de toString
   public String toString() {
        StringBuilder sb = new StringBuilder();

        // Partimos de la clase base heredada
        sb.append(super.toString());

        // Añado los valores propios
        // Aquí uso las variables directamente en vez de los getters
        sb.append("Longitud trompa: ").append(this.getLongitudTrompa()).append("\n");
        sb.append("Crias a cargo..: ").append(this.getCriasActualmenteASuCargo()).append("\n");

        return sb.toString();
    }


}
