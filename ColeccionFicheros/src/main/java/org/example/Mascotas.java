package org.example;

import java.util.ArrayList;
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

    @Override
    public String toString() {
        return "Mascotas{" +
                "mascotas=" + mascotas +
                '}';
    }
}
