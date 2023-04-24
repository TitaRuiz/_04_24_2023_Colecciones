package com.hedima.presentacion;
//import java.util.*;
import com.hedima.modelo.Persona;

import java.util.HashSet;
import java.util.Set;

public class ProbarSet {

    public static void main(String[] args) {

        //1, Definir un Set
        Set conjunto = new HashSet();
        //2. Añadir elementos
        conjunto.add("Hola Mundo");
        conjunto.add(5);
        conjunto.add(6.6);

        System.out.println(conjunto.add(new Persona("Ana",19)));
        System.out.println(conjunto.add("Hola Mundo"));
        System.out.println(conjunto);

        for (Object elemento : conjunto
             ) {
            System.out.println(elemento.toString());
        }

        System.out.println("Ejercicio 2");

        Set conjunto1=new HashSet();
        conjunto1.add("Buenas noches");
        conjunto1.add(5);
        conjunto1.add(8.5);
        conjunto1.add(5);
        conjunto1.add("Calificación");

        System.out.println(conjunto1);

        System.out.println("\nBucle for: ");
        for(Object elemento:conjunto1){
            System.out.println("El elemento "+elemento.toString()+" es del tipo "+elemento.getClass());
        }


    }
}
