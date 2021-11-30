package HotelReservationSystem;

import java.util.Scanner;

public class testMenu {

	static Scanner input = new Scanner(System.in); // setup the scanner for user input

	public static void main(String[] args) throws java.io.IOException {

		java.io.File reservationsFile = new java.io.File("reservations.csv");

		// creates file
		java.io.PrintWriter output = new java.io.PrintWriter(reservationsFile);

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
			input.next();

			System.out.println("What is your name?");
			String reservationName = input.nextLine();
			input.next();

			System.out.println("What option of payment would you like:\n (AP) Advanced Purchase (non-refundable) or"
					+ "(S) Standard (refundable upto 48hours before stay)?");
			String reservationType = input.nextLine();
			input.next();

			System.out.println("What is your desired Check-In Date (example 12/12/21)");
			String checkInDate = input.nextLine(); // takes answer as a String
			input.next();

			System.out.println("What is your desired Check-Out Date (example 12/12/21)");
			String checkOutDate = input.nextLine();
			input.next();

			System.out.println("How many rooms do you want to book?");
			String NoOfRooms = input.nextLine();
			input.next();

			System.out.println("Number of People?");
			String NoOfPeople = input.nextLine();

			// creating reservation object using the users input 
			Reservation res1 = new Reservation(reservationNumber, RoomType, reservationName, reservationType,
					checkInDate, checkOutDate, NoOfRooms, NoOfPeople);

			output.print(reservationNumber);
			output.print(RoomType);
			output.print(reservationName);
			output.print(reservationType);
			output.print(checkInDate);
			output.print(checkOutDate);
			output.print(NoOfRooms);
			output.print(NoOfPeople);

			output.close(); // close the file

			while (input.hasNext()) {
				String resNumber = input.next();
				String roomType = input.next();
				String resName = input.next();
				String resType = input.next();
				String checkIn = input.next();
				String checkOut = input.next();
				String NoOfRoom = input.next();
				String NoOfPpl = input.next();

				
				// print out the information saved in reservations file 
				System.out.println("Reservation Number: " + resNumber + "\nRoom Type: " + roomType
						+ "\nReservation Name: " + resName + "\nReservation Type: " + resType + "\nCheck In Date: "
						+ checkIn + "\nCheck Out Date: " + checkOut + "\nNo.Of Rooms: " + NoOfRoom + "\nNo of People: "
						+ NoOfPpl);
			}
		}

	}

	/**
	 * create a random number for reservation ID
	 * 
	 * @return resNum
	 */
	private static String getReservationNumberRandom() {

		String resNum = "";
		int[] random = new int[5]; // store random numbers in an array

		for (int r = 0; r < random.length; r++) { // loop through and use Math.random() to get assign random number to
													// each array index
			random[r] = (int) (Math.random() * 999999) + 1;
			resNum = (random[r] + "");

		}
		return resNum;
	}

	/**
	 * depending on the hotel star the user selects it will ask them to pick the
	 * type of room for that hotel and store this
	 * 
	 * @param hotelStar
	 * @return roomType
	 */
	private static String getRoomType(int hotelStar) {

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

}
