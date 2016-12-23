import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {
	
	@Test
	public void testIsAdult() {
		Customer c = new Customer(18, "John", "0982545412");
		assertEquals(true, c.isAdult());
		
		Customer c2 = new Customer(15, "Maria", "0986254512");
		assertEquals(false, c2.isAdult());
	}
}
