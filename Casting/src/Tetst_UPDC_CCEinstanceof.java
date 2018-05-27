
public class Tetst_UPDC_CCEinstanceof {

	public static void main(String[] args) {
		// Upcasting
		A a = new B();
		System.out.println(a.x);//10
		
		//Downcasting
		B b = (B)a;
		System.out.println(b.y);//20
		
		//Upcasting rules(AC/IC/W)
		A a1 = new A();
		System.out.println(a1.x);//10
		System.out.println(b.y);//20
		A a2 = new B();
		System.out.println(a2.x);//10
		//System.out.println(a2.y);
		//System.out.println(a2.z);
		
		A a3 = new C();
		System.out.println(a3.x);//10
		//System.out.println(a3.y);
		//System.out.println(a3.z);
		//A a4 = new D();//Type mismatch: cannot convert from D to A
		
		//B b1 = new A();//Type mismatch: cannot convert from A to B
		B b2 = new B();
		System.out.println(b2.x);
		System.out.println(b2.y);
		B b3 = new C();
		System.out.println(b3.x);
		System.out.println(b3.y);
		//B b4 = new D();//Type mismatch: cannot convert from D to B
		
		//Downcasting rules(Castin/EC/Na)
		A a5 = new B();
		System.out.println(a5.x);
		//System.out.println(a5.y);
		B b5 = (B)a5;
		System.out.println(b5.x);//10
		System.out.println(b5.y);//20
		//System.out.println(b5.z);
		
		C c5 = (C)a5;
		System.out.println(c5.x);//10
		System.out.println(c5.y);//20
		System.out.println(c5.z);//30

		//D d5 = (D)a5;//Cannot cast from A to D
		
		//Identify CE and RE in below statements
		/*A a6 = new C();
		B b6 = (B)a6;
		C c6 = (C)a6;
		//D d7 = (D)a6;Cannot cast from A to D
		
		//Identify CE and Re in below statements
		Object obj7 = new B();
		A a7 = (A)obj7;
		B b7 = (B)obj7;
		//C c7 = (C)obj;//obj cannot be resolved to a variable
		//D d7 = (D)obj;obj cannot be resolved to a variable
		
		//Is casting required in below statements?
		Object o6 = (Object)a6;
		System.out.println((Object)a6);
		System.out.println((A)b6);
		
		//can we do casting directly?
		B b8 = (B) new C();
		B b9 = (B) new A();
		//B b10 = (B) new D();/Cannot cast from D to B
		
		//can we cast operator multiple times ?
		////Identify CE and RE in below statements
		
		A a11 = new C();
		B b11 = (B)(C)(A)(B)a11;
//		B b12 = (C)(B)(D)(C)(B)a11;// Cannot cast from C to D & Cannot cast from D to  B
			
		B b13 = (C)(B)(Object)(D)(Object)(C)(B)a11;
		
		//summary
		A a21 = new B();  //upcasting
		System.out.println(a21.x);
		//System.out.println(a21.y);//y cannot be resolved or is not a field
		
		B b21 = (B)a21;//downcasting
		System.out.println(b21.y);
		
		C c21 = (C)a21;
		System.out.println(c21.z);
		
		if(a21 instanceof C ) {
			C c22 = (C)a21;
			System.out.println(c22.x);
		}
		
		//Identify CE and output in below statements
		A a22 = new B();
		System.out.println(a22 instanceof Object );
		System.out.println(a22 instanceof A);
		System.out.println(a22 instanceof B);
		System.out.println(a22 instanceof C);
		//System.out.println(a22 instanceof D);//Incompatible conditional operand types A and D
		System.out.println();
		
		Object a23 = new B();
		System.out.println(a23 instanceof Object );
		System.out.println(a23 instanceof A);
		System.out.println(a23 instanceof B);
		System.out.println(a23 instanceof C);
		System.out.println(a23 instanceof D);
		
		//B b = (B) new C();
		System.out.println(new C() instanceof B);
		System.out.println(new A() instanceof B);
		//System.out.println(new D() instanceof B);
		//The method newD() is undefined for the type Tetst_UPDC_CCEinstanceof
		
		//System.out.println(D instanceof a23);*/
	}

}
