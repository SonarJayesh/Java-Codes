/*
    Q4.	Write a menu driven program to perform the following operations on multidimensional array ie matrix :
        i. Addition 
        ii. Multiplication 
        iii. Transpose of any matrix. 
        iv. Exit 
*/

import java.util.Scanner;

public class MatrixMenuProgram {

    static Scanner sc = new Scanner(System.in);

    
   
    static void addition() {

        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] A = new int[r][c];
        int[][] B = new int[r][c];

        System.out.println("Enter First Matrix:");
        inputMatrix(A, r, c);

        System.out.println("Enter Second Matrix:");
        inputMatrix(B, r, c);

        System.out.println("Result Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print((A[i][j] + B[i][j]) + " ");
            }
            System.out.println();
        }
    }

    // ================= MULTIPLICATION =================
    static void multiplication() {

        System.out.print("Enter rows and columns of First Matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.print("Enter rows and columns of Second Matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Multiplication Not Possible!");
            return;
        }

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] result = new int[r1][c2];

        System.out.println("Enter First Matrix:");
        inputMatrix(A, r1, c1);

        System.out.println("Enter Second Matrix:");
        inputMatrix(B, r2, c2);

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Result Matrix:");
        printMatrix(result, r1, c2);
    }

    // ================= TRANSPOSE =================
    static void transpose() {

        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter Matrix:");
        inputMatrix(matrix, r, c);

        System.out.println("Transpose Matrix:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    // ================= COMMON METHODS =================
    static void inputMatrix(int[][] mat, int r, int c) {
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();
    }

    static void printMatrix(int[][] mat, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== MATRIX MENU =====");
            System.out.println("1. Matrix Addition");
            System.out.println("2. Matrix Multiplication");
            System.out.println("3. Matrix Transpose");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addition();
                    break;

                case 2:
                    multiplication();
                    break;

                case 3:
                    transpose();
                    break;

                case 4:
                    System.out.println("Program Exited.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);
    }
}