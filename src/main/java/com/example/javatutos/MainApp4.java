package com.example.javatutos;

/*
nommage de variables :
Pas de caractères spéciaux, pas d'espace
Commencer par une lettre ou underscore

uneVariableUnPeuLongue (camel case)
UneVariable (pascal case)
une_variable (snake case)
 */
public class MainApp4 {
    public static void main(String[] args) {

        int ageUtilisateur = 25; // Déclaration et Initialisation
        System.out.println(ageUtilisateur);

        ageUtilisateur = 143; // pas besoin de déclaration, ça s'utilise pas dans une autre classe
        System.out.println(ageUtilisateur);

        final int numbre = 27; // une constante peut pas changer la valeur

    }
}
