package org.example.common;

public class ExcepcionCaracterEspecial extends Exception {
    public ExcepcionCaracterEspecial() {
        super("La palabra no puede contener caracteres que no sean del alfabeto");
    }
    public ExcepcionCaracterEspecial(String message) {
        super(message);
    }
}
