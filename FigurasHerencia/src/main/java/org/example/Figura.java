package org.example;

public abstract class Figura {
    protected double dimension;
    public Figura(){
        this.dimension = 2.5;
    }
    public Figura(double dimension) {
        this.dimension = dimension;
    }
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
                "\nPerímetro del "+this.getClass().getSimpleName()+" "+String.format("%.2f",calcularPerimetro());
    }
}
