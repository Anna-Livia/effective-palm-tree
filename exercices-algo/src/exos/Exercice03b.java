/*
//3. Afficher les nombres de n à m.
//Dans le cas où n est supérieur à m, Faire 3 versions
//b) Permuter n et m, puis continuer.

déclaration des variables
	entier n
	entier m
	entier temp		// nous permettra de permuter n et m

DEBUT
	ecrire "Saisir l'entier n:";
	lire n;

	ecrire "Saisir l'entier m:";
	lire m;

	si n > m
			temp <- m;
			m <- n;
			n <- temp;
	finsi;
			
	ecrire "Voici la liste des nombres de n à m:";
		pour entier i allant de n à m pas de 1
			ecrire i;
		finpour;

FIN
 */
package exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercice03b {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        int n;
        int m;
        int temp;
        String saisie;
        
        System.out.print("Saisissez l'entier n: ");
        saisie = br.readLine();
        n = Integer.valueOf(saisie);
        
        System.out.print("Saisissez l'entier m: ");
        saisie = br.readLine();
        m = Integer.valueOf(saisie);
        
        if (n > m){
            temp = m;
            m = n;
            n = temp;
            System.out.println("Je permute n et m, donc désormais n= " + n + " et m= " + m);
        }
        
        System.out.println("Voici la liste des entiers de n à m");
        
        for (int i = n; i <= m ; i+= 1){
            System.out.println(i);
        }
        
        
        
        br.close();
        isr.close();
               
    }
}
