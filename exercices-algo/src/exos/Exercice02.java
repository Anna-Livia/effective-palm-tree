/*
//2. Afficher la somme des nombres de 1 à 10. OK

//déclaration des variables
entier somme

DEBUT
somme <- 0;
	pour entier i allant de 1 à 10 pas de 1
		somme <- i+somme;
	finpour;
ecrire "La somme des nombres de 1 à 10 est: " & somme;
FIN
 */
package exos;

public class Exercice02 {
    public static void main(String[] args){
        int somme = 0;
        for (int i=1 ; i <= 10; i+=1){
            somme= somme + i;
            System.out.println(somme);
        }
        
    }
    
}
