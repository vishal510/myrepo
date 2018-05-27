
public class Student1 extends Person1 {
	static void m1(Student1[] ia) {
		System.out.println("Student1[] Param");
	}

	/*static void m1(Person1[] ia) {
		System.out.println("Person1[] param");
	}

	static void m1(Object[] ia) {
		System.out.println("Object[] param");
	}

	static void m1(Student1... ia) {
		System.out.println("Student VA Param");
	}

	static void m1(Person1... ia) {
		System.out.println("Person VA param");
	}

	 static void m1(Object... ia) {
	    System.out.println("Object VA param");
    }*/

	 static void m1(Object ia) {
		System.out.println("Object param");
	}

public static void main(String[] args) {
	m1(new Student1[5]);
   }
}