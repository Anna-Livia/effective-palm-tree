package boucles;

public class Boucle01 {
    public static void main(String[] args){
        System.out.println(">>>>>>>>>>> début ");
        System.out.println("-------------boucle for----------------");
        
        for(int i = 1 ; i <= 10; i = i + 1) {
            System.out.println(i +") Victor Hugo est né le 26 février 1802");    
        }
        
        System.out.println("\n-------------- boucle while---------------");
        int j = 1;
        while(j<=5) {
            System.out.println(j +") Victor Hugo est né le 26 février 1802"); 
            j = j + 1;
        }
        
        
        System.out.println("\n---------------boucle do...while----------");
        int k = 100;
        do{
        System.out.println(k +") Victor Hugo est né le 26 février 1802"); 
            k = k + 1;
            
        }while(k<=5);
        
        
        System.out.println(">>>>>>>>>>> fin ");
        
    }
}
