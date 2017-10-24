/*
 Début
 Tab Entier suite[7]     //on définit un tableau "suite" de 8 emplacements pour entiers
 suite[0] <-  1 		//on affecte 1 au rang 0 et au rang 1
 suite[1] <-  1
 Pour Entier i allant 2 à 7 par pas de 1     //On boucle à partir du rang 2               
 suite[i] <- suite[i-1] + suite[i-2] 	//on affecte à un élement la somme des 2 rangs précédents
 finPour
 Pour Entier j allant 0 à 7 par pas de 1 
 Ecrire suite[j]			//puis on affiche le contenu du tableau suite
 finPour
 Fin
 */
package exosSupplementaires;

public class bonus03 {

    public static void main(String[] args) {

        int tableau[] = new int[8];
        tableau[0] = 1;
        tableau[1] = 1;

        for (int i = 2; i < tableau.length; i++) {
            tableau[i] = tableau[i - 2] + tableau[i - 1];
        }

        // VERIFICATION
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("rang " + i + " : " + tableau[i]);
        }

    }
}
