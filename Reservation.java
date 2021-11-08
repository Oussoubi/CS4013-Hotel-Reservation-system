import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class Reservation implements Comparable<Reservation> {
    private int ReservationNumber;
    private String customerName;
    private String ReservationType;
    private int CheckInDate;
    private int CheckOutDate;
    private double Cost;

    public Reservation() {

    }

    public Reservation(int ReservationNumber,String customerName,String ReservationType,
        LocalDate day,int CheckInDate,int CheckOutDate) {
        this.ReservationNumber = ReservationNumber;
        this.customerName = customerName;
        this.ReservationType = ReservationType;
        this.CheckInDate = CheckInDate;
        this.CheckOutDate = CheckOutDate;
    }

    public void readFrom(Scanner input) {
        ReservationNumber = input.nextInt();
        customerName = input.next();
        CheckInDate = input.nextInt();
        CheckOutDate = input.nextInt();
    }

    public void writeTo(PrintWriter output) {
        output.print(ReservationNumber);
        output.print(" ");
        output.print(customerName);
        output.print(" ");
        output.print(CheckInDate);
        output.print(" ");
        output.print(CheckOutDate);
    }

    public String toString() {
        return ReservationNumber + ": " +
               CheckInDate + "-" + CheckOutDate;
    }

    @Override
    public int compareTo(Reservation o) {
        if(CheckOutDate <= o.CheckInDate)
            return -1;
        else if(CheckInDate >= o.CheckOutDate)
            return 1;
        return 0;
    }
}