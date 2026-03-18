/*
    6.	Write a menu driven program to perform the following operations on 2D array:
        i. Sum of diagonal elements 
        ii. Sum of upper diagonal elements 
        iii. Sum of lower diagonal elements 
        iv. Exit 

*/
import java.util.Scanner;

public class Q6_MenuDriven_2DArray {

    Scanner scanner = new Scanner(System.in);

    int[][] matrix = new int[3][3];
    int sum = 0;


    public void sumOFDiagonal_Element(){   
        System.out.println("Enter the 3 x 3 Matrix:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }     
        
        System.out.println("Matrix is: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }  

        for(int i=0;i<3;i++){
            sum += matrix[i][i];
            System.out.print("Diagonal Element is: "+matrix[i][i]);
        }
            System.out.println("Sum of Diagonal Elemets"+sum+"\n");
        
    }    



    public void sumOF_Upper_Diagonal_Element(){
        System.out.println("Enter the 3x3 Matrix: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix is: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if (i < j) {
                    sum += matrix[i][j]; 
                }
            }
        }
        System.out.println("Sum of Upper Diagonal Elemets:"+sum);
    }

    public void sumOf_Lower_Diagonal_Element(){
        System.out.println("Enter the 3x3 Matrix: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix is: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if (i>j) {
                    sum += matrix[i][j]; 
                }
            }
        }
        
        System.out.println("Sum of Lower Diagonal Elemets: "+sum);
    }




    public static void main(String[] args) {
        Q6_MenuDriven_2DArray mDriven_2dArray = new Q6_MenuDriven_2DArray();
        int choice;
        try (Scanner scanner = new Scanner(System.in)) {
            do{
                System.out.println("***Menu Driven 2D Array***");
                System.out.println("\n 1. Sum of diagonal elements \n 2. Sum of upper diagonal elements \n 3. Sum of lower diagonal elements 4. Exit");
                System.out.println("Enter your Choice: ");
                choice = scanner.nextInt();
               
                switch (choice) {
                    case 1:
                        mDriven_2dArray.sumOFDiagonal_Element();
                        break;
                
                    case 2:
                        mDriven_2dArray.sumOF_Upper_Diagonal_Element();
                        break;
                        
                    case 3:
                        mDriven_2dArray.sumOf_Lower_Diagonal_Element();
                        break;

                    default:
                        break;
                }

            }while(choice !=0);
        }
        {
            System.out.println("Prgram is Closed!!");
        }

        
    }
}
