public class Voter {

	private int votercard;
	private int age;

	public void setAge(int age) {
		if (age <= 18) {
			System.out.println("You are not eligible for voter id");
		}
		if (age <= 0 || age >= 125) {
			System.out.println(" Your age should be within range");
			// if
		} else {
			this.age = age;
			System.out.println("Enterd Age:" + this.age);
			System.out.println("You are Eligible for voter id");

		} // else

	}// method

	public int getAge() {
		return age;
	}
}// class
