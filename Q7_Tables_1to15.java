//Q7 Write a program to display the 1 to 15 tables.


public class Q7_Tables_1to15 {
    public static void main(String[] args) {

        for(int i=1; i<=15; i++){

            System.out.println("\nTable Of: "+ i);
            System.out.println();
            for(int j=1; j<=10; j++){

                System.out.println(i+" * "+j+" = "+(i*j));
            }
        }
    }
}
