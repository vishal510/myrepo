
class Sample extends Example{

	//@Override
	
	@Override
	int m2() {
		System.out.println("Sample int M2");
		return 0;
	}

	@Override
	void m3(String s) {
		System.out.println("Sample String M3");
		
	}

	@Override
	void m4() throws Exception {
		System.out.println("Sample M4");
		
	}

	@Override
	public Employee m5(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
