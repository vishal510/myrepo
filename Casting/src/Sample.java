
public class Sample extends Example{
	int a =10;
	public static void main(String[] args) {
		//System.out.println("sample a:"+a);
		//System.out.println(Sample.a);
		Sample s = new Sample();
		System.out.println(s.a);
	}
	void m2() {
		System.out.println("m2");
	}

}
