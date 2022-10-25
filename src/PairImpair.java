import java.sql.SQLOutput;
import java.util.Scanner;

public class PairImpair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
do {


    System.out.print("Enter un nombre entier: ");
    int entier = scanner.nextInt();
    System.out.print(   " Le nombre est ");
    if (entier == 0) System.out.println("egale a zero (et il est pair)");
    else {


        if (entier < 0) System.out.print("negatif");
        if (entier > 0) System.out.print("positif");
        if (entier % 2 == 0) System.out.println(" et pair ");
        else System.out.println(" et impair");
    }
}while(true);




    }
}
