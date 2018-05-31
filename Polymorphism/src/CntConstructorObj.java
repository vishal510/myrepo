
public class CntConstructorObj {
	static int count;
	static {
		count++;
	}
	CntConstructorObj(){
		this(10);
		System.out.println("0-Param Constructor");
	}
	CntConstructorObj(int a){
		this("abc");
		System.out.println("int-param Constructor");
	}
	CntConstructorObj(String str){
		System.out.println("String-param Constructor");
	}

	public static void main(String[] args) {
		CntConstructorObj cc1 = new CntConstructorObj();
		CntConstructorObj cc2 = new CntConstructorObj(10);
		CntConstructorObj cc3 = new CntConstructorObj("abc");
		System.out.println("Number of Object::"+count);
		
	}

}
