public class Client3 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(2999);
        BankAccount b2 = new BankAccount(100);
        BankAccount b3 = new BankAccount(7866);

        performWithdrawal(b1,200);
        performWithdrawal(b2,3999);
        performWithdrawal(b1,2800);
        performWithdrawal(b3,20);




    }
    static void performWithdrawal(BankAccount account, int amount) {
        try {
            account.withdraw(amount);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction Completed!");
        }
    }
}
