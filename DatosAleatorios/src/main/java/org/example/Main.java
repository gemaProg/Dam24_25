package org.example;

import net.datafaker.Faker;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100 ; i++) {
            System.out.println(new Faker().animal().name());
        }

    }
}