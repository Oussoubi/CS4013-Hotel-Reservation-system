package GP;

import java.time.LocalDate;

public class Reservation {
    private int reservationNumber;
    private String reservationName;
    private LocalDate day;
    private int startHour;
    private int endHour;
    private boolean reservationType;
    private int checkInDate;
    private int checkOutDate;
    private int noOfRooms;
    private String roomType;
    private int noOfPeople;
    private double cost;


    /*
	Creates A new Reservation Object from user Input.
	*/
    public Reservation(String reservationName,LocalDate day,int startHour,int endHour,boolean reservationType,
    		int checkInDate,int checkOutDate,int noOfRooms,String roomType,int noOfPeople) {
    	
        this.reservationNumber = (int) (Math.random()*1000);
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
	Creates A new Reservation Object from res.csv file. The Trick here is to get the Number from the csv file so that the user can cancel with the same number.
	*/
    public Reservation(int reservationNumber,String reservationName,LocalDate day,int startHour,int endHour,boolean reservationType,
    		int checkInDate,int checkOutDate,int noOfRooms,String roomType,int noOfPeople) {
    	
        this.reservationNumber = reservationNumber;
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
    public Reservation createRes(int reservationNumber,String reservationName,LocalDate day,int startHour,int endHour,boolean reservationType,
    		int checkInDate,int checkOutDate,int noOfRooms,String roomType,int noOfPeople){
		Reservation newRes = new Reservation(reservationNumber, reservationName, day, startHour, endHour, reservationType, checkInDate, checkOutDate, noOfRooms, roomType, noOfPeople);
		return newRes;
	}
    
    public LocalDate getDate() { 
    	return day; 
      }

    public int getReservationNumber() { 
        return reservationNumber;
      }
    public String getReservationName() {
        return reservationName;
      }
    public boolean getReservationType() {
        return reservationType;
      }
    public int getStartHour() {
    	return startHour;
    }
    public int getEndHour() {
    	return endHour;
    }
    public int getCheckInDate() {
        return checkInDate;
      }
    public int getCheckOutDate() {
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
    
    
    
    
    /*
    
    @Override
    public int compareTo(Reservation o) {
        if(day.isBefore(o.day))
            return -1;
        if(day.isAfter(o.day))
            return 1;
        if(endHour <= o.startHour)
            return -1;
        else if(startHour >= o.endHour)
            return 1;
        return 0;
    }
    
    public cancelReservation(int resNum) {
    	if(resNum == reservationNumber) {
    		System.out.println("Do you wish to cancel this appointment? : " + reservation)     //reservation is an arraylist containing the day of the booking
    		System.out.println("Yes (Y) or No (N)");
    		Scanner input = new Scanner(System.in);
    		String answer = input.nextLine().toUpperCase();
    		if(answer.equals("YES") || answer.equals("Y")) {
    			reservation.clear();
    			System.out.println("Appointment successfully cancelled");
    		}else if(answer.equals("NO") || answer.equals("N")) {
    			System.out.println("Return to menu");
    			//menu class gets called here
    		}else {
    			System.out.println("Please ensure you answered with YES/Y or NO/N");
    			String correction = input.nextLine().toUpperCase();
    		}
    	}
    }
    
    */
    
}
