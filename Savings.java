package bankaccountapp;

public class Savings extends Account {
	
	//List properties specific
	
	private int safetyDepositBoxId;
	private int safetyDepositBoxKey;
	
	//constructor to initialize settings for savings
	public Savings(String name, String Ssn, double initDeposit) {
		
		super(name, Ssn, initDeposit);
		accountNumber ="1"+accountNumber;
		setSafetyDepositBox();
	}
	
	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		rate = getBaseRate()-.25;

//		System.out.println("Implement rate for savings");
		
	}
	
	private void setSafetyDepositBox() {
		
		safetyDepositBoxId = (int) (Math.random()* Math.pow(10,3));
//		System.out.println(safetyDepositBoxId);
		safetyDepositBoxKey = (int) (Math.random()* Math.pow(10, 4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your savings account features"+
		
				"\n safety deposit box ID:" + safetyDepositBoxId
				+"\n Safety Deposit box key:" +safetyDepositBoxKey
				);
		
		
	}

	
	
	//list specific methods

}
