package HotelReservationSystem;

import java.io.IOException;

/**
 * @author Niamh Dunlea - 21145059
 * System that manages and runs the Reservations
 *
 */
public class ReservationSystem {
	public static void main(String[] args) throws IOException {

		ReservationMenu load = new ReservationMenu();
		load.run();
	}
}