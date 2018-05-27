
public class Sample1 extends Example1 {
	int x = 30;
	int y = 40;

	void m2() {
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		System.out.println("x:" + super.x);
		System.out.println("y:" + super.y);
	}

	void m3() {
		int x = 50;
		int y = 60;
		System.out.println("local x:" + x);
		System.out.println("local y:" + y);

		System.out.println("subclass x:" + this.x);
		System.out.println("subclass y:" + this.y);

		System.out.println("superclass x:" + super.x);
		System.out.println("superclass y:" + super.y);

	}

	public static void main(String[] args) {
		Sample1 s = new Sample1();
		s.m2();
		s.m3();

	}
}