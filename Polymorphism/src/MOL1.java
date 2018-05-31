
public class MOL1 {
	void m1(int a) {
		System.out.println("int-arg");
	}
	void m1(char ch) {
		System.out.println("char-arg");
	}
	public static void main(String[] args) {
		MOL1 a1 = new MOL1();
		a1.m1(99);
		a1.m1('a');
		a1.m1((char)100);
		a1.m1((int)'d');
		System.out.println();
		int i1 = 97;
		int i2 = 'a';
		char ch1 = 98;
		char ch2 = 'b';
		
		a1.m1(i1);
		a1.m1(i2);
		a1.m1(ch1);
		a1.m1(ch2);
		
		System.out.println();
		a1.m1((char)i1);
		a1.m1((int)ch1);
		
		System.out.println();
		a1.m1(i1+i2);
		a1.m1(ch1+ch2);
		
		System.out.println();
		a1.m1(10+'a');
		a1.m1('a'+'b');
		a1.m1((char)('a'+'b'));
		a1.m1((char)'a'+'b');
		
		System.out.println();
			a1.m1(m2());
		a1.m1(m3());
	}
		static int m2() {
			return 'a';
		}
		static char m3() {
			return 97;
		}
//■ Overloaded methods MUST change the argument list.
//■ Overloaded methods CAN change the return type.
//■ Overloaded methods CAN change the access modifier.
//■ Overloaded methods CAN declare new or broader checked exceptions
	}

