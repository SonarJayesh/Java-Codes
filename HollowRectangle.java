import java.util.Scanner;
public class HollowRectangle {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int row = sc.nextInt();

        System.out.println("Enter the Number of Column");
        int Column = sc.nextInt();

        for(int i=1; i<=row; i++){

            for(int j = 1;j<=Column; j++){

                if(i==1 || j==1 || i==row || j==Column){

                     System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
