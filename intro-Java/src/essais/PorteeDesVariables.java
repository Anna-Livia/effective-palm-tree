package essais;


public class PorteeDesVariables {
    public static void main(String[] args){
        System.out.println("---------------- debut du main ---------------");
        
        String message = "Bonjour";
        // System.out.println(message);        
        int age = 25;
        int anneeNaissance = 2017 - age;
        String msg = message + ", vous êtes né(e) en " + anneeNaissance;
        System.out.println(msg);

        System.out.println();
       
        //bloc de code
        {
            System.out.println("\t>>> debut du bloc"); // \t permet de tabuler
            String nom = "Titi";
            message = "Hello";                // je peux réutiliser une variable déclarée à l'extérieur du bloc
            System.out.println(message + " " + nom);
            System.out.println("\t>>> fin du bloc"); 
           
        }
       
       //System.out.println(nom);   // on ne peut plus accéder à la variable nom
       //message = "Au revoir";
       System.out.println(message);
        
       System.out.println("---------------- fin du main ---------------");
    }

}
