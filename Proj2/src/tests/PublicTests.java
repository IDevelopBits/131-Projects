package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import programs.*;

import java.io.ByteArrayOutputStream;

public class PublicTests {
	private static String INPUT_FILE_NAME_EXT = "Input.txt";
	private static String EXPECTED_RESULTS_EXT = "ExpectedResults.txt";
	
	@Test
	public void pubConvert1() throws Exception, Throwable {
		String testName = "pubConvert1", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		Convert.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		String results = newOutput.toString();
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
		
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
	}
	
	@Test
	public void pubConvert2() throws Exception, Throwable {
		String testName = "pubConvert2", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		Convert.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		String results = newOutput.toString();
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
		
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
	}
	
	@Test
	public void pubConvert3() throws Exception, Throwable {
		String testName = "pubConvert3", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		Convert.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		String results = newOutput.toString();
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
		
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
	}
	
	@Test
	public void pubDiceDuel1() throws Exception, Throwable {
		String testName = "pubDiceDuel1", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		DiceDuel.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		String results = newOutput.toString();
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
		
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
	}
	
	@Test
	public void pubDiceDuel2() throws Exception, Throwable {
		String testName = "pubDiceDuel2", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		DiceDuel.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		String results = newOutput.toString();
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
		
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
	}
	@Test
	public void pubAccess1() throws Exception, Throwable {
		String testName = "pubAccess1", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		Access.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		String results = newOutput.toString();
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
		
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
	}
	
	@Test
	public void pubAccess2() throws Exception, Throwable {
		String testName = "pubAccess2", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		Access.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		String results = newOutput.toString();
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
		
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
	}
	
	@Test
	public void pubAccess3() throws Exception, Throwable {
		String testName = "pubAccess3", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		Access.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		String results = newOutput.toString();
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
		
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
	}
}