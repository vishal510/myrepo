
public class MOL2OverloadingMystery {
	public static void main(String[] args) {
		Calleelmp cl = new Calleelmp();
		Object obj1 = new Object();
		Object obj2 = "HariKrishna";
		Object obj3 = new Integer(7279);
		
		cl.foo(obj1);//Object-Parameter                    
		cl.foo(obj2);//Object-Parameter
		cl.foo(obj3);//Object-Parameter
		
		System.out.println();
		cl.foo("HK");//String-parameter
		cl.foo(7279);//Integer-Parameter
		
		System.out.println();
		cl.foo((String)obj2);//String-parameter
		cl.foo((Integer)obj3);//Integer-Parameter

		
		System.out.println();
		//cl.foo((String)obj1);ClassCastException
		//cl.foo((Integer)obj1);ClassCastException
		//cl.foo((String)obj3);ClassCastException
		//cl.foo((Integer)obj2);ClassCastException
	}

}
