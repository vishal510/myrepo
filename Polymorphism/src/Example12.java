
public class Example12 {
	void add() {
		System.out.println("no-arg method");
	}
	void add(int a) {
		System.out.println("int-arg method");
	}
	void add(String str) {
		System.out.println("String-arg method");
	}
	/*int add(String s) {
		System.out.println("String-arg method");
		return 10;
	}*/
	public static void main(String[] args) {
		Example12 e = new Example12();
		e.add();
		e.add(10);
		e.add("vishal");
	}

}
