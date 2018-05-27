
public class TetsAB7 {

	public static void main(String[] args) {
		B7 b = new B7();
		A7 a = b;
		System.out.println(b.x + "..." + b.y);
		System.out.println(a.x + "..." + a.y);//- a cannot be resolved to a  variable
		b.x = 5;
		b.y = 6;
		System.out.println(b.x + "..." + b.y);
		System.out.println(a.x + "..." + a.y);
		
	}

}
