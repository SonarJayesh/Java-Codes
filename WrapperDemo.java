   public class WrapperDemo {
        public static void main(String[] args) {
            // Example of Integer wrapper class
            Integer intObj1 = new Integer(10); // Using constructor
            Integer intObj2 = Integer.valueOf(20); // Using valueOf method

            // Example of Double wrapper class
            Double doubleObj1 = new Double(3.14); // Using constructor
            Double doubleObj2 = Double.valueOf("6.28"); // Using valueOf method


  // Printing values
            System.out.println("Integer objects: " + intObj1 + ", " + intObj2);
            System.out.println("Double objects: " + doubleObj1 + ", " + doubleObj2);


            // Example of Autoboxing and Unboxing
            int primitiveInt = intObj1; // Autoboxing - Converting Integer object to int
            double primitiveDouble = doubleObj2; // Autoboxing - Converting Double object to double


            Integer intObj3 = 5; // Autoboxing - Converting int to Integer object
            Double doubleObj3 = 2.718; // Autoboxing - Converting double to Double object


            System.out.println("Primitive int: " + primitiveInt);
            System.out.println("Primitive double: " + primitiveDouble);

            System.out.println("Integer object: " + intObj3);
            System.out.println("Double object: " + doubleObj3);

    }
}