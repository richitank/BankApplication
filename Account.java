package bankaccountapp;

public abstract class Account implements IBaseRate{
	//list common properties for checking and saving
	private String name;
	private String Ssn;
	private double balance;
	
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
	//constructor to set base properties and initialize the account
	
	//list common methods
	
	public Account(String name, String Ssn , double initDeposit)
	{
		
		this.name = name;
		this.Ssn = Ssn;
		balance = initDeposit;
		
//		System.out.println("NAme:"+name+"SSN:"+Ssn+"BAlance:"+balance);
	
		
		//set account number
		index++;
		this.accountNumber = setAccountNumber();
		
//		System.out.println(getBaseRate());
//		
		setRate();
		
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		
		String lastTwoOfSsn = Ssn.substring(Ssn.length()-2, Ssn.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random()* Math.pow(10,3));
		return lastTwoOfSsn + uniqueID+ randomNumber;
		
		
	}
	
	public void compound() {
		
		double accruedInterest = balance * (rate/100);
		balance = balance+accruedInterest;
		System.out.println("Accrued Interest: $"+ accruedInterest);
		printBalance();
		
		
		}
	
	
	
	public void showInfo() {
		
		System.out.println(
			"Name:"+name+"\nAccount number:"+ accountNumber+ "\nBalance:"+balance+"\nRate:"+rate+"%" );
	}
	
	public void printBalance() {
		
		System.out.println("Your current balance:"+balance);
	}
	
	public void deposit(double amount) {
		balance = balance +amount;
		System.out.println("Depositing $"+amount);
		printBalance();
	}
	
	public void withdraw( double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $"+amount);
		printBalance();
	}
	public void transfer(String towhere,double amount) {
		
		balance = balance - amount;
		System.out.println("transfering $"+ amount + "To" + towhere);
		printBalance();
	}
}
