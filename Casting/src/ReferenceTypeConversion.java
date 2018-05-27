
public class ReferenceTypeConversion {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new A();/*process of storing subclass object reference in superclass reference variable is called upcasting*/
		Object obj3 = new B();
		Object obj4 = new C();
		Object obj5 = new D();
		
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		//A a4 = new D();//Type mismatch: cannot convert from D to A
		
		//B b1 = new A();//Type mismatch: cannot convert from A to B
		B b2 = new B();
		B b3 = new C();
		//B b4 = new D();//Type mismatch: cannot convert from D to B
		
		
		//B b2 = (A)a1;
		A a = new B();
		System.out.println( a instanceof Object);//true
		System.out.println( a instanceof A);//true
		System.out.println( a instanceof B);//true
		System.out.println( a instanceof C);//false
		//System.out.println( a instanceof D);




	}

}
