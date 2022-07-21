package bankaccountdio.Entities;

public interface IAccount {

    void withdraw(double valor);

    void deposit(double valor);

    void transfer(double valor, IAccount contaDestino);

    void printExtract();

}
