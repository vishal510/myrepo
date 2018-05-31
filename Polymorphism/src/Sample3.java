
public class Sample3 extends Example3{
	public static void main(String[] args) {
		byte b =10;
		short s =15;
		char ch ='a';
		int i = 20;
		Example3 e = new Example3();
		e.m1(b);//int-arg
		e.m1(s);//int-arg
		e.m1(ch);//int-arg
		e.m1(i);//int-arg
		e.m1(10);//int-arg
		e.m1(15);//int-arg
		e.m1('a');//int-arg
		e.m1(10);//int-arg
		e.m1((byte)10);//byte-arg
		e.m1(15);//int-arg
		e.m1('a');//int7-arg
		e.m1(20);//int-arg
		/*m2(new Example3());
		m2(new Sample3());
		m2("abc");
		m2(null);*/
	}

}
