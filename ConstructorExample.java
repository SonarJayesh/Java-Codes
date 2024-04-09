 
    public class ConstructorExample { 
        private int num; 
 
        public ConstructorExample() { 
            num = 0; 
        } 
 
        public ConstructorExample(int value) { 
            num = value; 
        } 
 
        public void display() { 
            System.out.println("Value of num: " + num); 
        } 
 
        public static void main(String[] args) { 
            ConstructorExample obj1 = new ConstructorExample(); 
            obj1.display();  
 
            ConstructorExample obj2 = new ConstructorExample(10); 
            obj2.display();  
        } 
    }