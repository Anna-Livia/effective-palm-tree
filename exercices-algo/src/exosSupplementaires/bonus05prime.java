/*
 // Un damier de dimension 4x4 peut se réprésenter de la forme suivante:
 // oxox
 // xoxo
 // oxox
 // xoxo
 // Votre programme doit afficher un damier de taille 40x40.
 // Assurez-vous bien que la case tout en haut à gauche contienne un "o", comme c'est le cas dans le damier ci-dessus
 */
package exosSupplementaires;

import java.util.Collections;

public class bonus05prime {

    public static void main(String[] args) {

        String debut;
        int taille = 100;

        for (int i = 1; i <= taille; i++) {
            if (i % 2 == 1) {         // rang impair
                debut = "ox";
            } else {
                debut = "xo";
            }

            System.out.println(String.join("", Collections.nCopies(taille / 2, debut)));

        }

    }
}
