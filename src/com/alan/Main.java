package com.alan;
import java.util.*;

public class Main {

    public static void main(String[] args) {

    /*    String universidades[];
    universidades= new String[5];
        universidades[0] = "ITVH";
        universidades[1] = "ULA";
        universidades[2] = "UAM";
        universidades[3] = "UADM";
        universidades[4] = "UNAM";*/


        String universidades[] = new String[]{"IPN", "UNAM", "ITAM", "NMIH", "ULA"};

       /* universidades[5] = "UPN";
        universidades[6] = "IPN";
        universidades[7] = "TESCO";*/

        for(String universidad : universidades){//es igual a un foreach, despues de los 2 puntos se pone el arreglo que va a recorrer, antes de los 2 puntos es el nombre de la variable en la que va ir guardando cada indice
            System.out.println(universidad);
        }

        Set<String> frutas = new HashSet(4);//El numero que elegimos, no limita el numero de espacios disponibles sino que es los espacios minimos que se deben de utilizar para esta tabla
        //CARACTERISTICAS PRINCIPALES SET
        //No puede contener elementos duplicados.
        //El orden de los elementis puede variar
        frutas.add("Mango");
        frutas.add("Fresa");
        frutas.add("Pera");
        frutas.add("Uva");
        frutas.add("Melon");
        frutas.add("Lima");
        frutas.add("Mango");//Aunque tengamos valores repetidos, unicamente recucperara un valor

        for(String fruta : frutas){
            System.out.println(fruta);
        }
        System.out.println("----------------------------------------------------");
        Set<String> frutas2 = new TreeSet<>();//Orden alfabetico de los elementos
        frutas2.add("Mango");
        frutas2.add("Uva");
        frutas2.add("Lima");
        frutas2.add("Pera");
        frutas2.add("Melon");
        frutas2.add("Fresa");

        for(String fruta2 : frutas2){
            System.out.println(fruta2);
        }

        System.out.println("----------------------------------------------------");
        Set<String> frutas3 = new LinkedHashSet<>(4); //Los ordena en orden de insercion
        frutas3.add("Mango");
        frutas3.add("Uva");
        frutas3.add("Lima");
        frutas3.add("Pera");
        frutas3.add("Melon");
        frutas3.add("Fresa");

        for(String fruta : frutas3){
            System.out.println(fruta);
        }

        /*System.out.println("\n ALAN MEJIA");

        final Set hashSet = new HashSet(1_000_000);
        final Long startHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            hashSet.add(i);
        }
        final Long endHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));

        final Set treeSet = new TreeSet();
        final Long startTreeSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            treeSet.add(i);
        }
        final Long endTreeSetTime = System.currentTimeMillis();
        System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));

        final Set linkedHashSet = new LinkedHashSet(1_000_000);
        final Long startLinkedHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            linkedHashSet.add(i);
        }
        final Long endLinkedHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));
        */

        System.out.println("-------------------Array List-----------------------------");

        /*COLECCION LIST*/
        List<String> frutas4= new ArrayList<>();
        //List si admite elementos duplicados
        frutas4.add("Mango");
        frutas4.add("Uva");
        frutas4.add("Lima");
        frutas4.add("Pera");
        frutas4.add("Melon");
        frutas4.add("Mango");

        for(String fruta : frutas4){
            System.out.println(fruta);
        }
        System.out.println(frutas4.get(3));
        int indice = frutas4.indexOf("Melon");
        System.out.println(frutas4.get(indice));

        System.out.println("---------------------LinkedList-------------------------------");
        List<String> fruta5 = new LinkedList<>();
        //Un arreglo enlazado sabe que elemento va ander y despues de el, es decir, el melon sabe quentes de el esta la pera y despues de el esta el mango
        fruta5.add("Mango");
        fruta5.add("Uva");
        fruta5.add("Lima");
        fruta5.add("Pera");
        fruta5.add("Melon");
        fruta5.add("Mango");

        for(String fruta : fruta5){
            System.out.println(fruta);
        }

        System.out.println("---------------------MAP-------------------------------");
        Map<Integer, String> universidades2 = new HashMap<Integer, String>();
        //aSOCIA CLAVES CON VALORES
        //nO PUEDE TENER CLAVES REPETIDAS
        //SOLO PUEDE TENER UN VALOR ASOCIADO A LA CLAVE
        universidades2.put(1, "IPN");
        universidades2.put(2, "UNAM");
        universidades2.put(3, "UAEM");
        universidades2.put(4, "UAEM");
        universidades2.put(5, "UAM");

        System.out.println(universidades2.get(3));

        for(Map.Entry<Integer, String>universi : universidades2.entrySet()){
            System.out.println("clave " + universi.getKey() + ", valor " + universi.getValue());
        }


    }


}
