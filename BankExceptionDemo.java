package dec31;

public class BankExceptionDemo {

	public static void main(String[] args) {
      
		SBIbank sbi = new SBIbank(5000);
		
		sbi.withdraw(10000);
		sbi.withdraw(7000);
		sbi.withdraw(1000);
	}

}
