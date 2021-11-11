package HotelReservationSystem;

import java.util.ArrayList;

import HotelReservationSystem.Reservation;
import HotelReservationSystem.ReservationDate;

public class Calendar {
	private ArrayList<Reservation> reservations;
	
	public void add(Reservation r) {
		reservations.add(r);
	}
	
	public ArrayList<Reservation> getReservationsForDay(ReservationDate d){
		   ArrayList<Reservation> todayReservs = new ArrayList<Reservation>();
		   for(Reservation r : reservations) {
			   if(r.getDate().equals(d)) {
				   todayReservs.add(r);
			   }
		   }
		   return todayReservs;
	   }
	   
	   public void cancel(Reservation resNum) {
		   for(Reservation ReservationNumber:reservations) {
			   if (ReservationNumber.equals(resNum)) {
			   reservations.remove(ReservationNumber);
			  }
			   System.out.print("This reservation does not exist");
		   }
	   }
}
