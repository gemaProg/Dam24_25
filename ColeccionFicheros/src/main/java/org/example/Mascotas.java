package org.example;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mascotas {
    private List<Mascota> mascotas;

    public Mascotas() {
        File file = new File(Constantes.MASCOTAS_BINARY_FILE);
        //System.out.println(file.getAbsoluteFile());
        if (file.exists())
            //mascotas = GestionFicheros.leerFichero(Constantes.MASCOTAS_FILE);
            //mascotas = GestionFicheros.leerFicheroBRFR(Constantes.MASCOTAS_FILE);
            mascotas = GestionFicheros.leerFicheroBinario(Constantes.MASCOTAS_BINARY_FILE);
        else {
            mascotas = new ArrayList<Mascota>();
            for (int i = 0; i < 10; i++) {
                mascotas.add(new Mascota());
            }
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
        /*for (Mascota elemento : mascotas) {
            if (elemento.getEspecie().equalsIgnoreCase(especie)) {
                System.out.println(elemento);
            }
        }*/
    }

    public void modificarMascota(String nombre) {
        for (int i = 0; i < mascotas.size(); i++) {
            if (mascotas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                //mascotas.set(i, new Mascota());
                mascotas.get(i).setEdad(mascotas.get(i).getEdad() + 1);
            }
        }
    }

    public void ordenar() {
        //Mascota lista[] = mascotas.toArray(new Mascota[0]);
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
