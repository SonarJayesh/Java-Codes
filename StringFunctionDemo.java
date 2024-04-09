   public class StringFunctionDemo {
        public static void main(String[] args) {

            String str = "Hello, World!";

            int length = str.length();
            System.out.println("Length of the string: " + length);

            char charAtIndex = str.charAt(7);
            System.out.println("Character at index 7: " + charAtIndex);

            String substring = str.substring(1, 7);
            System.out.println("Substring from index 1 to 7: " + substring);

            int indexOfW = str.indexOf("W");
            System.out.println("Index of 'W': " + indexOfW);

            String concatenated = str.concat(" Have a nice day!");
            System.out.println("Concatenated string: " + concatenated);

            String uppercase = str.toUpperCase();
            System.out.println("Uppercase string: " + uppercase);

            String lowercase = str.toLowerCase();
            System.out.println("Lowercase string: " + lowercase);
        }
    }