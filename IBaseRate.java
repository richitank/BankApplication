package bankaccountapp;

public interface IBaseRate {
	
	//we have to fetch the rate from somewhere else : they will define , and we will have methods to define
	
	//Write a method that returns the base rate
	
	 default double getBaseRate() {
		 
		 return 2.5; //benchmark rate
	 }

}
