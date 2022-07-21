package bankaccountdio.Entities;

public abstract class Account implements IAccount {

    private static final int BRANCH_STANDARD = 1;
    private static int SEQUENTIAL = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Client client;

    public Account(Client client) {
        this.agency = Account.BRANCH_STANDARD;
        this.number = SEQUENTIAL++;
        this.client = client;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void transfer(double amount, IAccount destinationAccount) {
        this.withdraw(amount);
        destinationAccount.deposit(amount);
    }

    public int getAgencia() {
        return agency;
    }

    public int getNumero() {
        return number;
    }

    public double getSaldo() {
        return balance;
    }

    protected void printCommonInfo() {
        System.out.println(String.format("Holder: %s", this.client.getName()));
        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Number: %d", this.number));
        System.out.println(String.format("Balance: %.2f", this.balance));
    }

}
