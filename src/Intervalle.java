import java.util.Scanner;

public class Intervalle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x;
while(true){
    System.out.print("Enter un nombre décimal:\n");
    x= scanner.nextDouble();
    if( (x<3 && !(x<2) )   ||  ((x<1 || x==1) && !(x<0 || x==0)) || ((x<-2 || x==-2 ) && !(x<-10) ) ){
        System.out.println("x appartient a I");
    }
    else System.out.println("x n'appartient pas a I");
}










    }
}
