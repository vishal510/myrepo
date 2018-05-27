//call by value and reference
class Example5 {
  int x = 10;
  int y = 20;
  
  void m1() {
	  System.out.println(x);
	  System.out.println(y);
	  
	  int x = 50;
	  
	  System.out.println(x);
	  System.out.println(this.x);
	  System.out.println(y);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Example5 e1 = new Example5();
      e1.m1();
	}

}
