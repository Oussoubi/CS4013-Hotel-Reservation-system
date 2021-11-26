package HotelReservationSystem;

import java.util.ArrayList;

public class Room{
	private String roomType;
	private int noOfRooms;
	private int MinOcc;
	private int MaxOcc;
	private double[] rates = new double[7];
	private ArrayList<Reservation> booking = new ArrayList<Reservation>();
	
	
	public Room(String roomType, int MinOcc, int MaxOcc, double[] rates) {
		this.roomType = roomType;
		this.MinOcc = MinOcc;
		this.MaxOcc = MaxOcc;
		this.rates = rates;
	}

	public ArrayList<Reservation> getBooking() {
		return booking;
	}

	public String getRoomType() {
		return roomType;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}
	
	public int getMinOcc() {
		return noOfRooms;
	}
	
	public int getMaxOcc() {
		return MaxOcc;
	}
	
	public double[] getRates() {
		return rates;
	}


}
