package dec31;

public class SBIbank implements Bank {
 int balance;
 

	 
 public SBIbank(int balance) {
	super();
	this.balance = balance;
}

	
	public void withdraw(int amt)  {
	try {

 if(amt > this.balance) {
		System.out.println("amt "+amt+" trying to withdraw...");
		throw new InSufficientBalanceException("Balance is not enough");}
 else {
	 System.out.println("successfully withdraw...");
	 this.balance = this.balance-amt;
	 
 }
 
 }catch(InSufficientBalanceException e) {
	 System.out.println("error occured during with draw...");
	 e.printStackTrace();
}
 }
 }
