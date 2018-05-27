
public class Clerk {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		//acc1.balance = 5000;
		//System.out.println(acc1.Balance());
		acc1.setBalance(5000);
		System.out.println(acc1.getBalance());
		
		acc1.setBalance(-5000);
		System.out.println(acc1.getBalance());
		
		acc1.setBalance(10000);
		System.out.println(acc1.getBalance());
	}

}
