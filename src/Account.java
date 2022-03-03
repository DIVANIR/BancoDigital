
public abstract class Account {

    private int DEFAULT_AGENCY = 1234;
    private int SEQUENTIAL = 1;

    protected int number;
    protected int agency;
    protected double balance;
    protected Client client;

    public Account(Client client, Bank bank) {
        this.agency = DEFAULT_AGENCY;
        this.number = SEQUENTIAL++;
        this.client = client;
        bank.addNewAccount(this);
    }

    public void toWithdraw(double value) {
        balance -= value;
    }

    public void toDeposit(double value) {
        balance += value;
    }

    public void toTransfer(double value, Account account) {
        this.toWithdraw(value);
        account.toDeposit(value);
    }

    public int getNumber() {
        return number;
    }

    public int getAgency() {
        return agency;
    }

    public double getBalance() {
        return balance;
    }

    public void extractPrint() {
    }

    protected void extracted() {
        System.out.println(String.format("Agencia %d", this.agency));
        System.out.println(String.format("Titular %s", this.client.getName()));
        System.out.println(String.format("Conta %d", this.number));
        System.out.println(String.format("Saldo R$%.2f", this.balance));
    }

    @Override
    public String toString() {
        return String.format("\nTitular: " + this.client.getName() + "\nSaldo: R$%.2f", this.balance);
    }
}
