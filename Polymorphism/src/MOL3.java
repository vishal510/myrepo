
public class MOL3 {
	static void m1(int a) {
		System.out.println("int-arg");
	}
	static void m1(float f) {
		System.out.println("float-arg");
	}
	public static void main(String[] args) {
		m1(10);//int-arg
		m1('a');//int-arg
		m1(50l);//float-arg
		long l = 50;//float-arg
		m1(l);
		//m1(50.34);//double can not be converted
	}

}
