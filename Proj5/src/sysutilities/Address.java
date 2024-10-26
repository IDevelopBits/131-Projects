package sysutilities;

public class Address {
	private String street;
	private String city;
	private String state;
	private String zipCode;
	
	public Address(String street, String city, String state, String zipCode) {
		// Throws an exceptions if any of its parameters are null
		if (street==null || city==null || state==null || !validZipCode(zipCode)) {
			throw new IllegalArgumentException("Invalid Address Argument");
		}
		
		this.street = street.strip();
		this.city = city.strip();
		this.state = state.strip();
		this.zipCode = zipCode.strip();
	}
	
	public Address(String street) {
		this(street, "College Park", "MD", "20742");
	}
	
	public Address() {
		this("8223 Paint Branch Dr.", "College Park", "MD", "20742");
	}
	
	// Creates a copy (not reference) of an Address object
	public Address(Address other) {
        this(other.street, other.city, other.state, other.zipCode);
    }
	
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZipCode() {
		return zipCode;
	}
	
	// Returns whether or not a valid zipCode was entered
	private boolean validZipCode(String zipCode) {
		if (zipCode == null) {
			return false;
		}
		
		// Loops through every character to find a non-digit character
		for (int i = 0; i < zipCode.length(); i++) {
			char character = zipCode.charAt(i);
			if (!Character.isDigit(character)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		
		Address other = (Address) obj;
		return street.equals(other.street) && 
				city.equals(other.city) &&
				state.equals(other.state) &&
				zipCode.equals(other.zipCode);
	}
	
	// Returns an entire address String of the Address object
	public String toString() {
		return street + " " + city + " " + state + " " + zipCode;
	}
}