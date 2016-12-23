import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertTrue;
import java.util.Date;

public class testRentalFrontend {
	private Customer customer = mock(Customer.class);
	private ReservationService reservationService = mock(ReservationService.class);
	private Movie movie = mock(Movie.class);
	private Date date;
	private RentalFrontend rentalFrontend = new RentalFrontend(reservationService);
	@Test
	public void isRentableTest() {
		when(movie.isRentableTo(customer)).thenReturn(true);
		when(reservationService.isRentableUntil(movie, date)).thenReturn(true);
		assertTrue(rentalFrontend.isRentable(movie, customer, date));
	}
}