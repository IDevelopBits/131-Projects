package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import app.*;
import java.util.Random;

public class PublicTests {
	private static String EXPECTED_RESULTS_EXT = "ExpectedResults.txt";

	@Test
	public void pubGetRect1() {
		String testName = "pubGetRect1";
		String expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;

		int maxRows = 6, maxCols = 9;
		char symbol = '*';

		String yourResults = DrawingApp.getRectangle(maxRows, maxCols, symbol);
		TestingSupport.generateExpectedResultsFile(yourResults, expectedResultsFileName);

		/*
		 * You can see your program results in the console if you add the following line
		 */
		System.out.println(yourResults);

		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.exactCorrectResults(expectedResultsFileName, yourResults));
	}

	@Test
	public void pubGetRandColor1() {
		String testName = "pubGetRandColor1";
		String expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		Random random = new Random(10);

		String yourResults = "";
		for (int i = 1; i <= 2; i++) {
			char color = DrawingApp.getRandomColor(random);
			yourResults += color;
		}
		
		System.out.println(yourResults);

		TestingSupport.generateExpectedResultsFile(yourResults, expectedResultsFileName);
		assertTrue(TestingSupport.exactCorrectResults(expectedResultsFileName, yourResults));
	}
	
	@Test
	public void pubGetHorizBars1() {
		String testName = "pubGetHorizBars1";
		String expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		int maxRows = 12, maxCols = 10, bars = 3; 
		char color1 = 'R', color2 = 'G', color3 = 'B';
		
		String yourResults = DrawingApp.getHorizontalBars(maxRows, maxCols, bars, color1, color2, color3);

		System.out.println(yourResults);
		
		TestingSupport.generateExpectedResultsFile(yourResults, expectedResultsFileName);
		assertTrue(TestingSupport.exactCorrectResults(expectedResultsFileName, yourResults));
	}
	
	@Test
	public void pubGetHorizBars2() {
		String testName = "pubGetHorizBars2";
		String expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		int maxRows = 12, maxCols = 10, bars = 4; 
		char color1 = '*', color2 = '.', color3 = 'Y';
		
		String yourResults = DrawingApp.getHorizontalBars(maxRows, maxCols, bars, color1, color2, color3);
		System.out.println(yourResults);
		
		TestingSupport.generateExpectedResultsFile(yourResults, expectedResultsFileName);
		assertTrue(TestingSupport.exactCorrectResults(expectedResultsFileName, yourResults));
	}
	
	@Test
	public void pubGetHorizBars3() {
		String testName = "pubGetHorizBars3";
		String expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		int maxRows = 12, maxCols = 10, bars = 5; 
		char color1 = '*', color2 = '.', color3 = 'Y';
		
		String yourResults = DrawingApp.getHorizontalBars(maxRows, maxCols, bars, color1, color2, color3);

		TestingSupport.generateExpectedResultsFile(yourResults, expectedResultsFileName);
		assertTrue(TestingSupport.exactCorrectResults(expectedResultsFileName, yourResults));
	}
	
	@Test
	public void pubGetHorizBars4() {
		String testName = "pubGetHorizBars4";
		String expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		int maxRows = 12, maxCols = 10, bars = 6; 
		char color1 = '*', color2 = '.', color3 = 'Y';
		
		String yourResults = DrawingApp.getHorizontalBars(maxRows, maxCols, bars, color1, color2, color3);

		System.out.println(yourResults);
		
		TestingSupport.generateExpectedResultsFile(yourResults, expectedResultsFileName);
		assertTrue(TestingSupport.exactCorrectResults(expectedResultsFileName, yourResults));
	}
	
	@Test
	public void pubGetVertBars1() {
		String testName = "pubGetVertBars1";
		String expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		int maxRows = 10, maxCols = 12, bars = 3; 
		char color1 = 'R', color2 = 'G', color3 = 'B';
		
		String yourResults = DrawingApp.getVerticalBars(maxRows, maxCols, bars, color1, color2, color3);
		System.out.println(yourResults);
		
		TestingSupport.generateExpectedResultsFile(yourResults, expectedResultsFileName);
		assertTrue(TestingSupport.exactCorrectResults(expectedResultsFileName, yourResults));
	}
	
	@Test
	public void pubGetVertBars2() {
		String testName = "pubGetVertBars2";
		String expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		int maxRows = 10, maxCols = 12, bars = 6; 
		char color1 = 'R', color2 = 'G', color3 = 'B';
		
		String yourResults = DrawingApp.getVerticalBars(maxRows, maxCols, bars, color1, color2, color3);
		
		TestingSupport.generateExpectedResultsFile(yourResults, expectedResultsFileName);
		assertTrue(TestingSupport.exactCorrectResults(expectedResultsFileName, yourResults));
	}
	
	@Test
	public void pubGetVertBars3() {
		String testName = "pubGetVertBars3";
		String expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		int maxRows = 10, maxCols = 12, bars = 5; 
		char color1 = 'R', color2 = 'G', color3 = 'B';
		
		String yourResults = DrawingApp.getVerticalBars(maxRows, maxCols, bars, color1, color2, color3);
		
		TestingSupport.generateExpectedResultsFile(yourResults, expectedResultsFileName);
		assertTrue(TestingSupport.exactCorrectResults(expectedResultsFileName, yourResults));
	}
	
	@Test
	public void pubGetFlag1() {
		String testName = "pubGetFlag1";
		String expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		int size = 9; 
		char color1 = 'R', color2 = '.', color3 = 'Y';
		
		String yourResults = DrawingApp.getFlag(size, color1, color2, color3);
		System.out.println(yourResults);
		
		TestingSupport.generateExpectedResultsFile(yourResults, expectedResultsFileName);
		assertTrue(TestingSupport.exactCorrectResults(expectedResultsFileName, yourResults));
	}
	
	@Test
	public void pubGetFlag2() {
		String testName = "pubGetFlag2";
		String expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		int size = 4; 
		char color1 = '*', color2 = 'B', color3 = 'G';
		
		String yourResults = DrawingApp.getFlag(size, color1, color2, color3);
		
		TestingSupport.generateExpectedResultsFile(yourResults, expectedResultsFileName);
		assertTrue(TestingSupport.exactCorrectResults(expectedResultsFileName, yourResults));
	}
	
	@Test
	public void pubGetFlag3() {
		String testName = "pubGetFlag3";
		String expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		int size = 3; 
		char color1 = '*', color2 = 'B', color3 = 'G';
		
		String yourResults = DrawingApp.getFlag(size, color1, color2, color3);
		
		TestingSupport.generateExpectedResultsFile(yourResults, expectedResultsFileName);
		assertTrue(TestingSupport.exactCorrectResults(expectedResultsFileName, yourResults));
	}
	
	@Test
	public void pubGetFlag4() {
		String testName = "pubGetFlag4";
		String expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		int size = 15; 
		char color1 = 'R', color2 = '*', color3 = '.';
		
		String yourResults = DrawingApp.getFlag(size, color1, color2, color3);
		
		TestingSupport.generateExpectedResultsFile(yourResults, expectedResultsFileName);
		assertTrue(TestingSupport.exactCorrectResults(expectedResultsFileName, yourResults));
	}
	
	@Test
	public void pubdrawEight1() {
		String testName = "pubdrawEight1";
		String expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		int size = 15; 
		char color = 'R';
		
		String yourResults = DrawingApp.drawEight(size, color);
		System.out.println(yourResults);
		TestingSupport.generateExpectedResultsFile(yourResults, expectedResultsFileName);
		assertTrue(TestingSupport.exactCorrectResults(expectedResultsFileName, yourResults));
	}
	
	@Test
	public void pubdrawEight2() {
		//String testName = "pubdrawEight2";
		//String expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		int size = 16; 
		char color = 'R';
		
		String yourResults = DrawingApp.drawEight(size, color);
		
		
		assertNull(yourResults);
	}
}