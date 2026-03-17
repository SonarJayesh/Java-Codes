// Q5.	Write a program to accept n names of country and display them in descending order.

import java.util.Arrays;
import java.util.Scanner;

public class Q5_NameCountry_Dispaly_discOrder {

    Scanner scanner = new Scanner(System.in);
    public void counrty_Discending(){
        
        System.out.println("Enter the Number of Contries:");
        int n = scanner.nextInt();
        
        String country[] = new String[n];
        
        System.out.println("Enter the Country Names: ");
        for(int i=0; i<n;i++){

            country[i] = scanner.next(); 
        }

    
        Arrays.sort(country);

        System.out.println("Assending Order: ");
        for (int i = 0; i< country.length;i++) {
            
            System.out.println(country[i]);
        }

        System.out.println("Descending Order: ");
        for(int i = country.length-1; i>=0; i--){
            System.out.println(country[i]);
        }

    }
    
    public static void main(String[] args) {

        Q5_NameCountry_Dispaly_discOrder counrtyDiscending = new Q5_NameCountry_Dispaly_discOrder();
        counrtyDiscending.counrty_Discending();
    }

}