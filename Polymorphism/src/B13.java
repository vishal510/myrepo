
public class B13 extends A13{
	static void m1() {
		System.out.println("B m1");
	}
	public static void main(String[] args) {
		B13 b = new B13();
		b.m1();
		b.m2();
		
		A13 a  = new B13();
		a.m1();
		a.m2();
	}

}
