
public class CheckingAccount extends Account {
    public CheckingAccount(Client client, Bank bank) {
        super(client, bank);
    }

    @Override
    public void extractPrint() {
        System.out.println("=== Extrato Conta Corretnte===");
        extracted();
    }

}
