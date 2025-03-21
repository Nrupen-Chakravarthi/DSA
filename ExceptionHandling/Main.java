package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            divide(a, b);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
    public static int divide(int a, int b) throws ArithmeticException   {
        if(b == 0){
            throw new ArithmeticException("Pls do not divide by zero");
        }
        return a / b;
    }
}
