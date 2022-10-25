class BouclesEquivalentes {

    public static void main(String[] args) {
        System.out.println("Boucle for :");
        for (int a = 3; a <= 10; a++) {
            System.out.println("a : " + a);
        }

        System.out.println("Boucle while :");
        int a=3;
        while(a<=10){
            System.out.println("a : " + a);
            a++;
        }
        // A compléter. Ecrivez une boucle while qui fait la même chose
        // que la boucle for ci-dessus

        System.out.println("Boucle do..while :");

        int i=3;
        do{
            System.out.println("a : " + i);
            i++;
        }while(i<=10);
        // A compléter. Ecrivez une boucle do..while qui fait la même
        // chose que la boucle for ci-dessus.




    }
}
