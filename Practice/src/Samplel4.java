class Samplel4 extends Example4 {
	Samplel4() {
		System.out.println("Samplel4 0-param constructor");
	}

	Samplel4(int a) {
		//super(10);
		System.out.println("Samplel4 int-param constructor");
	}

	public static void main(String[] args) {
		Samplel4 s1 = new Samplel4();
		Samplel4 s2 = new Samplel4(50);
	}
}
