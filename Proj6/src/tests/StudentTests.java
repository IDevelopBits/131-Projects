package tests;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import sysImplementation.Utilities;

public class StudentTests {
	
	@Test
	public void testFilter() {
		int[] nums = {13, 102, 45, 68, 97, 64};
		int[] expected = {45, 68, 97, 64};
		int[] actual = Utilities.filter​(nums, 40, 100);
		assertTrue(Arrays.equals(expected, actual));
	}

	@Test
	public void testGetArrayString() {
		int[] nums = {1, 2, 3};
		String expected = "1-2-3";
		assertEquals(expected, Utilities.getArrayString​(nums, '-'));
		
		int[] nums2 = {10, 100, 1000};
		String expected2 = "10@100@1000";
		assertEquals(expected2, Utilities.getArrayString​(nums2, '@'));
	}
	
	@Test
	public void testGetArrayStringsLongerThan() {
		StringBuffer[] word = new StringBuffer[5];
		word[0] = new StringBuffer("Pizza");
		word[1] = new StringBuffer("Bat");
		word[2] = new StringBuffer("Phenomenon");
		word[3] = new StringBuffer("Chocolate");
		word[4] = new StringBuffer("Spongebob");
		
		StringBuffer[] expected = {new StringBuffer("Phenomenon"), 
				new StringBuffer("Chocolate"), new StringBuffer("Spongebob")};
		StringBuffer[] actual = Utilities.getArrayStringsLongerThan​(word, 5);
		
		assertEquals(Arrays.toString(expected), Arrays.toString(actual));
	}
	
	@Test
	public void testGetInstances() {
		int[] nums = {50, 22, 19, 13, 45};
		int answer = 3;
		assertEquals(answer, Utilities.getInstances​(nums, 5, 25));
		int answer2 = 2;
		assertEquals(answer2, Utilities.getInstances​(nums, 30, 100));
	}
	
	@Test
	public void testRotate() {
		int[] nums = {45, 68, 97, 64};
		/* {68, 97, 64, 45} 1st rotate
		{97, 64, 45, 68 2nd rotate */
		int[] expected = {97, 64, 45, 68};
		Utilities.rotate​(nums, true, 2);
		assertTrue(Arrays.equals(expected, nums));
	}

}
