package access;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(5000);
        System.out.println("balance = " + account.getBalance());

    }
}//class
