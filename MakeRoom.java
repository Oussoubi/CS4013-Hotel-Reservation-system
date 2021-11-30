package HotelReservationSystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MakeRoom{
	private ArrayList<String> booking = new ArrayList<String>();
	
//This method checks and displays if the star rating exists or not
	public void checkStarRating(String star) {
	        String file = "C:/Users/Soubz/Documents/Computer Science/Year 2/CS4013/Project/l4Hotels.csv";
	        String line = "";
	        
	        try {
	        	BufferedReader br = new BufferedReader(new FileReader(file));
	        	
	        	String[] rows = line.split(",");
	        	//this row corresponds to the star rating
	        	String requested = rows[0];
	        	while((line = br.readLine()) != null) {
	        		System.out.println("Those are your options: "+ requested);
	        		if(star == line) {
	        			booking.add(star);
	        		}else {
	        			System.out.println("Please note: You can only chhose 3, 4, or 5 star hotels");
	        		}
	        		  
	        	}
	        	
	        }catch(FileNotFoundException e) {
	        	e.printStackTrace();
	        }catch(IOException e) { 
	        	e.printStackTrace();
	        }
	        
	}

  //This method checks and displays if the room type exists or not
	public void checkRoomType(String roomType) {
        String file = "C:/Users/Soubz/Documents/Computer Science/Year 2/CS4013/Project/l4Hotels.csv";
        String line = "";
        
        try {
        	BufferedReader br = new BufferedReader(new FileReader(file));
        	
        	String[] rows = line.split(",");
        	//this row corresponds to the room type
        	String requested = rows[1];
        	while((line = br.readLine()) != null) {
        		System.out.println("Those are your options: "+ requested);
        		if(roomType == line) {
        			booking.add(roomType);
        		}else {
        			System.out.println("Please ensure you spelled the room type correctly");
        		}
        		  
        	}
        	
        }catch(FileNotFoundException e) {
        	e.printStackTrace();
        }catch(IOException e) { 
        	e.printStackTrace();
        }
        
	}
	
  //This method checks and displays how many rooms exist for each room type
	public void checkNoOfRooms(int noOfRooms) {
        String file = "C:/Users/Soubz/Documents/Computer Science/Year 2/CS4013/Project/l4Hotels.csv";
        String line = "";
        
        try {
        	BufferedReader br = new BufferedReader(new FileReader(file));
        	
        	String[] rows = line.split(",");
        	//this row corresponds to the amount of rooms available
        	String requested = rows[2];
        	while((line = br.readLine()) != null) {
        		System.out.println("This is the amount of rooms available: "+ requested);        		  
        	}
        	
        }catch(FileNotFoundException e) {
        	e.printStackTrace();
        }catch(IOException e) { 
        	e.printStackTrace();
        }
        
	}
	
  //This method checks and displays the max and min occupancies
	public void checkMaxAndMinOcc(String roomType) {
        String file = "C:/Users/Soubz/Documents/Computer Science/Year 2/CS4013/Project/l4Hotels.csv";
        String line = "";
        
        try {
        	BufferedReader br = new BufferedReader(new FileReader(file));
        	
        	String[] rows = line.split(",");
        	//these rows corresponds to the max and min occupancies for the selected room
        	String minOcc = rows[3];
        	String maxOcc = rows[4];
        	while((line = br.readLine()) != null) {
        		System.out.println("Those are the minimum and maximum occupancies: "+ minOcc + maxOcc);        			  
        	}
        	
        }catch(FileNotFoundException e) {
        	e.printStackTrace();
        }catch(IOException e) { 
        	e.printStackTrace();
        }
        
	}
	
  //This method checks and displays the rates
	public void checkRates(String roomType) {
        String file = "C:/Users/Soubz/Documents/Computer Science/Year 2/CS4013/Project/l4Hotels.csv";
        String line = "";
        
        try {
        	BufferedReader br = new BufferedReader(new FileReader(file));
        	        	
        	String[] rows = line.split(",");
        	//these rows corresponds to the rates based on the day
        	String monday = rows[5];
        	String tuesday = rows[6];
        	String wednesday = rows[7];
        	String thursday = rows[8];
        	String friday = rows[9];
        	String saturday = rows[10];
        	String sunday = rows[11];
        	while((line = br.readLine()) != null) {
        		System.out.println("Those are the rates: "+ monday + tuesday + wednesday + thursday + friday + saturday + sunday);        		  
        	}
        	
        }catch(FileNotFoundException e) {
        	e.printStackTrace();
        }catch(IOException e) { 
        	e.printStackTrace();
        }
        
	}


}
