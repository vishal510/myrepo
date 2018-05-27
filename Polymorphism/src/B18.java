
public class B18 extends A18{
	static int a = 50;
	int x = 60;
	static void m1() {
		System.out.println("B m1");
	}
	void m2() {
		System.out.println("B m2");
		System.out.println("B a:"+a);
		System.out.println("B x:"+x);
	}
	void m4() {
		super.a = a-10;
		//System.out.println("a:"+super.a);
		super.x = x-10;
	}
	
	

}
