//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(10000);
        ATM atm2 = new ATM(100);
        ATM atm3 = new ATM(5000);
        ATM atm4 = new ATM(7800);

       AtmWithdrawal(atm,2300);
        AtmWithdrawal(atm2,100);
        AtmWithdrawal(atm3,4900);
        AtmWithdrawal(atm4,12409);
        AtmWithdrawal(atm2,100);

    }
    static void AtmWithdrawal(ATM atm,double amount){
        try {
            atm.withdraw(amount);

        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("ATM transaction completed.");
        }
    }
}