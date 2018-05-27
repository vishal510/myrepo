
public class Bike1 {
	private int gear;

	public void setGear(int gear) {
		if (gear <= 0) {
			System.out.println("Do not enter -ve number");
		}
		//{
		//	this.gear = gear;
			
		//}
		if (gear >= 6) {
			System.out.println("Gear should be in the range of 0 to 5");
			//{
			//	this.gear = gear;
		//	}
			
			// if
		} else {
			this.gear = gear;
			System.out.println("Enterd gear no.:" + this.gear);

		} // else

	}// method

	public int getGear() {
		return gear;
	}
}// class
