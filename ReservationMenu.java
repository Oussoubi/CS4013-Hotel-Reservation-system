package HotelReservationSystem;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Menu for the Reservation System.
 */

public class ReservationMenu {

	Scanner input = new Scanner(System.in); // setup the scanner for user input

	/**
	 * Construct the Menu object
	 */
	public ReservationMenu() {

	}

	/**
	 * Run the system.
	 */
	public void run() { // displays the menu
		boolean more = true;

		while (more) {
			// introduction to the menu
			System.out.println("*** Welcome to L4 Hotel Group *** ");
			System.out.println("Menu - please select an option below ");
			System.out.println("(A)dd a Reservation, (C)ancel a Reservation, (V)iew Your Booking, (B)illing, Q)uit");
			String userInput = input.nextLine().toUpperCase();

			// If user inputs A = Add a Reservation
			if (userInput.equals("A")) {
				String reservationNumber = getReservationNumberRandom();

				System.out.println("Booking Details:" + "\nWhat star rating hotel do you want to stay at? (5, 4, 3)");
				int hotelStar = input.nextInt();
				String RoomType = getRoomType(hotelStar);

				System.out.println("What is your name?");
				String reservationName = input.nextLine();
				input.next();

				System.out.println("What option of payment would you like:\n (AP) Advanced Purchase (non-refundable) or"
						+ "(S) Standard (refundable upto 48hours before stay)?");
				String reservationType = input.nextLine();
				input.next();

				System.out.println("What is your desired Check-In Date and Check-Out Date (example 12/12/21)");
				String checkInDate = input.nextLine(); // takes answer as a String
				input.next();
				
				System.out.println("What is your desired Check-Out Date (example 12/12/21)");
				String checkOutDate = input.nextLine();
				input.next();
				
				System.out.println("How many rooms do you want to book?");
				int NoOfRooms = input.nextInt();
				input.next();

				System.out.println("Number of People?");
				int NoOfPeople = input.nextInt();

				// creating a reservation object with all the user inputs
				Reservation res = new Reservation(reservationNumber, reservationName, reservationType, checkInDate,
						checkOutDate, NoOfRooms, RoomType, NoOfPeople, Room.getRates());

				
			}

			// Cancel a Reservation
			// cancel method in Reservation that deletes the reservation from the bookings arraylist (or however we save the reservation)
			if (userInput.equals("C")) {
				System.out.println("Cancel a Reservation - please supply Reservation ID number: )");
				int resNum = input.nextInt();
				Reservation cancel = new Reservation(reservationNumber);
				Reservation a = getChoice(bookings.getReservation(reservationNumber));
				if (a != null)
					bookings.cancel(a);
			}
			
			
			// View a reservation 
			// view method in Reservation that will find the reservation from the list and print 
			else if (userInput.equals("V")) {
				System.out.println("Please enter Reservation ID: ");
				int id = input.nextInt();
				Reservation view = new ReservationBooking(id);
				for (Reservation booking : bookings.getReservation(reservationNumber))
					System.out.println(booking.toString());
			}

			// Billing menu
			
			else if (userInput.equals("B")) {

			}

			// Quit the program
			else if (userInput.equals("Q")) {
				more = false;
			}
		}

	}

	/**
	 * depending on the hotel star the user selects it will ask them to pick the type of room for that hotel and store this
	 * @param hotelStar
	 * @return roomType
	 */
	private String getRoomType(int hotelStar) {

		String roomType = "";

		if (hotelStar == 5) {
			System.out.println(
					"What type of room do you require?\nDeluxe Double (DD), Deluxe Twin  (DT), Deluxe Single (DS), Deluxe Family (DF)");
			return roomType = input.nextLine();

		}

		// 4 star
		if (hotelStar == 4) {
			System.out.println(
					"What type of room do you require?\nExecutive Double (ED), Executive Twin (ET), Executive Single (ES)");
			return roomType = input.nextLine();

		}

		// 3 star
		if (hotelStar == 3) {
			System.out.println(
					"What type of room do you require?\nClassic Double (CD), Classic Twin (CT), Classic Single (CS)");
			return roomType = input.nextLine();

		}

		return roomType;
	}


	/**
	 * create a random number for reservation ID
	 * @return resNum
	 */
	private static String getReservationNumberRandom() {

		String resNum = "";
		int[] random = new int[5]; // store random numbers in an array 

		for (int r = 0; r < random.length; r++) { // loop through and use Math.random() to get assign random number to each array index 
			random[r] = (int) (Math.random() * 999999) + 1;
			resNum = (random[r] + "");

		}
		return resNum;
	}

	/**
	 * gets the user input and makes it uppercase to be able to compare 
	 */
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
