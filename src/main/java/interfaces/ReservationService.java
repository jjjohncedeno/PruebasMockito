package interfaces;
import java.util.Date;
public interface ReservationService {
	public boolean isRentableUntil(Movie movie, Date date);
}
