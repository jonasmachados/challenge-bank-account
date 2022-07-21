package bankaccountdio.Entities;

public class SavingsAccount extends Account{
    
    public SavingsAccount(Client client) {
		super(client);
	}

	@Override
	public void printExtract() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.printCommonInfo();
	}
    
    
}
