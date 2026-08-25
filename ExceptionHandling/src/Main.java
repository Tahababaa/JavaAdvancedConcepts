import java.io.FileNotFoundException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            int x=10;
            System.out.println("1");
            int y=x/0;
            System.out.println("A"); // doesn't print
        }
        catch ( ArithmeticException e){
            System.out.println("D");
        }

        finally {
            System.out.println("K");
        }
    }
}