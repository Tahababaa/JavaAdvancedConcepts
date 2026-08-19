public class RunningNumber implements Runnable{

    public void printing() throws InterruptedException {
        for(int i=0;i<=100;i++){
            Thread.sleep(2000);
            System.out.println("Number: "+i);
        }
    }
    @Override
    public void run() {
        try {
            printing();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
