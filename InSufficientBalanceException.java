package dec31;

public class InSufficientBalanceException extends Exception{
	
	String message;

	@Override
	public String toString() {
		return "InSufficientBalanceException [message=" + message + "]";
	}

	public InSufficientBalanceException(String message) {
		super();
		this.message = message;
	}
	
	
	}