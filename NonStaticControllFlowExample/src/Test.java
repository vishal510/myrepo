 //call by value and reference
class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Example2 e1 = new Example2();
    int q = 35;
    System.out.println(q);
    e1.m1(q);
    System.out.println(q);
    
    Example2 e2 = new Example2();
    System.out.println(e2);
    
    e1.m2(e2);
    System.out.println(e2);
    System.out.println(e2.x);
    
    e1.m3(e2);
    System.out.println(e2.x);
    
    e1.m4(e2);
    System.out.println(e2.x);
	}

}
