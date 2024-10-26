package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import programs.*;

import java.io.ByteArrayOutputStream;

public class PublicTests {
	private static String INPUT_FILE_NAME_EXT = "Input.txt";
	private static String EXPECTED_RESULTS_EXT = "ExpectedResults.txt";
	
	@Test
	public void pubStringDemo1() throws Exception, Throwable {
		String testName = "pubStringDemo1", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		StringDemo.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		String results = newOutput.toString();
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
		
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
	}
	
	@Test
	public void pubNumberCheck1() throws Exception, Throwable {
		String testName = "pubNumberCheck1", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		NumberCheck.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		String results = newOutput.toString();
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
		
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
	}
	
	@Test
	public void pubIfDemo1() throws Exception, Throwable {
		String testName = "pubIfDemo1", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		IfDemo.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		String results = newOutput.toString();
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
		
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
	}
	
	@Test
	public void pubIfDemo2() throws Exception, Throwable {
		String testName = "pubIfDemo2", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		IfDemo.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		String results = newOutput.toString();
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
		
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
	}
	
	@Test
	public void pubIfDemo3() throws Exception, Throwable {
		String testName = "pubIfDemo3", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		IfDemo.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		String results = newOutput.toString();
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
		
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
	}
	
}