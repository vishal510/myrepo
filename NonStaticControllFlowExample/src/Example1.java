//this keyword
public class Example1 {
int x = 10;
int y = 20;


void m1(Example1 e1)
{
	
	System.out.println(e1.x+"..."+e1.y);//10...20
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example1 e1 = new Example1();
Example1 e2 = new Example1();
e1.m1(e2);
	}

}
