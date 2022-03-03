public class SavingsAccount extends Account {

    public SavingsAccount(Client client, Bank bank) {
        super(client, bank);
    }

    @Override
    public void extractPrint() {
        System.out.println("=== Extrato Conta Poupança===");
        extracted();
    }

}
