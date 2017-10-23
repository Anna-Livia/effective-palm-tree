package essais;

public class AppliMain01 {
        public static void main(String[] args){
       
        System.out.println("Hello world !");
        
        int i; // declaration d'une variable i de type entier
        int j;
        
        i = 30; // affectation
        j = 20;
        
        int  somme; // declaration de variables
        somme = i + j; // affectation
        
        int produit = i * j; // declaration et affectation en même temps
        
        System.out.println(i + " + " + j + " = " + somme);
        System.out.println(i + " x " + j + " = " +  produit);
        System.out.println("--------------------------------------------");
        
        float pi = 3.14f;
        float rayon = 4;
        
        float produit02 = 2 * pi * rayon;
        System.out.println("Le périmètre d'un cercle de rayon " + rayon + " est: " + produit02);
       
        System.out.println("--------------------------------------------");
        
        i = 15;
        j = 2;
        
        float quotient01 = i / j;
        System.out.println("quotient =  " + quotient01);
        
        float x = 15;
        float y = 2;
        float quotient02 = x / y;
        System.out.println("quotient02 =  " + quotient02);
             
    }      
}
