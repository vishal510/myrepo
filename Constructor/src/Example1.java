class Example6{
	Example6(int x){
		System.out.println(x);
	}
void m1() {
	System.out.println("hello");
}
	public static void main(String[] args) {
		System.out.println("main");
		Example6 e = new Example6(10);
		e.m1();
	}
	
}