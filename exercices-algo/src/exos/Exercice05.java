/*
 //5. lire 10000 nombres et trouver le plus grand.

 déclaration des variables
 entier n
 entier grand
	
 DEBUT
 ecrire "Saisissez le premier nombre:";
 lire n;
 grand <- n;
			
 pour i allant de 2 à 10000 pas de 1
 ecrire "Saisissez le nombre suivant:";
 lire n;

 si n > grand
 grand <- n;
 finsi;		
		
 finpour;
 ecrire "Le nombre le plus grand est " & grand;
 FIN
 */
package exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercice05 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int n;
        int grand;
        String saisie;

        System.out.print("Saisissez le 1er nombre: ");
        saisie = br.readLine();
        n = Integer.valueOf(saisie);
        grand = n;

        for (int i = 2; i <= 10; i += 1) {
            System.out.print("Saisissez le " + i + "e nombre: ");
            saisie = br.readLine();
            n = Integer.valueOf(saisie);
            if (n > grand) {
                grand = n;                
            }
        }
        System.out.println("Le nombre le plus grand saisi est: " + grand);

        br.close();
        isr.close();
    }
}
