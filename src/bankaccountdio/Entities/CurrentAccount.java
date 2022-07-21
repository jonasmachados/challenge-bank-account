package bankaccountdio.Entities;

public class CurrentAccount extends Account{
    
    public CurrentAccount(Client client) {
		super(client);
	}

	@Override
	public void printExtract() {
		System.out.println("=== Current Account Statement ===");
		super.printCommonInfo();
	}
    
}
