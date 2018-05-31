
public class Sample5 extends Example5{
	void add(int x,int y) {
		System.out.println("Sample int,int");
	}
	float add(float a,int b) {
		System.out.println("sample float,int");
		return a+b;
	}
	String add(String s1,double d) {
		System.out.println("Sample String,double");
		return s1+d;
	}

}
