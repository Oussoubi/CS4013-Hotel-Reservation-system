package GP;

public class Reservation {
    private int reservationNumber;
    private String reservationName;
    private String day;
    private int startHour;
    private int endHour;
    private String reservationType;
    private String checkInDate;
    private String checkOutDate;
    private int noOfRooms;
    private String roomType;
    private int noOfPeople;
    private double cost;
    
    /*
	Creates A new Reservation Object from user Input.
	*/
    public Reservation(int reservationNumber, String reservationName,String day,int startHour,int endHour,String reservationType,
    		String checkInDate,String checkOutDate,int noOfRooms,String roomType,int noOfPeople) {
    	
        this.reservationNumber = (int) (Math.random()*10000000);
        this.reservationName = reservationName;
        this.day = day;
        this.startHour = startHour;
        this.endHour = endHour;
        this.reservationType = reservationType;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.noOfRooms = noOfRooms;
        this.roomType = roomType;
        this.noOfPeople = noOfPeople;
    }
    
    /*
	Creates a new reservation.
	*/
    public Reservation createRes(int reservationNumber,String reservationName,String day,int startHour,int endHour,String reservationType,
    		String checkInDate,String checkOutDate,int noOfRooms,String roomType,int noOfPeople){
    	Reservation newRes= new Reservation(reservationNumber, reservationName, day, startHour, endHour, reservationType,
        		 checkInDate, checkOutDate, noOfRooms, roomType, noOfPeople);
    	return newRes;
	}
    
    public String getDate() { 
    	return day; 
      }

    public int getReservationNumber() { 
        return reservationNumber;
      }
    public String getReservationName() {
        return reservationName;
      }
    public String getReservationType() {
        return reservationType;
      }
    public int getStartHour() {
    	return startHour;
    }
    public int getEndHour() {
    	return endHour;
    }
    public String getCheckInDate() {
        return checkInDate;
      }
    public String getCheckOutDate() {
        return checkOutDate;
      }
    public int getNoOfRooms() {
        return noOfRooms;
      }
    public String getRoomType() {
        return roomType;
      }
    public int getNoOfPeople() {
        return noOfPeople;
      }
    public double getCost() {
        return cost;
      }
    
    public void setCost(double Cost) {
		this.cost = Cost;
	}
  
}
