
public class ATM {
    private double balance;

    public ATM(double balance){
        this.balance=balance;
    }
    public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
        if(amount<1){
            throw new InvalidAmountException("Amount you entered in Invalid!");
        }
        else if(amount>balance){
            throw new InsufficientBalanceException("You don't have enough money in your Account");
        }

        balance-=amount;
        System.out.println("Withdrawal successful! \n Remaining balance: "+balance);

    }
}
