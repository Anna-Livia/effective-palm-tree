//Bous01
//Ecrire un algorithme qui demande un nombre compris entre 10 et 20, 
//jusqu'à ce que la réponse convienne. 
//En cas de réponse supérieure à 20, on fera apparaître un message : « Plus petit ! », 
//et inversement, « Plus grand ! » si le nombre est inférieur à 10.
package exosSupplementaires;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bonus01 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        float min = 10;
        float max = 20;

        System.out.println("Choisissez un nombre entre 10 et 20");
        float n;
        String saisie;

        saisie = br.readLine();
        n = Float.valueOf(saisie);

        while (n < min || n > max) {
            if (n < min) {
                System.out.println(">>Plus grand que ça!");
            }
            if (n > max) {
                System.out.println(">>Plus petit que ça");

            }
            System.out.print("Essayez à nouveau: ");
             saisie = br.readLine();
             n = Float.valueOf(saisie);
            
        }

        System.out.println("-----------------------------\nBien joué !!");
        
        br.close();
        isr.close();
    }
}
