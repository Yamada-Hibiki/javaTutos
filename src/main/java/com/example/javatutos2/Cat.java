package com.example.javatutos2;

public class Cat {  // Costructeur permet de construire un objet
    public Cat(String name, int age) {
        this.mName = name;
        this.mAge = age;// this, instance en court
        System.out.println(this.mName + "-" + this.mAge);
    }
    // attribut, variable appartient à une classe, pas à une classe de main
    private String mName;  // m, membre d'une classe, déclaration des attributs
    private int mAge;
}
