
public class A2 {
	static int a = 10;
	static {
		System.out.println("In A SB");
		System.out.println("a:" + a);
		// System.out.println("b:"+b);
		System.out.println("b:" + B2.b);
		System.out.println("b:" + B2.getB());
	}

}
