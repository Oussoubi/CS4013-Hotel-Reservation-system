package HotelReservationSystem;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Menu for the Reservation System.
 */

public class ReservationMenu {

	Scanner input = new Scanner(System.in); // setup the scanner for user input

	/**
	 * Constructs an ReservationMenu object.
	 */
	public ReservationMenu() {

	}

	/**
	 * Run the system.
	 */
	public void run() { // displays the menu
		boolean more = true;
		ReservationBookings bookings = new ReservationBookings();
		ReservationRoom rooms = new ReservationRoom();

		while (more) {
			// introduction to the menu
			System.out.println("*** Welcome to L4 Hotel Group *** ");
			System.out.println("Menu - please select an option below ");
			System.out.println("(A)dd a Reservation, (C)ancel a Reservation, (V)iew Your Booking, (B)illing, Q)uit");
			String userInput = input.nextLine().toUpperCase();

			// If user inputs A = Add a Reservation
			if (userInput.equals("A")) {
				System.out.println("Booking Details:"
						+ "\nWhat star rating hotel do you want to stay at? (5, 4, 3)");
				int hotelstar = input.nextInt();		
				
				System.out.println("What is your name?");
				String bookingName = input.nextLine();
				

				System.out.println("What option of payment would you like:\n (AP) Advanced Purchase (non-refundable) or"
						+ "(S) Standard (refundable upto 48hours before stay)?");
				String resType = input.nextLine();
				
				System.out.println("What is your desired Check-In Date and Check-Out Date (example 12/12/21)");
				String checkIn = input.nextLine(); // takes answer as a String
				

				System.out.println("What is your desired Check-Out Date (example 12/12/21)");
				String checkOut = input.nextLine();
				
				System.out.println("How many rooms do you want to book?");
				int noOfRooms = input.nextInt();
				
				//this part needs to be changed into a method in Room class of getRoomType based on the hotel star 
				// ** will leave here but needs to be removed **
				// ****************
								
						if(hotelstar == 5) {
							System.out.println("What type of room do you require?\nDeluxe Double (DD), Deluxe Twin  (DT), Deluxe Single (DS), Deluxe Family (DF)");
							String roomType = input.nextLine();
							return;
						
						}
						
						// 4 star
						if(hotelstar == 4) {
							System.out.println("What type of room do you require?\nExecutive Double (ED), Executive Twin (ET), Executive Single (ES)");
							String roomType = input.nextLine();
							return;
		
						}
						
						// 3 star
						if(hotelstar == 3) {
							System.out.println("What type of room do you require?\nClassic Double (CD), Classic Twin (CT), Classic Single (CS)");
							String roomType = input.nextLine();
							return;
						}
						

						// ****************
				
				System.out.println("Number of People?");
				int numOfPersons = input.nextInt();
				
				// creating a reservation object with all the user inputs 
				Reservation res = new Reservation(hotelstar, bookingName, resType, checkIn, checkOut, noOfRooms, roomType, numOfPersons);
				

				// Cancel a Reservation
			}
			
			
			if (userInput.equals("C")) {
				System.out.println("Cancel a Reservation - please supply Reservation ID number: )");
				int resNum = input.nextInt();
				Reservation cancel = new Reservation(resNum);
				Reservation a = getChoice(bookings.getReservation(resNum));
				if (a != null)
					bookings.cancel(a);
			} else if (userInput.equals("S")) {
				System.out.println("Please enter Reservation ID: ");
				int id = input.nextInt();
				Reservation show = new ReservationDate(id);
				for (Reservation booking : bookings.getReservationForDay(resNum))
					System.out.println(booking.toString());
			}

			// Billing
			else if (userInput.equals("B")) {

			}

			// Quit

			else if (userInput.equals("Q")) {
				more = false;
			}
		}

	}

	private Reservation getChoice(ArrayList<Reservation> choices) {

		if (choices.size() == 0)
			return null;
		while (true) {
			char c = 'A';
			for (Reservation choice : choices) {
				System.out.println(c + ") " + choice.toString());
				c++;
			}
			String userIn = input.nextLine();
			int n = userIn.toUpperCase().charAt(0) - 'A';
			if (0 <= n && n < choices.size())
				return choices.get(n);
		}
	}
}
