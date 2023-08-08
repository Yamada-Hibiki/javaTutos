package com.example.javatutos;

/*
= Affactation
+ Concaténation

+ - * / %: le reste  ()
== la valeur
=== la valeur et le type
!=
<
>
<=, >=
+=, -=, *=, /=
x = x + 1
x ++ post incrémentation:  copier puis +1| ++ x pré incrémentation:  calcul puis affectation
x -- post décrementation | -- x pré décrementation
 */

public class MainApp5 {
    public static void main(String[] args) {
        int age = 24;
        System.out.println("Tu as " + age + " ans");

        int result = 5 % 2;
        System.out.println(result);

        int positive = +14;
        int negative = -14;
        boolean myVar = true;
        boolean myVarReversed = !true;
        System.out.println(myVarReversed);

        int experience = 10;
        experience = experience +20;
        experience += 20;
        System.out.println(experience);

        int nb1  = 1;
        int nb2 = nb1++; // nb2 = nb1 puis nb1 += 1

        int nbb1 = 1;
        int nbb2 = ++nbb1; // nbb1 += 1 puis nbb2 = nbb1

    }
}
