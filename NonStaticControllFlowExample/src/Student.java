// Null Pointer Exception
public class Student {
int sno;
String sname;
Address addr;
void setSno(int sno) {
	this.sno = sno;
}
void setSname(String sname) {
	this.sname = sname;
}
void setAddress(Address addr) {
	this.addr = addr;
}
public void display() {
	System.out.println("sno      :"+sno);
	System.out.println("sname    :"+sname);
	System.out.println("Address  :"+addr);
	System.out.println("StreetNo :"+addr.strnum);
	System.out.println("City     :"+addr.city);
}

}
