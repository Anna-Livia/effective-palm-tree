/*
 Début
 Tab Entier nb[6] 	// on crée un tableau nb contenant 6 emplacements pour entiers
 Pour Entier i allant de 0 à 5 par pas de 1
 nb[i] <- i * i			// on met à chaque rang le carré du rang
 finPour
 Pour Entier j allant de 0 à 5 par pas de 1 	// on parcourt le tableau et
 Ecrire nb[j]									// on affiche chaque élément
 finPour
 Fin
 */
package exosSupplementaires;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bonus02 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int tableau[] = new int[6];

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = i * i;

        }
// VERIFICATION
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("rang " + i + " : " + tableau[i]);
        }

        br.close();
        isr.close();

    }
}
