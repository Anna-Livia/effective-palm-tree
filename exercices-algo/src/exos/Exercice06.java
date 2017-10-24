
 //6. lire 10000 nombres et trouver le plus petit et son rang.
/*
 déclaration des variables
 entier n
 entier petit
 entier rang

 DEBUT
 ecrire "Saisissez les nombres:"
 lire n;
 petit <- n;
 rang <- 1;
		
 pour i allant de 2 à 10000 pas de 1
 lire n;
 si n < petit
 petit <- n;
 rang <- i;
 finsi;
		
 finpour;
	
 ecrire "Le nombre le plus petit est " & petit & " et son rang est " & rang
 FIN
 */
package exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercice06 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int n;
        int petit;
        int rang;
        String saisie;

        System.out.println("Saissez le 1er nombre");
        saisie = br.readLine();
        petit = Integer.valueOf(saisie);
        rang = 1;

        for (int i = 2; i <= 10; i += 1) {
            System.out.println("Saissez le " + i + "e nombre");
            saisie = br.readLine();
            n = Integer.valueOf(saisie);

            if (n < petit) {
            petit = n;
            rang = i;
            }
        }
        
        System.out.println("Le plus petit nombre saisi est: " + petit + 
                " et son rang est: " + rang );
        
        br.close();
        isr.close();
    }
}
