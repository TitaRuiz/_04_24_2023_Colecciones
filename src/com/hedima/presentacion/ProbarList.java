package com.hedima.presentacion;

import java.util.ArrayList;
import java.util.List;

public class ProbarList {

    public static void main(String[] args) {
        //1, Definicion
        List lista = new ArrayList();
        System.out.println("La lista está vacía -> " + lista.isEmpty());
        //2. Añadir elementos
        lista.add("Hola");
        lista.add(5);
        lista.add(3.15);
        lista.add("Hola");
        lista.add(true);

        System.out.println(lista);
        System.out.println("--- Recorrer la lista ---");
        //Recorrer la lista
        for (Object elemnto: lista
             ) {
            System.out.println(elemnto.toString());
        }

        System.out.println("La lista está vacía -> " + lista.isEmpty());
        System.out.println("La lista contiene el elemento \"Hola\" -> " + lista.contains("Hola"));
        System.out.println("La lista contiene el elemento Buenos -> " + lista.contains("Buenos"));
        System.out.println("Dame el indice del elemento Hola -> " + lista.indexOf("Hola"));
        System.out.println("Dame el indice del elemento Hola el último-> " + lista.lastIndexOf("Hola"));

        System.out.println("Obtener el elemento por posicion la 3 -> " + lista.get(3));
        System.out.println( lista.set(3, "Buenos días"));
        System.out.println(lista);
        System.out.println("Elementos de la lista "+lista.size());

        //1-Definición
        List lista_1=new ArrayList();

        //2-Añadir elementos
        lista_1.add(7);
        lista_1.add(3.14);
        lista_1.add(false);
        lista_1.add("Buenos días");
        System.out.println("La lista es: "+lista_1);

        System.out.println("\nBucle for para recorrer la lista: ");
        int contador=0;
        for(Object elemento:lista_1){
            System.out.println("indice -> " + contador + " elemento -> " + elemento.toString());
            contador++;
        }
        System.out.println("Bucle for");
        for (int i = 0; i<lista_1.size();i++){
            System.out.println("Indice -> "+ i + " elemento -> "+ lista_1.get(i));
        }

    }
}
