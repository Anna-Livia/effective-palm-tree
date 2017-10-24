/*
//3. Afficher les nombres de n à m.
//Dans le cas où n est supérieur à m, Faire 3 versions
//c) Afficher de n à m (de manière décroissante).

déclaration des variables
	entier n
	entier m

DEBUT
	ecrire "Saisir l'entier n:";
	lire n;

	ecrire "Saisir l'entier m:";
	lire m;

	Si n <= m
		ecrire "Voici la liste des nombres de n à m:";
				pour entier i allant de n à m pas de 1
					ecrire i;
				finpour;

	sinon
		ecrire "Voici la liste des nombres de n à m, par ordre décroissant:";
			pour entier i allant de n à m pas de -1
				ecrire i;
			finpour;
	finsi;
FIN
 */
package exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercice03c {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        int n;
        int m;
        String saisie;
        
        System.out.println("Saisissez l'entier n: ");
        saisie = br.readLine();
        n = Integer.valueOf(saisie);
        
        System.out.println("Saisissez l'entier m: ");
        saisie = br.readLine();
        m = Integer.valueOf(saisie);
        
        if (n <= m){
            System.out.println("Voici la liste des entiers de " + n + " à " + m);
            for (int i = n; i <= m ; i += 1){
                System.out.println(i);
            }
        }
            
        else {
            System.out.println("Voici la liste des entiers de " + n + " à " + m);
            for (int i = n; i >= m ; i += -1){
                System.out.println(i);
                    
             }          
          
        }
        
        br.close();
        isr.close();
       
    }
    
}
