package tests;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;
import sysImplementation.Utilities;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) 
public class PublicTests {
	/* We use this string to prevent any hardcoding of results. */
	/* The submit server uses a different value for TESTS_TAG */
	public static final String TESTS_TAG = "\nEndTest";

	@Test
	public void test1() {
		int[] array = {5, 10, 17, 8, 22, 97, 30};
		int lower = 8, upper = 23;
		String answer = "";
		
		int count = Utilities.getCountInRange(array, lower, upper);
		answer += "Count: " + count;
		answer += TESTS_TAG;

		assertTrue(TestsSupport.isCorrect("pubTest1.txt", answer));
	}
	
	@Test
	public void test2() {
		int[] array = {5, 10, 17, 8, 22, 97, 30};
		int[] result = new int[array.length];
		String answer = "";
		
		int found = Utilities.getEvens(array, result);
		answer += "Found: " + found;
		for (int i = 0; i < found; i++) {
			answer += "\n" + result[i];
		}
		answer += TESTS_TAG;
		System.out.println(answer);

		assertTrue(TestsSupport.isCorrect("pubTest2.txt", answer));
	}
	
	@Test
	public void test3() {
		int[] array = {5, 10, 17, 8, 22, 97, 30};
		int lower = 8, upper = 23;
		String answer = "";
		
		int[] elems = Utilities.getArrayElemsInRange(array, lower, upper);
		answer += Arrays.toString(elems);  // Array.toString() returns a string with array elements :)
		answer += TESTS_TAG;
		
		assertTrue(TestsSupport.isCorrect("pubTest3.txt", answer));
	}
}