package HotelReservationSystem;

public class TestRoom {
	public static void main(String[]args) {
		double[] rates = {75.00, 75.00, 75.00, 80.00, 90.00, 90.00, 75.00} ;
		
		Room r1 = new Room("Deluxe Double", 1, 2, rates);
		
		System.out.println("Room type: " + r1.getRoomType());
		System.out.println("Minimum occupancy: " + r1.getMinOcc());
		System.out.println("Maximum occupancy: " + r1.getMaxOcc());
		System.out.println("Rates " + r1.getRates());
	}
}
