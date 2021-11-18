package HotelReservationSystem;

import java.io.IOException;
import java.util.*;

//System that manages and runs the Reservations
public class RunSystem {
	//public static void main(String[] args){
	     //   throws IOException
	   //{ 
	     // ReservationMenu load = new ReservationMenu();
	    //  load.run();
	  // }
	//}

	public static void getRoomType() {

		Scanner starRating= new Scanner(System.in);
		System.out.print("How many stars does your ideal hotel have?");
		int answer = starRating.nextInt();
		
		if(starRating.equals(5)) {
			System.out.println("What type of room do you require?\nDeluxe Double (DD), Deluxe Twin (DT), Deluxe Single (DS), Deluxe Family (DF)");			
			String roomType = roomInput.nextLine().toUpperCase();
			Reservation type = new Reservation();		
		}
		
		// 4 star
		if(starRating.equals(4)) {
			System.out.println("What type of room do you require?\nExecutive Double (ED), Executive Twin (ET), Executive Single (ES)");
			String roomType = roomInput.nextLine().toUpperCase();
			Reservation type = new Reservation();			
		}
		
		// 3 star
		if(starRating.equals(3)) {
			System.out.println("What type of room do you require?\nClassic Double (CD), Classic Twin (CT), Classic Single (CS)");
			String roomType = roomInput.nextLine().toUpperCase();
			Reservation type = new Reservation();
		}
	}
}
