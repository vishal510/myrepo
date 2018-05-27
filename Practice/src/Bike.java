import java.util.Scanner;

class Bike {
	String engNum;
	String color;
	String ownerName;
	String bikeNum;

	Bike(String engNum, String color) {
		this.engNum = engNum;
		this.color = color;

	}

	void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	void setBikeNum(String bikeNum) {
		this.bikeNum = bikeNum;
	}

	void start() {
		System.out.println(ownerName + "started bike");

	}

	void move() {
		System.out.println(ownerName + "moving on bike");
	}

	void stop() {
		System.out.println(ownerName + "stopped bike");
	}
	Scanner scn = new Scanner(System.in);

	public void show() {
	/*	System.out.println("owner name:" + ownerName);
		ownerName = scn.nextLine();
		System.out.println("bike number:" + bikeNum);
		bikeNum  = scn.nextLine();
		System.out.println("engine number:" + engNum);
		engNum = scn.nextLine();
		System.out.println("bike color:" + color);
        color = scn.nextLine();*/
	}
}
