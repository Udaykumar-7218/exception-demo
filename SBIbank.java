package dec31;

public class SBibank implements Bank {
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
	public void deposit(int amt) {
		try {
			if(amt>50000) {
				System.out.println("amt "+amt+"trying to deposit....");
				throw new limiteExceedsException("morentha 50k is not posssible");
				}
			else {
				System.out.println("successfully deposit amount"+amt);
				this.balance=this.balance+amt;
			}
		}catch(limiteExceedsException e) {
			 System.out.println("error occured during with draw...");
			 e.printStackTrace();
	}
 }
}

