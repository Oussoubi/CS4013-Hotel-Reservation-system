package HotelReservationSystem;

import HotelReservationSystem.Reservation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadData{

  public static void main(String[]args){
        String file = "C:/Users/Soubz/Documents/Computer Science/Year 2/CS4013/Project/l4Hotels.csv";
        String line = "";
        
        try {
        	BufferedReader br = new BufferedReader(new FileReader(file));
        	
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
