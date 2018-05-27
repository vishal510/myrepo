
public class B15 extends A15{
	void m1() {
		System.out.println("B m1");
	}
	public static void main(String[] args) {
	B15 b = new B15();
	b.m1();
	b.m2();
	A15 a = new B15();
	//a.m1();
	a.m2();
	}
}
