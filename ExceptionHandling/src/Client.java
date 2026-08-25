public class Client {
    public static void main(String[] args) {

        System.out.println(divide(10,1));
        System.out.println(divide(23,3));
        System.out.println(divide(33,7));
        System.out.println(divide(12,0));


    }
    public static int divide(int numerator, int denominator){
        try {
            return numerator/denominator;
        }
        catch (ArithmeticException e){
            System.out.println("Divide by zero is not allowed!");
        }
        finally {
            System.out.println("Divide operation ended");
        }
        return 0; // finally doesn't end the program, it will print 0 too
    }
}
