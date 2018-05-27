public class Sample3 extends Example3 {
	static int b = m3();
	static {
		System.out.println("Sample3 SB");
	}
	int y = m4();
	{
		System.out.println("Sample3 NSB");
	}

	Sample3() {
		System.out.println("Sample3 Constructor");
	}

	static int m3() {
		System.out.println("Sample3 SV is created");
		return 40;
	}

	int m4() {
		System.out.println("Sample3 NSV is created");
		return 40;
	}

	void abc() {
		System.out.println("Sample3 abc");
	}

	public static void main(String[] args) {
		System.out.println("Sample3 main");
		Sample3 s = new Sample3();
		s.abc();
		s.bbc();
	}
}
