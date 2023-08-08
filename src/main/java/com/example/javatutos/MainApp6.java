package com.example.javatutos;

/*
==, ===, !=, <, <=, >, >=, &&, ||, !

 */
public class MainApp6 {
    public static void main(String[] args) {
//        boolean test = (24 == "24");
        int value = -12;

        if(value == 24) // Si la condition retroune True, l'instruction sera exécutée
            System.out.println("value = 24"); // Il y a qu'une seule instruction, pas besoin d'accolade

        if(value < 0)
            System.out.println("negative");
        else if(value == 0)
            System.out.println("0");
        else if (value == 1)
            System.out.println("1");
        else
            System.out.println("positive");

        if(value <= 0)
            if(value < -7)
                System.out.println("Nested");


        int option = 40; // ça marche avec String aussi
        switch(option) {
            case 1:
                System.out.println("option = 1");
                // Executer si la condition est true
                break; // Sinon ça va exécuter toutes les cases
            case 2:
                System.out.println("option = 2");
                break;
            default:
                System.out.println("no option");
        }
    }
}
