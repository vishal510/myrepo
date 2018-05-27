import java.util.Scanner;

class Customer {
	private String color;
	private String ownerName;

	public static void main(String[] args) {
		Customer c1 = new Customer();
		ShowRoom sh1 = new ShowRoom();
		RTO r1 = new RTO();
		Bike b;
		Scanner scn = new Scanner(System.in);
		System.out.print("please Enter Bike Owner name :");
		c1.ownerName = scn.nextLine();
		System.out.print("please Enter Bike color :");
		c1.color = scn.nextLine();
		b = r1.getBikeNum(sh1.getBike(c1.ownerName, c1.color));
		System.out.println();
		b.show();
	}
}
