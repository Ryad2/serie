import java.util.Scanner;

public class BIlan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        double totale = 0;
        double max=0;
        double min=10000;

        System.out.print("Donnez n:");
        n= scanner.nextInt();

        for (int i=0 ; i <n ; ++i) {

            double valeur;


            System.out.print("Donnez le montant du mois " + i + "(Frs):");
            valeur= scanner.nextDouble();

            if(max<valeur) max=valeur;
            if(min>valeur) min=valeur;
            totale+=valeur;

        }



        System.out.println("La somme mensuelle moyenne reçue est: " + totale/n);
        System.out.println("Le montant mensuel minimal reçu est: "+ min);
        System.out.println("Le montant mensuel maximal reçu est:" + max);

    }
}