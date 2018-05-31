
public class SuperClass {
	
	SuperClass(){
		this(10);
		System.out.println("SuperClass no arg");
	}
	SuperClass(int a){
		this("abc");
		System.out.println("SuperClass int arg");
	}
	SuperClass(String s){
		System.out.println("SuperClass String arg");
	}

}
