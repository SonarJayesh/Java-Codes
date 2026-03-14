/*
    Q4.	Write a menu driven program to perform the following operations on multidimensional array ie matrix :
        i. Addition 
        ii. Multiplication 
        iii. Transpose of any matrix. 
        iv. Exit 
*/

import java.util.Scanner;

public class MenuDriven_ArrayMatrix {

     Scanner scanner = new Scanner(System.in);
   
     //Addition 
    public void Addition(){

        System.out.println("Enter the Size of Rows and Cols: ");

        int r = scanner.nextInt();
        int c = scanner.nextInt();

        int [][] A = new int[r][c];
        int [][] B = new int[r][c];


        System.out.println("Enter the Element of First Matrix: ");
        for (int i = 0; i<r; i++){
            for(int j=0; j<c; j++){
                A[i][j] = scanner.nextInt();
            }
        }


        System.out.println("Enter the Element of Second Matrix: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                B[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Addition of Matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print( A[i][j] + B[i][j]+" ");
            }
            System.out.println();
        }

    }



    // Multiplication 
    public void Multiplication(){
        System.out.println("Multiplication of Matrix");

        System.out.println("Enter the Size of Rows and Column: ");
        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        
        int [][] A = new int[r1][c1];
        int [][] B = new int[r1][c1];
        
        System.out.println("Enter the First Matrix:");
        for(int i=0; i<r1; i++){
            for(int j =0; j<c1; j++){
                A[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Enter the Second Matrix: ");
         for(int i=0; i<r1; i++){
            for(int j =0; j<c1; j++){
                B[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Multiplication of Matrix:");
        
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print( A[i][j] * B[i][j]+" ");
            }
            System.out.println();
        }
    }



    public void Transpose(){
        System.out.println("Transpose of Matrix");
        System.out.println("Enter the Rows and Colum :");
        
        int r = scanner.nextInt();
        int c = scanner.nextInt();

        int [][] matrix = new int[r][c];


        System.out.println("Enter the Matrix: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<c; i++){
            for(int j=0;j<r;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }


    
    public static void main(String[] args) {
        
       try (Scanner scanner = new Scanner(System.in)) {
        int choice;
         MenuDriven_ArrayMatrix mDriven_ArrayMatrix = new MenuDriven_ArrayMatrix();
        
        do{
            System.out.println("\n===== MATRIX MENU =====");
            System.out.println("\n 1 Matrix Addition: \n 2 Matrix Multiplication \n 3 Matrix Transpose \n 4 Exit");
            System.out.println("Enter Your Choice: ");
           choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    mDriven_ArrayMatrix.Addition();
                    break;

                case 2:
                    mDriven_ArrayMatrix.Multiplication();
                    break;

                case 3:
                    mDriven_ArrayMatrix.Transpose();
                    break;    
                default:
                    break;
            }
        }
        while (choice !=4);
       }
        {

            System.out.println("Program is Close");
        }

    }
}
