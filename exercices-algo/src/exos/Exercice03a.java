/*
//3. Afficher les nombres de n à m.
//Dans le cas où n est supérieur à m
//a) Afficher un message d'erreur et arrêter le programme.

déclaration des variables
	entier n
	entier m

DEBUT
	ecrire "Saisir l'entier n:";
	lire n;

	ecrire "Saisir l'entier m:";
	lire m;

	si n > m
		"Attention, n est supérieur à m!! ";
		
	sinon
		ecrire "Voici la liste des nombres de n à m";
			pour entier i allant de n à m pas de 1
				ecrire i;
			finpour;
			
	finsi;
FIN
 */
package exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercice03a {
    public static void main(String[] args) throws IOException{
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
        
        if (n > m ){
            System.out.println("Attention, n est supérieur à m!!");
        }
        else{
            System.out.println("Voici la liste des entiers de " + n + " à "+ m);
            for (int i = n; i <= m; i += 1)
                System.out.println(i);
        }     
        
        
      br.close();
    isr.close();
    }  
}
    
