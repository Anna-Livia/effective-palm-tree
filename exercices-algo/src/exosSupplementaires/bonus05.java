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

public class bonus05 {

    public static void main(String[] args) {

        String debut;
        String ligne;
        int nblignes = 300;

        for (int i = 1; i <= nblignes; i++) {
            ligne = "";
            if (i % 2 == 1) {         // rang impair
                debut = "OX";

            } else {                    // rang pair
                debut = "XO";
            }

            for (int j = 2; j <= nblignes / 2; j++) {
                ligne = ligne + debut;
            }

            System.out.println(ligne);
        }

    }
}
