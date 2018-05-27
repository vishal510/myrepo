
public class Sample1 extends Example1{
	void m1() {
		System.out.println("SAmple m1");
	}
	void m2() {
		super.m2();
		System.out.println("Sample m2");
	}
	public static void main(String[] args) {
		Sample1 s = new Sample1();
		Example1 e = s;
		s.m1();
		s.m2();
		s.m3();
		e.main(args);


	}
	

}
