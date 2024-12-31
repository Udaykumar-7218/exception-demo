package dec31;

public class limiteExceedsException  extends Exception {
	String error;

	public limiteExceedsException(String error) {
		super();
		this.error = error;
	}

	@Override
	public String toString() {
		return "limiteExceedsException [error=" + error + "]";
	}
	

}
