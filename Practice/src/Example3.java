
public class Example3 {
	static  int a = m1();
	static {
		System.out.println("Example3 SB");
	}
	int x = m2();
	{
		System.out.println("Example3 NSB");
	}
	Example3(){
		System.out.println("Example3 Constructor");
	}
	static int m1() {
		System.out.println("Example3 SV is created");
		return 10;
	}
	int m2() {
		System.out.println("Example3 NSV is created");
		return 20;
	}
	void abc() {
		System.out.println("Example3 abc");
	}
	void bbc() {
		System.out.println("Example3 bbc");
	}

}
