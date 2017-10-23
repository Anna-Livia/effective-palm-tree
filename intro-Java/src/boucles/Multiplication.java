
package boucles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplication {
        public static void main(String[] args) throws IOException {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr); 
            
            int entier01;
            String saisi;
            System.out.println("Sasisir un entier:");
            saisi = br.readLine();          // lire saisi;
            entier01 = Integer.valueOf(saisi);
            System.out.println("---");
//            System.out.println("Vous avez saisi " + entier01);
            System.out.println("La table de multiplication de "+ entier01 + ":");
            System.out.println(">>>>>>boucle for");
            
            for(int i = 0; i<=10 ; i = i + 1){
                int produit = entier01 * i;
                System.out.println(entier01+ " * " + i + " = " + produit);
           }
            System.out.println("");
            System.out.println(">>>>>boucle while");
            int k = 0;
            while(k <= 10){
                int produit = entier01 * k;
                System.out.println(entier01+ " * " + k + " = " + produit);
                k = k + 1;
            }
            
        br.close();
        isr.close();
        }
        
}
