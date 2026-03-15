/* Q2 Write a menu driven program to perform the following operations
        i.	Calculate the volume of cylinder. (hint : Volume: π × r² × h)
        ii.	Find the factorial of given number.
        iii. Check the number is Armstrong or not.
        iv.	Exit
*/

import java.util.Scanner;

public class MenuDrivenDemo1 {
    
    Scanner scanner =  new Scanner(System.in);

    public void calcVolumeCylender(){

        System.out.println("Calc Volume of Cylender: ");

        System.out.println("Enter the Radius: ");
        double radius = scanner.nextDouble();

        System.out.println("Eneter the Height: ");
        double height = scanner.nextDouble();

        double volume = 3.14*radius*radius*height;

        System.out.println("Volume: "+volume);

    }



    public void findFactorial(){

        System.out.println("Calculate find Factorial");
        System.out.println("Eneter the Number for find the factorial");
        int num = scanner.nextInt();
        int fact = 1;

        for(int i = 1; i<= num; i++){
            fact = fact * i;
        }

        System.out.println("Factorial = "+fact);
    }



    public void checkArmstrong(){
        
        System.out.println("Check Number is Armastrong or Not:");
        System.out.println("Enet the Number for check Armstrong");

        int num = scanner.nextInt();
        int temp = num;
        int sum = 0;
        
        while (num !=0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }
        
        if (sum == temp) {
            System.out.println("Number is Armstrong");   
        }
        else{
            System.out.println("Number is not Armstrong: ");
        }
        

    }

    public static void main(String[] args) {
        
        MenuDrivenDemo1 menuDrivenDemo1 = new MenuDrivenDemo1();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;

            do{
                System.out.println("\n ****Select the Operation of Menu: ");
                System.out.println("\n 1 Calculate Volume of Cylender \n 2 Find The Factorial \n 3 Check Number Armstrong Or Not \n 0 Exit");
                
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                         menuDrivenDemo1.calcVolumeCylender();
                        break;

                    case 2:
                         menuDrivenDemo1.findFactorial();
                        break;

                    case 3:
                        menuDrivenDemo1.checkArmstrong();
                    default:
                         break;
                }


            }while (choice !=0);
        }
        {
            System.out.println("Program is Close");
        }

    }
}

