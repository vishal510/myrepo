
public class BankAccount {

	private double balance;

	public void setBalance(double balance) {
		if (balance <= 0) {
			System.out.println("Do not Enter -ve Amount:"+balance);
		} else {
			this.balance = balance;
		}
	}

	public double getBalance() {
		return balance;
	}
}
