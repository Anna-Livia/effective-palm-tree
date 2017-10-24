/*
 //7. lire n nombres et en calculer la moyenne.

 déclaration des variables
 decimal a
 decimal somme
 entier n

 DEBUT

 somme <- 0;

 ecrire "Combien de nombres?;
 lire n;
	
 ecrire "Saisissez les nombres:";
	
 Pour i allant de 1 à n pas de 1
 lire a;
 somme <- somme + a;
 FinPour;
	
 ecrire "La moyenne de ces nombres est " & somme/n;

 FIN
 */
package exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercice07 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int n;
        int a;
        double somme = 0;
        String saisie;

        System.out.println("Combien de nombres allons-nous étudier?");
        saisie = br.readLine();
        n = Integer.valueOf(saisie);

        System.out.println("Saissez le 1er nombre");
        saisie = br.readLine();
        a = Integer.valueOf(saisie);
        somme = (somme + a);

        for (int i = 2; i <= n; i += 1) {
            System.out.println("Saissez le " + i + "e nombre");
            saisie = br.readLine();
            a = Integer.valueOf(saisie);
            somme = (somme + a);
        }

        System.out.println("La somme de ces " + n + " nombres est:" + somme);

        br.close();
        isr.close();
    }
}
