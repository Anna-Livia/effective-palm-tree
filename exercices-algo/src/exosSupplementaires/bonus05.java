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

    public static void main(String[] args){
       
        String debut;
        String ligne;

        for (int i = 1; i <= 500; i++) {
            
            if (i % 2 == 1) {         // rang impair
                debut = "ox";
                ligne = debut;
            } else {
                debut = "xo";
                ligne = debut;
            }

            for (int j = 1; j <= 500; j++) {
                ligne = ligne + debut;

            }
            System.out.println(ligne);
        }
      
    }
}