package org.example.common;

public class Comprobaciones {
    public static void comprobarPalabra(String palabra) throws ExcepcionCaracterEspecial {
        palabra = palabra.toUpperCase();
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i)<65 || palabra.charAt(i)>90 ) {
                //throw new ExcepcionCaracterEspecial();
                throw new ExcepcionCaracterEspecial("La palabra"+ palabra+"contiene caracteres no válidos, como por ejemplo:"+palabra.charAt(i) );
            }
        }
    }
}
