package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import sysutilities.Address;
import sysutilities.PhotoProcessingSys;

public class StudentTests {
	
	@Test
	public void testConstructors() {
		Address address1 = new Address("3841 Campus Dr.", 
				"College Park", "MD", "20742");
		String answer1 = "3841 Campus Dr. College Park MD 20742";
		assertEquals(answer1, address1.toString());
		
		Address address2 = new Address("131 CS Rd.");
		String answer2 = "131 CS Rd. College Park MD 20742";
		assertEquals(answer2, address2.toString());

		Address address3 = new Address();
		String answer3 = "8223 Paint Branch Dr. College Park MD 20742";
		assertEquals(answer3, address3.toString());
		
		// Uses same answer since the String should be the same
		Address address4 = new Address(address2);
		assertEquals(answer2, address4.toString());
	}
	
	@Test(expected = IllegalArgumentException.class)
    public void testException() {
		Address home = new Address(null, "Greenbelt", "MD", "20706");
    }
	
	@Test
	public void testGetters() {
		Address umd = new Address("3841 Campus Dr.", 
				"College Park", "MD", "20742");
		String street1 = "3841 Campus Dr.";
		String city1 = "College Park";
		String state1 = "MD";
		String zipcode1 = "20742";
		
		assertEquals(street1, umd.getStreet());
		assertEquals(city1, umd.getCity());
		assertEquals(state1, umd.getState());
		assertEquals(zipcode1, umd.getZipCode());
				
		Address udel = new Address("210 S College Ave.", "Newark", "DE", 
				"19716");
		String street2 = "210 S College Ave.";
		String city2 = "Newark";
		String state2 = "DE";
		String zipcode2 = "19716";
		
		assertEquals(street2, udel.getStreet());
		assertEquals(city2, udel.getCity());
		assertEquals(state2, udel.getState());
		assertEquals(zipcode2, udel.getZipCode());
	}
	
	@Test
	public void testEquals() {
		Address umd = new Address("3841 Campus Dr.", 
				"College Park", "MD", "20742");
		Address udel = new Address("210 S College Ave.", "Newark", "DE", 
				"19716");
		Address umd2 = new Address(umd);
		
		
		assertTrue(!umd.equals(udel));
		assertTrue(umd.equals(umd2));
	}
	
	@Test
	public void testToString() {
		Address udel = new Address("210 S College Ave.", "Newark", "DE", 
				"19716");
		String answer = "210 S College Ave. Newark DE 19716";
		assertEquals(answer, udel.toString());
	}
}
