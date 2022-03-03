public class App {
    public static void main(String[] args) throws Exception {
        Bank bank = new Bank();

        Client client = new Client();
        client.setName("Divanir de Jesus Silva");

        Account checkingAccount = new CheckingAccount(client, bank);
        Account savingsAccount = new SavingsAccount(client, bank);

        checkingAccount.toDeposit(25);
        checkingAccount.toWithdraw(2.5);
        checkingAccount.toTransfer(10, savingsAccount);

        // checkingAccount.extractPrint();
        // savingsAccount.extractPrint();

        bank.pintAccounts();

    }
}
