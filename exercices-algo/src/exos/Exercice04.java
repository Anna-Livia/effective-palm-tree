/*
 //4. Afficher la somme des nombres pairs de n à m.
 //(interdiction d’utiliser le MODULO)

 déclaration des variables
 entier n
 entier nproche
 entier m
 entier somme
 entier temp

 DEBUT
 ecrire "Saisir l'entier n:";
 lire n;
 ecrire "Saisir l'entier m:";
 lire m;

 somme <- 0

 si n > m            //on permute n et m pour que le curseur i soit heureux
 temp <- n;
 n <- m;
 m <- temp;
 finsi;

 si 2*(n/2) <> n             // si n est impair
 nproche <- n+1
 sinon
 nproche <- n        // si n est pair
 finsi;
	

 pour i allant de nproche à m pas de 2
 somme <- i+somme;
 finpour;

 ecrire "La somme des nombres pairs de " & n & "à " & m & " est: " & somme 
 FIN
 */
package exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercice04 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int n;
        int m;
        String saisie;

        System.out.print("Saisissez le nombre n: ");
        saisie = br.readLine();
        n = Integer.valueOf(saisie);

        System.out.print("Saisissez le nombre m: ");
        saisie = br.readLine();
        m = Integer.valueOf(saisie);

        if (m < n) {
            int temp;
            temp = n;
            n = m;
            m = temp;
        }

        int nproche;

        if ((n % 2) != 0) {                        // si n est impair
            nproche = n + 1;
        } else {                                   // si n est pair
            nproche = n;
        }

        int somme = 0;

        for (int i = nproche;
                i <= m;
                i += 2) {
            somme = somme + i;
        }

        System.out.println(
                "La somme des entiers compris entre " + n + " et " + m + " est: " + somme);

        br.close();

        isr.close();
    }
}
