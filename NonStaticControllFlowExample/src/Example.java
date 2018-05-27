class Example {//this keyword
  int x;
  int y;
   void m1(Example e) {
	   x=x+1;
	   y=y+2;
	  
	   e.x = e.x+3;
	   e.y = e.y+4;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Example e1 = new Example();
  Example e2 = new Example();
   
  e1.m1(e2);
  System.out.println(e1.x+"..."+e1.y);//1...2
  System.out.println(e2.x+"..."+e2.y);//3...4

	e2.m1(e1);
	System.out.println(e1.x+"..."+e1.y);//4...6
	System.out.println(e2.x+"..."+e2.y);//4...6
	
	e1.m1(e1);
	System.out.println(e1.x+"..."+e1.y);//8...12
	System.out.println(e2.x+"..."+e2.y);//4...6
	
	e2.m1(e2);
	System.out.println(e1.x+"..."+e1.y);//8...12
	System.out.println(e2.x+"..."+e2.y);//8...12
	}

}
