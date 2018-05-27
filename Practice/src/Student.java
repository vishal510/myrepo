import java.util.Scanner;
import java.util.*;
class Student {
  static int eyes   = 2;
  static int ears   = 2;
  static int legs   = 2;
  static int hands  = 2;
  static String Institute;
  
  int sno        ;
  String sname   ;
  String course  ;
  Double fee     ;
  
  
  static {
	  Scanner scn = new Scanner(System.in);
	  System.out.println("Institute name:");
	 Student.Institute =  scn.nextLine();
	 scn.nextLine();
  }
  Student(){
	  Scanner scn = new Scanner(System.in);
 System.out.println("sno:");
 this.sno = scn.nextInt();
 scn.nextLine();
 System.out.println("sname:");
 this.sname = scn.nextLine();
 System.out.println("course:");
 this.course = scn.nextLine();
 System.out.println("fee:");
 this.fee = scn.nextDouble();
  
  }
  
  Student(int sno, String sname, String course, double fee){
	this.sno     = sno;
	this.sname   = sname;
	this.course  = course;
	this.fee     = fee;
	
  }
   void display() {
	   System.out.println("eyes     :"+eyes);
	   System.out.println("ears     :"+ears);
	   System.out.println("legs     :"+legs);
	   System.out.println("hands    :"+hands);
	   System.out.println("Institue :"+Institute);
	   System.out.println("sno      :"+sno);
	   System.out.println("sname    :"+sname);
	   System.out.println("course   :"+course);
	   System.out.println("fee      :"+fee);
	   
   }

}  


class College {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 object is created by reading value from keyboard");
		Student s2 = new Student(102,"vishal","core java",1000);
		System.out.println("s2 object is created by initializing values from passed by argument");
		System.out.println("s1 object values");
		s1.display();
		System.out.println("s2 object values");
		s2.display();
	}
}