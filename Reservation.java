public class Reservation implements Comparable<Reservation> {
    private int reservationNumber;
    private String reservationName;
    private String reservationType;
    private int checkInDate;
    private int checkOutDate;
    private int NoOfRooms;
    private String RoomType;
    private int NoOfPeople;
    private double Cost;


    public Reservation() {

    }

    public Reservation(int reservationNumber,String reservationName,String reservationType,
    		int checkInDate,int checkOutDate,int NoOfRooms,String RoomType,int NoOfPeople,double Cost) {
        this.reservationNumber = reservationNumber;
        this.reservationName = reservationName;
        this.reservationType = reservationType;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.NoOfRooms = NoOfRooms;
        this.RoomType = RoomType;
        this.NoOfPeople = NoOfPeople;
        this.Cost = Cost;
    }

    public int getreservationNumber() {
        return reservationNumber;
      }
    public String getreservationName() {
        return reservationName;
      }
    public String getreservationType() {
        return reservationType;
      }
    public int getcheckInDate() {
        return checkInDate;
      }
    public int getcheckOutDate() {
        return checkOutDate;
      }
    public int getNoOfRooms() {
        return NoOfRooms;
      }
    public String getRoomType() {
        return RoomType;
      }
    public int getNoOfPeople() {
        return NoOfPeople;
      }
    public double getCost() {
        return Cost;
      }
    
    public void setReservationNumber(int newReservationNumber) {
        this.reservationNumber = newReservationNumber;
      }
    public void setReservationName(String ReservationName) {
        this.reservationName = ReservationName;
      }
    public void setReservationType(String ReservationType) {
        this.reservationType = ReservationType;
      }
    public void setCheckInDate(int CheckInDate) {
        this.checkInDate = CheckInDate;
      }
    public void setCheckOutDate(int CheckOutDate) {
        this.checkOutDate = CheckOutDate;
      }
    public void setNoOfRooms(int NoOfRooms) {
        this.noOfRooms = NoOfRooms;
      }
    public void setRoomType(String RoomType) {
        this.roomType = RoomType;
      }
    public void setNoOfPeople(int NoOfPeople) {
        this.noOfPeople = NoOfPeople;
      }
    public void setCost(double Cost) {
        this.cost = Cost;
      }
}
