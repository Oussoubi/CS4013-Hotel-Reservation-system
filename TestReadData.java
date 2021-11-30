package HotelReservationSystem;

import HotelReservationSystem.Reservation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReadData{

  public static void main(String[]args){
        String file = "C:/Users/Soubz/Documents/Computer Science/Year 2/CS4013/Project/l4Hotels.csv";
        String line = "";
        
        try {
        	BufferedReader br = new BufferedReader(new FileReader(file));
        	//a while loop that stops as soon as there are no more columns left to go through
        	while((line = br.readLine()) != null) {
        		System.out.println(line) ;
        		  
        	}
        	
        }catch(FileNotFoundException e) {
        	e.printStackTrace();
        }catch(IOException e) { 
        	e.printStackTrace();
        }
        
     }
}
