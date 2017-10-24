/*
//1. Afficher les nombres de 1 à 10. OK
DEBUT
	ecrire "Voici la liste des nombres de 1 à 10: ";
	
	pour entier i allant de 1 à 10 pas de 1
		ecrire i;
	finpour;
FIN
 */
package exos;

public class Exercice01 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i+= 1){
            System.out.println(i);
        }     
        
        
    }
}
