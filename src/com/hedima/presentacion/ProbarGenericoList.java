package com.hedima.presentacion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProbarGenericoList {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(15);
        numeros.add(26);

        System.out.println(numeros);

        Set<String> strings = new HashSet<>();

        strings.add("Hola");
        strings.add("Adiós");
        strings.add("Hasta luego");
        strings.add("Hasta mañana");
        strings.add("Hasta pronto");

        System.out.println(strings);
    }
}
