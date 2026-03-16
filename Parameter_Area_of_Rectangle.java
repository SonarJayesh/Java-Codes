// Q1 Write the program to Calculate Perimeter and area of Rectangle. (Using User input and Methods).

import java.util.Scanner;

class Parameter_Area_of_Rectangle{

    Scanner scanner =new Scanner(System.in);
    Double width, height;

    public void calcParameter(){

        System.out.println("**** CALCULATE PERIMETER OF RECTANGLE ****");

        System.out.println("Enter the Width for Calculating the Paramete of Rectangle: ");
        width = scanner.nextDouble();

        System.out.println("Enter the Height for Calculate the Parameter of Rectangle: ");
        height = scanner.nextDouble();

        Double parameter = 2*(width + height);
        System.out.println("Parameter of Rectangle is: "+parameter);
            
            
    }



    public void clacArea_Rectangle(){

        System.out.println("**** CALCULATE AREA OF RECTANGLE ****");

        System.out.println("Enter the Height for Claculate Area of Rectangle: ");
        height = scanner.nextDouble();

        System.out.println("Enter the Width for Claculate Area of Rectangle: ");
        width = scanner.nextDouble();        

        Double Area = height * width;
        System.out.println("Area of Rectangle: "+Area);

    }



    public static void main(String[] args) {

        Parameter_Area_of_Rectangle pArea_of_Rectangle = new Parameter_Area_of_Rectangle();
        
        pArea_of_Rectangle.calcParameter();
        pArea_of_Rectangle.clacArea_Rectangle();

    }
}