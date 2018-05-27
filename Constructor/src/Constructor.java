class Example{
	Example(){
		System.out.println("constructor");
	}
void Example() {
	System.out.println("in method");
}
	public static void main(String[] args) {
		System.out.println("main");
		Example e = new Example();
		e.Example();
	}
	} 


