package bankaccountapp;

public class Checking extends Account {
//list properties  specific to checking account
	
	
	private int debitCardNumber;
	private int debitCardPin;
	
	
	//constructor to initialize checking account properties
	public Checking(String name, String Ssn, double initDeposit) {
		super(name, Ssn, initDeposit);
		accountNumber ="2"+accountNumber;
		setDebitCard();
	}
		public void showInfo(){
			super.showInfo();
			System.out.println("Your checking account features:"+"\nCard:"+this.debitCardNumber + "\nPin:"+ this.debitCardPin);
		}
		
		@Override
		public void setRate() {
			rate = getBaseRate()*.15;
//			System.out.println("Implement rate for checking");
		}
		
		private void setDebitCard() {
		
			debitCardNumber = (int) (Math.random()* Math.pow(10, 3));
			debitCardPin = (int) (Math.random()* Math.pow(10, 4));
//			System.out.println("Card:"+this.debitCardNumber);
//			System.out.println("Pin:"+ this.debitCardPin);
		
		
		}
		
		
		
		
		
	
	
	
	
	
	
	//list specific methods
}
