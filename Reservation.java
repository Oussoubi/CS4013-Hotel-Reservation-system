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
