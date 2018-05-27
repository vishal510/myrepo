
public class Sample2 extends Example2 {
	Sample2(){
		System.out.println("In class Sample2 Constructor this:"+this);
	}
public static void main(String[] args) {
	Sample2 s = new Sample2();
	System.out.println("In class Sample2 main s:"+s);
}
}
