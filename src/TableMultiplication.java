import java.util.Scanner;

public class TableMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<=10;i++ ){
            System.out.println("Table de multiplication de "+i+ ":");
            for(int j=0; j<=10; j++){
                System.out.println( i + " * "+ j + " = " + i*j );
            }
            System.out.println("+++++++++++++++");
        }



    }
}
