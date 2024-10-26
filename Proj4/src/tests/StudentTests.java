package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import sysutilities.Name;

public class StudentTests {
	
	// Tests every Name constructor method
	@Test
	public void testConstructors() {
		String answer = "";
		Name name1 = new Name();
		answer += name1 + "\n";
		
		Name name2 = new Name("John", "Doe");
		answer += name2 + "\n";
		
		Name name3 = new Name("Jane", "D.", "Doe");
		answer += name3 + "\n";
		
		Name name4 = new Name("Rob", "Dob", "Job", '?');
		answer += name4 + "\n";
		
		
		System.out.println(answer);
		
		assertTrue(TestsSupport.isCorrect("studentTest1.txt", answer));
	}
	
	// Tests every getter (besides Nameobjcount) method
	@Test
	public void testGetters() {
		String answer = "";
		Name name = new Name("Jy'Mere", "D.", "Williams", '#');
		answer += name.getFirstname() + "\n";
		answer += name.getMiddlename() + "\n";
		answer += name.getLastname() + "\n";
		answer += name.getNickname() + "\n";
		
		System.out.println(answer);	
		assertTrue(TestsSupport.isCorrect("studentTest2.txt", answer));
	}
	
	// Tests every setter and the separator getter.
	@Test
	public void testSettersandSepGetter() {
		String answer = "";
		Name name = new Name("Jy'Mere", "D.", "Williams");
		name.setNickname("Jy");
		name.setSeparator('-');
		
		answer += name.getNickname() + "\n";
		answer += name.getSeparator();
		
		System.out.println(answer);	
		assertTrue(TestsSupport.isCorrect("studentTest3.txt", answer));
	}
	
	// Tests the equals, toString, and compareTo methods
	@Test
	public void testEqualsAndToString() {
		String answer = "";
		Name name1 = new Name("Jy'Mere", "D.", "Williams");
		Name name2 = new Name("John", "Brown");
		
		answer += name1.equals(name2) + "\n";
		answer += name1.toString() + " " + name2.toString() + "\n";
		
		System.out.println(answer);	
		assertTrue(TestsSupport.isCorrect("studentTest4.txt", answer));
	}
	
	// Tests the nameObjsCount and normalize method
	@Test
	public void testGetNameObjsCountAndNormalize() {
		String answer = "";
		String expectedAnswer = "MORGAN,ARTHUR";
		
		Name name = new Name("Arthur", "Morgan");
		answer += Name.getNumberOfNameObjects() + "\n";
		answer += Name.normalize(name, true) + "\n";
		
		System.out.println(answer);	
		
		assertEquals(expectedAnswer, Name.normalize(name, true).toString());
	}
	
	// Tests the compareTo method
	@Test
	public void testCompareTo() {
		int correctAnswer = 14;
		Name name = new Name("Arthur", "Morgan");
		Name name2 = new Name("John", "B.", "Martson");
		System.out.println("Comparing: " + name.compareTo(name2));
		
		assertEquals(correctAnswer, name.compareTo(name2));
	}
	
	
}
