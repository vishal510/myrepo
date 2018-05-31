
public class ThisSuperDemo {
	static int count;
	static {
	count++;
}
	public static void main(String[] args) {
		new SubClass();
		System.out.println();
		new SubClass(10);
		System.out.println();
		new SubClass("abc");
		System.out.println("Number of object created::"+count);
	}

}
