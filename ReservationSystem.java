package HotelReservationSystem;

import java.io.IOException;

//System that manages and runs the Reservations
public class ReservationSystem {
	public static void main(String[] args)
	        throws IOException
	   { 
	      ReservationMenu load = new ReservationMenu();
	      load.run();
	   }
}
