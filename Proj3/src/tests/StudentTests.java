package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import app.*;
import java.util.Random;

public class StudentTests {
	
	/* 
	 * To write a test just copy the method below (including @Test)
	 * and then add code that calls the method(s) you want to test.
	 * Print results using System.out.println. You run the tests
	 * as you run public tests. If you need help from TAs you need
	 * to have student tests that illustrate the problem you are
	 * experiencing.
	 * 
	 * Write your student tests as you develop your code (that is
	 * the correct approach).
	 * 
	 * Notice that unless you add an appropriate assert statement,
	 * JUnit tests by default pass (generate a green color confirmation).
	 * To avoid you been mislead, we added an assertTrue(false).  Just
	 * focus on the actual output you see in the console, ignoring
	 * the confirmation color for your student tests.
	 *  
	 */

	
	@Test
	public void studentTest1getRectangle() {
		int maxRows = 6, maxCols = 9;
		char symbol = '*';

		String yourResults = DrawingApp.getRectangle(maxRows, maxCols, symbol);
		System.out.println(yourResults);
		
		assertTrue(false);  /* added so test does not mislead you */
	}
	
	@Test
	public void showsTestsByDefaultPass() {
		System.out.println("I am doing nothing and I pass :)");
	}
}