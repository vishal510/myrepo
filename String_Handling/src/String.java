
public class String {
	
	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		java.lang.String s1 = "Jai";
		System.out.println("s1:"+s1);
		java.lang.String s2 = s1.concat("Shivrai");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		
//it creates new object to store value if we perform some operation on string
 /*  if (s1.equals(s2)) {
	System.out.println("HI");
   }
   else {
	System.out.println("Hello");
}*/
    StringBuffer sb = new StringBuffer("VishalSable");
    System.out.println("sb:"+sb);
    StringBuffer sb1 = sb.append("Patil");
    System.out.println("sb:"+sb);
    System.out.println("sb1:"+sb1);
//it store value in same object if we perform some operation on it
     sb.insert(6,' ');
     System.out.println("sb:"+sb1);
     char[] ch = {'v','i','s','h','a','l'};
     System.out.println(ch);
 //problem:1)length is fixed,2)operation required inbuilt method are not available 

	

	} 
}
