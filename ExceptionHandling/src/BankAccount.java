public class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance=balance;

    }
    public void withdraw(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Amount cannot be 0 or negative!");
        }
        else if(amount<=balance){
            System.out.println("Rs. "+amount+" withdrawn from account. New balance: "+(balance-amount));
            balance=balance-amount;
        }
        else{
            throw new IllegalArgumentException("You don't have Rs "+amount+" in your account! Current Balance is Rs "+balance);
        }
    }
}
