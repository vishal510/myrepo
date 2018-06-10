
public class Sample1 {
	static int b = 30;
	int y = 40;static {
		System.out.println("Sample1 static block");
	}
	{
		System.out.println("Sample1 NSB");
	}
	Sample1(){
		System.out.println("Sample1 constructor");
	}
	static void m4() {
		System.out.println("Sample1 Sm");
	}
	void m5() {
		System.out.println("Sample1 NSM");
	}
	void m1() {
		System.out.println("m1 in Sample");
	}
	public static void main(String[] args) {
		System.out.println("Sample1 main");
		//System.out.println("a:"+a);
		System.out.println("b:"+b);
		//m2();
		m4();
		System.out.println();
		Sample1 s = new Sample1();
		s.m1();
		//s.m3();
		s.m5();
	}

}
