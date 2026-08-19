public class IndividualNumberThread implements Runnable{
    int num;

    public IndividualNumberThread(int num){
        this.num=num;
    }
    @Override
    public void run(){
        System.out.println(num);
    }
}
