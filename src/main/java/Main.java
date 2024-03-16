public class Main {
    public static void main(String[] args) {
        // Testing Account class
        Account account = new Account(2000);
        System.out.println("Saldo: " + account.getBalance());
        account.deposit(1000);
        System.out.println("Saldo setelah deposit: " + account.getBalance());
        account.withdraw(400);
        System.out.println("Saldo setelah penarikan: " + account.getBalance());

        // Testing SavingAccount class
        SavingAccount savingAccount = new SavingAccount(4000, 0.05);
        System.out.println("\nSaldo Rekening Tabungan: " + savingAccount.getBalance());

        // Testing CheckingAccount class
        CheckingAccount checkingAccount = new CheckingAccount(6000, 2000);
        System.out.println("\nSaldo Rekening Checking: " + checkingAccount.getBalance());
        checkingAccount.withdraw(8000);
        System.out.println("Saldo setelah penarikan: " + checkingAccount.getBalance());
    }
}