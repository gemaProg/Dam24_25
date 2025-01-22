package org.example;

/**
 * Clase Figura
 */
public abstract class Figura {
    protected double dimension;

    /**
     * Constructor que permite crear una instancia de la clase Figura con el atributo
     */
    public Figura(){
        this.dimension = 2.5;
    }

    /**
     *Constructor que permite crear una instancia de la clase Figura personalizando su dimension
     * @param dimension - magnitud del lado o radio
     */
    public Figura(double dimension) {
        this.dimension = dimension;
    }

    /**
     * Método que permite obtener el valor de la dimension
     * @return la dimensión de la figura
     */
    public double getDimension() {
        return dimension;
    }
    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    public String termino(){
        return "Lado";
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "-"+termino()+"= " + dimension + "\nÁrea del "+ this.getClass().getSimpleName()+ " "+String.format("%.2f",this.calcularArea())+
                "\nPerímetro del "+this.getClass().getSimpleName()+" "+String.format("%.2f",calcularPerimetro())+"\n";
    }
}
