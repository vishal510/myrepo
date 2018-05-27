//practice call by value
public class Test1 {
	int a = 10;
	int b = 20;
	static int c = 30;
	static int d = 40;
	
	
	void m1() {
		System.out.println(a);//10//after static block non static block 
		System.out.println(b);//20//will be executed(2)
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Test1 t1 = new Test1();
   t1.m1();//after that method will be executed depending on the calling
   int a = 50;//if we are printing any variable it will first search in 
   //its local variable if the variable is not 
   //contain in the local variable then it will goes to
   //class level variable
   int b = 60;
   int c = 70;
   int d = 80;
   System.out.println(t1.a);//10
   System.out.println(b);//60
   System.out.println(t1.c);//30
   System.out.println(Test1.d);//40
	}  
   static {
		System.out.println(c);//30//static block will be executed  first
		System.out.println(d);//40//(1)
		//System.out.println(a);
	}

//static {
	//System.out.println(c);//30//static block will be executed  first
	//System.out.println(d);//40//(1)
	//System.out.println(a);
//}

}






