package GP;

public class TestReservation {
	public static void main (String[]args) {
		
		Reservation r1 = new Reservation(4764927, "Ryan Morrissey", "Tuesday", 12, 2, "Standered", "7/12/21", "11/12/21", 1, "Deluxe Double", 2);
		
		System.out.println("Resevation Number: " + r1.getReservationNumber());
		System.out.println("Reservation Name: " + r1.getReservationName());
		System.out.println("Day: " + r1.getDate());
		System.out.println("Check in Date: " + r1.getCheckInDate());
		System.out.println("Start Hour: " + r1.getStartHour());
		System.out.println("Check out Date: " + r1.getCheckOutDate());
		System.out.println("End Hour: " + r1.getEndHour());
		System.out.println("Reservation Type: " + r1.getReservationType());
		System.out.println("Number of Rooms: " + r1.getNoOfRooms());
		System.out.println("Room Type: " + r1.getRoomType());
		System.out.println("Number of People: " + r1.getNoOfPeople());
	}

}
