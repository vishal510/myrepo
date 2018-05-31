
public class SubClass extends SuperClass{
	SubClass(){
		this(10);
		System.out.println("SubClass no arg");
	}
	SubClass(int a){
		this("abc");
		System.out.println("SubClass int arg");
	}
	SubClass(String str){
		System.out.println("SubClass String arg");
	}

}
