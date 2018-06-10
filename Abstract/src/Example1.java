
public abstract class Example1 {
	abstract void m1();
	static int a = 10;
	int x = 20;
	static {
		System.out.println("Example static block");
	}
	{
		System.out.println("Example NSB");
	}
	Example1(){
		System.out.println("Example constructor");
	}
	static void m2() {
		System.out.println("Example Sm");
	}
	void m3() {
		System.out.println("Example NSM");
	}
	public static void main(String[] args) {
		System.out.println("Example main");
		System.out.println("a:"+a);
		m2();
		//Example1 e = new Example1();
		//e.m3();
	}

}
