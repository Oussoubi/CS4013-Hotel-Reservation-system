package HotelReservationSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import HotelReservationSystem.Reservation;


/**
 * 
 * Specifies the hotel types and the available room types, occupancy and rates for each  
 *
 */
public class Hotel {

	// arraylists to store the rooms for each hotel type to be able to compare with the users criteria 
	ArrayList<Room> fiveStars = new ArrayList<Room>();
	ArrayList<Room> fourStars = new ArrayList<Room>();
	ArrayList<Room> threeStars = new ArrayList<Room>();


	/**
	 * create hotel types 
	 * @param fileInformation
	 * @throws FileNotFoundException
	 */
	public Hotel(String fileInformation[][]) throws FileNotFoundException {
		hotelFiveStars(fileInformation);
		hotelFourStars(fileInformation);
		hotelThreeStars(fileInformation);
	}

	
	/**
	 * five star hotel information from the 2D array with information from csv file. 
	 * This sets the hotel information for the particular criteria and rates
	 * @param fileInformation
	 */
	private void hotelFiveStars(String fileInformation[][]) {
		for (int i = 0; i < 3; i++) {
			String roomType = fileInformation[i + 2][1]; // [i+2] because the 5star hotel information doesn't star till
															// array index 2
			int numAvailableRooms = Integer.parseInt(fileInformation[i + 2][2]);
			int minPeople = Integer.parseInt(fileInformation[i + 2][3]);
			int maxPeople = Integer.parseInt(fileInformation[i + 2][4]);

			double[] roomRates = new double[7]; // days of the week
			for (int rr = 0; rr < 7; rr++) {
				roomRates[rr] = Double.parseDouble(fileInformation[i + 2][rr + 5]);

			}
			for (int j = 0; j < numAvailableRooms; j++) {
				Room room = new Room(roomType, numAvailableRooms, minPeople, maxPeople, roomRates);
				fiveStars.add(room);

			}
		}

	}

	
	/**
	 * Four star hotel information from the 2D array with information from csv file. 
	 * This sets the hotel information for the particular criteria and rates
	 * @param fileInformation
	 */
	private void hotelFourStars(String[][] fileInformation) {
		for (int i = 0; i < 2; i++) {
			String roomType = fileInformation[i + 6][1];
			int numAvailableRooms = Integer.parseInt(fileInformation[i + 6][2]);
			int minPeople = Integer.parseInt(fileInformation[i + 6][3]);
			int maxPeople = Integer.parseInt(fileInformation[i + 6][4]);

			double[] roomRates = new double[7]; // days of the week
			for (int rr = 0; rr < 7; rr++) {
				roomRates[rr] = Double.parseDouble(fileInformation[i + 6][rr + 5]);

			}
			for (int j = 0; j < numAvailableRooms; j++) {
				Room room = new Room(roomType, numAvailableRooms, minPeople, maxPeople, roomRates);
				fourStars.add(room);

			}
		}
	}

	/**
	 * Three star hotel information from the 2D array with information from csv file. 
	 * This sets the hotel information for the particular criteria and rates
	 * @param fileInformation
	 */
	private void hotelThreeStars(String[][] fileInformation) {
		for (int i = 0; i < 2; i++) {
			String roomType = fileInformation[i + 9][1];
			int numAvailableRooms = Integer.parseInt(fileInformation[i + 9][2]);
			int minPeople = Integer.parseInt(fileInformation[i + 9][3]);
			int maxPeople = Integer.parseInt(fileInformation[i + 9][4]);

			double[] roomRates = new double[7]; // days of the week
			for (int rr = 0; rr < 7; rr++) {
				roomRates[rr] = Double.parseDouble(fileInformation[i + 9][rr + 5]);

			}
			for (int j = 0; j < numAvailableRooms; j++) {
				Room room = new Room(roomType, numAvailableRooms, minPeople, maxPeople, roomRates);
				threeStars.add(room);

			}
		}

	}

}
