package bankaccountdio;

import bankaccountdio.Entities.Account;
import bankaccountdio.Entities.Client;
import bankaccountdio.Entities.CurrentAccount;
import bankaccountdio.Entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

        Client jonas = new Client();
        jonas.setName("Jonas");

        Account ca = new CurrentAccount(jonas);
        Account sc = new SavingsAccount(jonas);

        ca.deposit(100);
        sc.transfer(100, sc);

        ca.printExtract();
        sc.printExtract();

    }

}
