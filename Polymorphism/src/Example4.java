
public class Example4 {
	/*static void m1(int i) {
		System.out.println("int-arg");
	}
	static void m1(long l) {
		System.out.println( "long-arg");
	}
	static void m1(float f) {
		System.out.println("float-arg");
	}
	static void m1(double d) {
		System.out.println("double-arg");
	}
	static void m1(Integer i1) {
		System.out.println("Integer-arg");
	}
	static void m1(Number n) {
		System.out.println("Number-arg");
	}
	static void m1(Object o) {
		System.out.println("Object-arg");
	}
	static void m1(int... i) {
		System.out.println("int...-arg");
	}
	static void m1(long... l) {
		System.out.println( "long...-arg");
	}
	static void m1(float... f) {
		System.out.println("float...-arg");
	}
	static void m1(double... d) {
		System.out.println("double...-arg");
	}
	static void m1(Integer... i1) {
		System.out.println("Integer...-arg");
	}
	static void m1(Number... n) {
		System.out.println("Number...-arg");
	}*/
	static void m1(Object... o) {
		System.out.println("Object...-arg");
	}
	public static void main(String[] args) {
		m1(10);
	}

}
