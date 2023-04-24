package com.hedima.presentacion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EjercicioPalabrasDiferentes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = scanner.nextLine();
        String[] palabras = frase.split(" ");;

        Set<String> palabrasdiferentes = new HashSet<>(Arrays.asList(palabras));
        for (String Objeto: palabrasdiferentes) {
            System.out.println(Objeto);
        }



    }
    }

