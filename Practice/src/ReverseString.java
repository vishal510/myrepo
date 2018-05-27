
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "vishal";
		int l = s1.length()-1;
		System.out.println(s1.length());
		for (int i = l; i >= 0; i--) {
			System.out.print(s1.charAt(i));
		}
	}

}
