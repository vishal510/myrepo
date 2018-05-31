
public class ThisRule1 {
	ThisRule1(){
		this(10);
	System.out.println("NO-param");
	}
	ThisRule1(int a){
		System.out.println("Int-param");
		//this("abc");
	}
	ThisRule1(String s){
		System.out.println("String param");
	}
	void m1() {
		//this("abc");
		System.out.println("m1");
	}
}
