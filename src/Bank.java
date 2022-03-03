import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts = new ArrayList<Account>();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNewAccount(Account account) {
        accounts.add(account);
    }

    public void pintAccounts() {
        System.out.println("### LISTA DE CONTAS ###");
        double value = 0.0;
        for (Account account : accounts) {
            System.out.println(account.toString());
            System.out.println("--------------------------------------");
            value += account.balance;
        }
        System.out.println(String.format("\nSaldo total do banco: R$%.2f", value));

    }

}
