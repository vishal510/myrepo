class Example7 {
int x = 10;
int y = 20;

   Example7 (){
	   x = 30;
	   y = 40;
      System.out.println(x);
      System.out.println(y);
  }
public static void main(String[] args) {
	Example7 e1 = new Example7();
    Example7 e2 = new Example7();
    //e1.m1();
   // e2.m1();
	}   
}
