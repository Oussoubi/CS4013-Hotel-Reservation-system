package HotelReservationSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** 
 *  
 * @author Niamh Dunlea - 21145059
 *
 */
public class ReadFile {

	private String fileInformation[][] = new String[20][20]; // 2D array to store the information in csv file

	/**
	 * read the data from the csv file and store in a 2D array
	 * 
	 * @return
	 * @throws FileNotFoundException
	 */
	public String readFile() throws FileNotFoundException {

		File file = new File(
				"/Users/lucey/eclipse-workspace/CS4013_HotelReservation/src/HotelReservation/l4Hotels.csv");

		// Create a Scanner for the file
		Scanner fileData = new Scanner(file);

		String row = ""; // each row on the csv
		int r = 0;

		// Read data from a file
		while (fileData.hasNext()) { // while there is always another line
			row = fileData.nextLine();
			fileInformation[r] = row.split(","); // add to array where it split by ,
			r++;
		}

		fileData.close();
		return fileInformation.toString();
	}

	// used to test the array information
	public String toString() {
		String info = "";
		for (int i = 0; i < fileInformation.length; i++) {
			for (int k = 0; k < fileInformation[i].length; k++) {
				info = fileInformation[i][k] + "\n";

			}

		}
		return info;
	}
}