package homework;

public class FrancoisTesteLeJava {

    public static void main(String[] args) {

//        float prixbillets[];
//        prixbillets = new float[3];
//        float prixbillets[] = new float[3
        double prixbillets[] = {153.01, 153.01, 139.01};

        String passagers[] = {"Patricia", "Lilou", "Tom"};

        double somme;
        int i;

        for (i = 0, somme = 0; i < passagers.length; i++) {
            somme += prixbillets[i];
            System.out.println("Le billet de " + passagers[i] + "\t coûte " + prixbillets[i] + "€");

        }
        System.out.println("\nTotal pour la famille:" + "\t>> " + somme + "€ <<");
    }
}
