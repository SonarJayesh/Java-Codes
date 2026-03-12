/*
    Q3.  Write a program to accept the array element and display in reverse order. 
*/

import java.util.Scanner;

public class ArrayElement_Reverse {
    Scanner  scanner = new Scanner(System.in);

    
    public void inputArray(){
            System.out.println("Enter Number of Element: ");
            int num = scanner.nextInt();

            int[] arr = new int[num];

            System.out.println("Enter the Array Elements: ");
            for(int i=0; i<num; i++){

                arr[i] = scanner.nextInt();
                
            } 
           
            System.out.println("Reverse Array is");
           
                for(int i=arr.length-1; i>=0;i--){

                System.out.println(arr[i]);
            }

    }

    public static void main(String[] args) {

        ArrayElement_Reverse arrayElement_Reverse = new ArrayElement_Reverse();
        arrayElement_Reverse.inputArray();

    }
}
