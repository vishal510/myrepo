
public class Example6 {
	int x = m1();
	
	{
		System.out.println("NSB");
	}
	int m1() {
		System.out.println("m1:x");
		return 10;
	}
	
	
	Example6(){
		this(10);
		x = 50;
		System.out.println("Ex No-arg Constructor");
	}
	Example6(int a){
		this("abc");
		x = 60;
		System.out.println("Ex int-arg Constructor");
	}
	Example6(String str){
		x =70;
		System.out.println("Ex String-arg constructor ");
	} 
	public static void main(String[] args) {
		Example6 e1 = new Example6();
		System.out.println("e1.x:"+e1.x);
		Example6 e2 = new Example6(10);
		System.out.println("e2.x:"+e2.x);
		Example6 e3 = new Example6("abc");
		System.out.println("e3.x:"+e3.x);
	}

}
