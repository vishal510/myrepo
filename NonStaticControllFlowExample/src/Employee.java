//null pointer exception
public class Employee {
 int eid        = 7279;
 String ename   = "Vishal";
 String company = "SivanandaElectronics";
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee e1 = new Employee();
     System.out.println(e1);
     System.out.println("eid:"+e1.eid);
     System.out.println("ename:"+e1.ename);
     System.out.println("company:"+e1.company);
	}

}
