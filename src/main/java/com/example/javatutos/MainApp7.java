package com.example.javatutos;

public class MainApp7 {
    public static void main(String[] args) {
        int i = 0;
        while(i != 10) {  // Tant que c'est True ça exécute
            System.out.println(i);   // Si il y a qu'une seule instruction, pas besoin d'ccolade
            i++;
            // break, ça permet de sortir de la boucle
            if(i == 5) {
                break;
            }
        }

        int j = 0;
        while(j != 10) {
            j++;
            if(j == 5)
                continue; // Cela permet de revenir au début de la boucle

            System.out.println(j);
        }

        int k = 0;
        do {
            k++;
            if(k == 5)
                continue;
            System.out.println(k);
        } while (k != 10);

        for(i = 0; i != 10; i++) {
            System.out.println(i + " desu");
        }

    }
}
