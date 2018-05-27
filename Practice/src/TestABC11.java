
public class TestABC11 { 
	static {
		System.out.println("Test ABC is loaded");
	}
	public static void main(String[] args) {
		B11 b1 = new B11();
		/*here new B11 calls the default constructor of B11 and 
		 B11 default constructor calls the A11 default constructor and 
		 the members of A11 & B11 be Executed  from superclass to subclass */
		C11 c1 = new C11();
		
		b1.a = 15;
		b1.x = 16;
		System.out.println("b1.a:"+b1.a);
		System.out.println("c1.a:"+c1.a);
		System.out.println("b1.x:"+b1.x);
		System.out.println("c1.x:"+c1.x);
	}

}
