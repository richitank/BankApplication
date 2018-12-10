package bankaccountapp;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		
		
		//read CSV
		String file = "G:\\Chrome downloads\\NewBankAccounts.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(file); 
		for (String[] accountHolder : newAccountHolders) {
//			System.out.println("New account");
			
			String name= accountHolder[0];
			String Ssn = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			
			//  System.out.println(name+""+ Ssn+ ""+accountType+""+"$"+ initDeposit);
		if(accountType.equals("Savings")){
			
//			System.out.println("open savings account");
			accounts.add(new Savings(name, Ssn, initDeposit));
			}
		else if (accountType.equals("Checking")) {
		
//			System.out.println("open checking account");
			accounts.add(new Checking(name, Ssn, initDeposit));

		}
		else {
			System.out.println("error reading account type");
		}
		}
		
		
		
		for (Account acc : accounts) {
			System.out.println("\n**************");
			acc.showInfo();
			
			
		}
		
		
		
		
		
//			System.out.println(accountHolder[1]);
////			System.out.println(accountHolder[2]);
			
		
		
		//		Checking chk1 = new Checking("TOM wilson", "123654789",1500);
//		
//		Savings sav1 = new Savings("Rich Lowe", "458961236", 2500);
//		sav1.compound();
//		//read a CSV file and create new accounts based on data
//		sav1.showInfo();
//		
//		System.out.println("**************");
//		chk1.showInfo();
//		
//		

//		sav1.deposit(5000);
//		sav1.withdraw(200);
//		sav1.transfer("broker", 500);
		
		
	}

}
