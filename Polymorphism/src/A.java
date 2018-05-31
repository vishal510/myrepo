class A{
	void m1(Example e) {
		System.out.println("Example arg");
	}
	void m1(Sample s) {
		System.out.println("Sample arg");
	}
	public static void main(String[] args) {
		A a = new A();
		a.m1(new Example());
		a.m1(new Sample());
		//a.m1("abc");
		a.m1(null);
		
		Example e1 = new Example();
		Example e2 = new Sample();
		Sample s1 = new Sample();
		Example e3 = null;
		Sample s2 = null;
		a.m1(e1);
		a.m1(e2);
		a.m1(s1);
		a.m1(e3);
		a.m1(s2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*void m1(Foo f) {
		System.out.println("Foo param");
	}
	void m1(Alpha a) {
		System.out.println("Alpha Param");
	}
	static void m1(Object obj) {
		System.out.println("Object param");
	}
	public static void main(String[] args) {
		A a = new A();
		Foo f = new Foo();
		Alpha a1 = new Beta();
		a.m1(new Beta());
		a.m1(null);
		m1(f1);
		m1((Alpha)new Beta());
		m1((Foo)new Beta());
		m1(a1);
	}*/










  // ============================================================
	/*static int x = m1();
	static int m1() {
		System.out.println("A m1");
		x = 50;
		return 60;
	}*/
	// ==========================================================
	
	/*void m1(Object obj) {
		System.out.println("A Object arg");
	}
	void m1(String s) {
		System.out.println("A String arg");
	}
	void m1(Integer io) {
		System.out.println("A Integer arg");
	}*/

}