package org.example.domain;

public class Elemento {
    private String id;
    private String palabra;
    private String categoria;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "id='" + id + '\'' +
                ", palabra='" + palabra + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
    public String toStringFichero(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.id);
        sb.append(";");
        sb.append(this.palabra);
        sb.append(";");
        sb.append(this.categoria);
        return sb.toString();
    }
}
