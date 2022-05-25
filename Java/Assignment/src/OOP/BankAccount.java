package OOP;

public class BankAccount {

	private int accountNo;
	private String holderName;
	private String pinNo;
	private String password;
	private int balance;
	
	
	public BankAccount(int accountNo, String holderName, String pinNo, String password) {
		super();
		this.accountNo = accountNo;
		this.holderName = holderName;
		this.pinNo = pinNo;
		this.password = password;
	}
	
	public void depositMoney(int deposit) {
		
	}
}
