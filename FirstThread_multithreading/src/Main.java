//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello 1"); //

//        RunningNumber r1 = new RunningNumber();
//        Thread t1 = new Thread(r1);
//        t1.start(); // new thread handles  print function
        for(int i=1;i<=100;i++){
            IndividualNumberThread numThread = new IndividualNumberThread(i);
            Thread t2 = new Thread(numThread);
            t2.start(); // cannot guarantee which thread is used and when, so it will not print in order
        }
        System.out.println("Hello 2"); //prints immediately
    }
}
