class Factory {

	public static void main(String[] args) {

		Bike pulsar = new Bike("ABC123Q", "RED");
		Bike bullet = new Bike("PQR456T", "SILVER");

		pulsar.setOwnerName("Vishal");
		pulsar.setBikeNum("MH 20 CS 2626");

		bullet.setOwnerName("Sandeep");
		bullet.setBikeNum("MH 20 CS 2727");

		bullet.stop();
		bullet.move();
		bullet.stop();
	}

}
