//Null Pointer Exception
public class Test_College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1 = new Student();
s1.setSno(101);
s1.setSname("Vishal");
Address addr = new Address();
addr.setStrnum(10);
addr.setCity("Hyd");
s1.setAddress(addr);
s1.display();
	}

}
