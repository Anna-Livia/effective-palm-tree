package tests;

public class Conditionnel {

    public static void main(String[] args) {
        System.out.println("---------------debut-----------");
        int entier01 = 100;
        int entier02 = 600;

        if (entier01 >= entier02) {
            System.out.println(entier01 + " est supérieur à " + entier02);
        } else {        // on met else sur la même ligne que l'accolade de fin de if
        System.out.println(entier01 + " est strictement inférieur à " + entier02);
        }
        
        int entier03 = -5;
               
        if (0 <= entier03 && entier03 <= 9) {
            String texte = " s'écrit avec un seul caractère";
            System.out.println(entier03 + texte);
        } else {
// je suis dans un nouveau bloc donc je peux déclarer une nouvelle variable texte
            String texte = " s'écrit avec au moins deux caractères";     
            System.out.println(entier03 + texte);
        }
// autre méthode: un autre if avec OU logique        
//        if(entier03<0 || entier03 > 9 ){
//            String texte = " s'écrit avec au moins deux caractères";     
//            System.out.println(entier03 + texte);

//        }     
        
        if(entier01 % 2 == 0) {
            System.out.println(entier01 + " est pair");
        } else {
           System.out.println(entier01 + " est impair"); 
        }
        
        
        System.out.println("----------------fin------------");
    }
}
