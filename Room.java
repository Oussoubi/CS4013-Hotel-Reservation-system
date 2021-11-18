package HotelReservationSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Room {
	
	Scanner roomInput = new Scanner(System.in);
	Reservation roomType;
	ArrayList<Reservation> newBooking = new ArrayList<Reservation>();
	
	public static void main(String[]args) {
		Scanner roomInput = new Scanner(System.in);
		Reservation roomType;
		ArrayList<Reservation> newBooking = new ArrayList<Reservation>();
		
		return roomType.getRoomType(starRating);
	}
	
	public void getRoomType(Scanner starRating) {
		
		if(roomInput.equals(5)) {
			System.out.println("What type of room do you require?\nDeluxe Double (DD), Deluxe Twin (DT), Deluxe Single (DS), Deluxe Family (DF)");
			String roomType = roomInput.nextLine().toUpperCase();
			Reservation type = new Reservation();
			newBooking.add(type);			
		}
		
		// 4 star
		if(roomInput.equals(4)) {
			System.out.println("What type of room do you require?\nExecutive Double (ED), Executive Twin (ET), Executive Single (ES)");
			String roomType = roomInput.nextLine().toUpperCase();
			Reservation type = new Reservation();
			newBooking.add(type);			
		}
		
		// 3 star
		if(roomInput.equals(3)) {
			System.out.println("What type of room do you require?\nClassic Double (CD), Classic Twin (CT), Classic Single (CS)");
			String roomType = roomInput.nextLine().toUpperCase();
			Reservation type = new Reservation();
			newBooking.add(type);
			System.out.println(newBooking);
		}
		System.out.println(newBooking);
	}
}
