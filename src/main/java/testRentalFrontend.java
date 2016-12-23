
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.assertTrue;
import java.util.Date;

public class testRentalFrontend {
	private Customer customer = new Customer(18, "Pingui", "0521541512");
	private ReservationService reservationService = new ReservationService();
	private Movie movie = new Movie("Fiesta de salchichas", "Comedia", "R");
	private Date date;
	private RentalFrontend rentalFrontend = new RentalFrontend(reservationService);
	@Test
	public void isRentableTest() {
		assertTrue(rentalFrontend.isRentable(movie, customer, date));
	}
}
