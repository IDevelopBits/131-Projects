package sysutilities;

public class Name {
	private String firstName;
	private String middleName;
	private String lastName;
	private String nickname;
	private char separator;
	private static int nameObjsCount;

	public Name() {
		this("NOFIRSTNAME", "NOMIDDLENAME", "NOLASTNAME", '#');
	}
	
	public Name(String firstName, String lastName) {
		this(firstName, "", lastName, ',');
	}
	
	public Name(String firstName, String middleName, String lastName) {
		this(firstName, middleName, lastName, ',');
	}
	
	public Name(String firstName, String middleName, String lastName, 
			char separator) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		
		// Checks for valid separator otherwise it defaults to a comma
		if (validSeparator(separator)) {
			this.separator = separator;
		} else {
			this.separator = ',';
		}
		nameObjsCount++;
	}
	
	public String getFirstname() {
		return firstName;
	}

	public String getMiddlename() {
		return middleName;
	}

	public String getLastname() {
		return lastName;
	}
	
	public String getNickname() {
		if (nickname == null) {
			return "";
		} else {
			return nickname;
		}
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public char getSeparator() {
		return separator;
	}

	public void setSeparator(char separator) {
		this.separator = separator;
	}
	
	// Two names are equal if they have the same data
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		
		Name other = (Name) obj;
		return firstName.equals(other.firstName) &&
				middleName.equals(other.middleName) &&
				lastName.equals(other.lastName);
	}
	
	// Compares two names alphabetically in (last, first, middle) order
	public int compareTo(Name other) {
		int orderOfLastName = lastName.compareTo(other.lastName);
		int orderOfFirstName = firstName.compareTo(other.firstName);
		int orderOfMiddleName = middleName.compareTo(other.middleName);
		
		if (orderOfLastName != 0) {
			return orderOfLastName;
		} else if (orderOfFirstName != 0) {
			return orderOfFirstName;
		} else {
			return orderOfMiddleName;
		}
	}
	
	private boolean validSeparator(char separator) {
		//Separator must be #, ",", -
		return separator == '#' || separator == ',' || separator == '-';
	}
	
	public static int getNumberOfNameObjects() {
		return nameObjsCount;
	}
	
	public static Name normalize(Name other, boolean casing) {
		String newFirstNm;
		String newMiddleNm;
		String newLastNm;
		
		if (other == null) {
			return null;
		}
		
		if (casing) {
			newFirstNm = other.firstName.toUpperCase();
			newMiddleNm = other.middleName.toUpperCase();
			newLastNm = other.lastName.toUpperCase();
		} else {
			newFirstNm = other.firstName.toLowerCase();
			newMiddleNm = other.middleName.toLowerCase();
			newLastNm = other.lastName.toLowerCase();
		}
		
		return new Name(newFirstNm, newMiddleNm, newLastNm, ',');
	}
	
	public String toString() {
		String nicknm = "(" + this.nickname + ")";
		String firstNm = firstName;
		
		// If name is null, just create an empty string
		if (nickname == null) {
			nicknm = "";
		}
		// Only add a separator if there name includes a middle name
		if (!middleName.equals("")) {
			firstNm += separator;
		}
		
		return lastName + separator + firstNm + middleName + nicknm;
	}

}