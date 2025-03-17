package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Mascotas {
    private List<Mascota> mascotas;

    public Mascotas() {
        mascotas = new ArrayList<Mascota>();
        for (int i = 0; i < 10; i++) {
            mascotas.add(new Mascota());
        }
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void listar(String especie) {
        for (int i = 0; i < mascotas.size(); i++) {
            if (mascotas.get(i).getEspecie().equalsIgnoreCase(especie)) {
                System.out.println(mascotas.get(i));
            }
        }
        /*for (Mascota mascota : mascotas) {
            if (mascota.getEspecie().equalsIgnoreCase(especie)) {
                System.out.println(mascota);
            }
        }*/
    }
    public void modificarMascota(String nombre){
        for (int i = 0; i < mascotas.size(); i++) {
            if (mascotas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                //mascotas.set(i, new Mascota());
                mascotas.get(i).setEdad(mascotas.get(i).getEdad() + 1);
            }
        }
    }
    public void ordenar(){
        //Arrays.sort(lista);
        Collections.sort(mascotas);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\"Mascotas{\"");
        sb.append("mascotas=");
        sb.append(mascotas);
        sb.append("\"}");
        return sb.toString();
    }
}
