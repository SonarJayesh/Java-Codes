/**
 * InvertedHalfPyramid180deg
 */
import java.util.Scanner;
public class InvertedHalfPyramid180deg {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = scanner.nextInt();

        for(int i = 0; i< num; i++){

            for(int j = 0; j <num-i; j++){
                System.out.print(" ");
            }


        for(int j = 0;j<i;j++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
}