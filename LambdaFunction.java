@FunctionalInterface
interface Calc {
    int add(int a,int b);
}

public class LambdaFunction {
    public static void main(String[] args) {
        Calc calc = (a,b) -> a+b;
        int sum = calc.add(10,20);
        System.out.println("Addition: "+sum);
    }
}
