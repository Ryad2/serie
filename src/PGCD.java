import java.util.Scanner;

public class PGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b,c,d;

        System.out.print("Entrez le premier nombre positif :");
        a= scanner.nextInt();
        c=a;
        System.out.print("Entrez le second nombre positif :");
        b= scanner.nextInt();
        d=b;

        while(a!=b && a>0){

            if(b>a){
                int temp=b;
                b=a;
                a=b;
            }
            a-=b;
            System.out.println(a +"  "+  b);
        }
        System.out.println("Le plus grand diviseur commun de "+ c+" et "+d+" est " + a);
    }
    }
