package tests;

import static org.junit.Assert.*;
import java.util.Arrays;

import org.junit.Test;

import system.CombineLeftRight;
import system.CombineTopBottom;
import system.Diagram;
import system.Flag;
import system.HorizontalBars;
import system.TwoDimArrayUtil;
import system.VerticalBars;

public class StudentTests {

	@Test
	public void testAppendLeftRight() {
		// Left-right append
		char[][] left = { { 'R', 'R' }, { 'B', 'B' } };
		char[][] right = { { 'G', 'G' } };

		char[][] appendedLR = TwoDimArrayUtil.appendLeftRight(left, right);
		char[][] expectedLR = { { 'R', 'R', 'G', 'G' }, { 'B', 'B' } };
		assertTrue(Arrays.deepEquals(expectedLR, appendedLR));
	}

	@Test
	public void testAppendTopBottom() {
		// Top-bottom append
		char[][] top = { { 'R', 'R' }, { 'B', 'B' } };
		char[][] bottom = { { 'G', 'G' } };

		char[][] appendedTB = TwoDimArrayUtil.appendTopBottom​(top, bottom);
		char[][] expectedTB = { { 'R', 'R' }, { 'B', 'B' }, { 'G', 'G' } };

		assertTrue(Arrays.deepEquals(expectedTB, appendedTB));
	}

	@Test
	public void testRotateLeft() {
		char[][] arr = { { 'R', 'R', 'G', 'G' }, { 'B', 'B', 'R', 'R' } };
		TwoDimArrayUtil.rotateLeftOneColumn​(arr);
		char[][] expected = { { 'R', 'G', 'G', 'R' }, { 'B', 'R', 'R', 'B' } };
		assertTrue(Arrays.deepEquals(expected, arr));
	}

	@Test
	public void testRotateTop() {
		char[][] arr = { { 'R', 'R', 'G', 'G' }, { 'B', 'B', 'R', 'R' } };
		TwoDimArrayUtil.rotateTopOneRow​(arr);
		char[][] expected = { { 'B', 'B', 'R', 'R' }, { 'R', 'R', 'G', 'G' } };

		assertTrue(Arrays.deepEquals(expected, arr));
	}

	@Test
	public void testHorizontalBars() {
		
		int maxRows = 10, maxCols = 10, bars = 4, animationType = 1;
		char color1 = 'R', color2 = 'G', color3 = 'B';
		HorizontalBars horizontalBars = new HorizontalBars(maxRows, maxCols, 
				bars, color1, color2, color3,
				animationType);
		char[][] expectedBoard = {
	            {'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R'},
	            {'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R'},
	            {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
	            {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
	            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
	            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
	            {'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R'},
	            {'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R'}
	        };
		
		assertTrue(Arrays.deepEquals(expectedBoard, horizontalBars.getBoard()));
		
		char[][] nextAnimationStep = null;
		for (int i = 1; i <= 2; i++) {
			nextAnimationStep = horizontalBars.nextAnimationStep();
		}
		
		char[][] expected = {
	            {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
	            {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
	            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
	            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
	            {'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R'},
	            {'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R'},
	            {'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R'},
	            {'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R'}
	        };
		
		assertTrue(Arrays.deepEquals(expected, nextAnimationStep));
	}

	@Test
	public void testVerticalBars() {
		int maxRows = 10, maxCols = 10, bars = 4, animationType = 1;
		char color1 = 'R', color2 = 'G', color3 = 'B';
		VerticalBars verticalBars = new VerticalBars(maxRows, maxCols, 
				bars, color1, color2, color3,
				animationType);
		char[][] expectedBoard = {
		            {'R', 'R', 'G', 'G', 'B', 'B', 'R', 'R'},
		            {'R', 'R', 'G', 'G', 'B', 'B', 'R', 'R'},
		            {'R', 'R', 'G', 'G', 'B', 'B', 'R', 'R'},
		            {'R', 'R', 'G', 'G', 'B', 'B', 'R', 'R'},
		            {'R', 'R', 'G', 'G', 'B', 'B', 'R', 'R'},
		            {'R', 'R', 'G', 'G', 'B', 'B', 'R', 'R'},
		            {'R', 'R', 'G', 'G', 'B', 'B', 'R', 'R'},
		            {'R', 'R', 'G', 'G', 'B', 'B', 'R', 'R'},
		            {'R', 'R', 'G', 'G', 'B', 'B', 'R', 'R'},
		            {'R', 'R', 'G', 'G', 'B', 'B', 'R', 'R'}
		        };
		
		assertTrue(Arrays.deepEquals(expectedBoard, verticalBars.getBoard()));
		
		char[][] nextAnimationStep = null;
		for (int i = 1; i <= 2; i++) {
			nextAnimationStep = verticalBars.nextAnimationStep();
		}
		
		char[][] expected = {
	            {'G', 'G', 'B', 'B', 'R', 'R', 'R', 'R'},
	            {'G', 'G', 'B', 'B', 'R', 'R', 'R', 'R'},
	            {'G', 'G', 'B', 'B', 'R', 'R', 'R', 'R'},
	            {'G', 'G', 'B', 'B', 'R', 'R', 'R', 'R'},
	            {'G', 'G', 'B', 'B', 'R', 'R', 'R', 'R'},
	            {'G', 'G', 'B', 'B', 'R', 'R', 'R', 'R'},
	            {'G', 'G', 'B', 'B', 'R', 'R', 'R', 'R'},
	            {'G', 'G', 'B', 'B', 'R', 'R', 'R', 'R'},
	            {'G', 'G', 'B', 'B', 'R', 'R', 'R', 'R'},
	            {'G', 'G', 'B', 'B', 'R', 'R', 'R', 'R'}
	        };
		
		assertTrue(Arrays.deepEquals(expected, nextAnimationStep));
	}
	
	@Test
	public void testBarsGetters() {
		int maxRows = 10, maxCols = 10, bars = 4, animationType = 1;
		char color1 = 'R', color2 = 'G', color3 = 'B';
		HorizontalBars horizontalBars = new HorizontalBars(maxRows, maxCols, 
				bars, color1, color2, color3,
				animationType);
		assertEquals(10, horizontalBars.getNumberCols());
		assertEquals(8, horizontalBars.getNumberRows());
		
		VerticalBars verticalBars = new VerticalBars(maxRows, maxCols, 
				bars, color1, color2, color3,
				animationType);
		assertEquals(8, verticalBars.getNumberCols());
		assertEquals(10, verticalBars.getNumberRows());
	}
	
	@Test
	public void testCombineLeftRightGetters() {
		int maxRows = 4, maxCols = 4, bars = 2, animationType = 1;
		char color1 = 'R', color2 = 'G', color3 = 'B';
		HorizontalBars horizontalBars = new HorizontalBars(maxRows, maxCols, bars, 
				 color1, color2, color3, animationType);
		
		VerticalBars verticalBars = new VerticalBars(maxRows, maxCols, bars, 
			   color1, color2, color3, animationType);
		Diagram combined = new CombineLeftRight(horizontalBars, verticalBars, 1);
		assertEquals(8, combined.getNumberCols());
		assertEquals(4, combined.getNumberRows());
		
        char[][] expected = {
                {'R', 'R', 'R', 'R', 'R', 'R', 'G', 'G'},
                {'R', 'R', 'R', 'R', 'R', 'R', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'R', 'R', 'G', 'G'},
                {'G', 'G', 'G', 'G', 'R', 'R', 'G', 'G'}
            };
		
		assertTrue(Arrays.deepEquals(expected, combined.getBoard()));
	}
	
	@Test
	public void testCombineTopBottomGetters() {
		int maxRows = 4, maxCols = 4, bars = 2, animationType = 1;
		char color1 = 'R', color2 = 'G', color3 = 'B';
		HorizontalBars horizontalBars = new HorizontalBars(maxRows, maxCols, bars, 
				 color1, color2, color3, animationType);
		
		VerticalBars verticalBars = new VerticalBars(maxRows, maxCols, bars, 
			   color1, color2, color3, animationType);
		
		Diagram combined = new CombineTopBottom(horizontalBars, verticalBars, 1);
		assertEquals(4, combined.getNumberCols());
		assertEquals(8, combined.getNumberRows());
		
        char[][] expected = {
                {'R', 'R', 'R', 'R'},
                {'R', 'R', 'R', 'R'},
                {'G', 'G', 'G', 'G'},
                {'G', 'G', 'G', 'G'},
                {'R', 'R', 'G', 'G'},
                {'R', 'R', 'G', 'G'},
                {'R', 'R', 'G', 'G'},
                {'R', 'R', 'G', 'G'}
            };
		
		assertTrue(Arrays.deepEquals(expected, combined.getBoard()));
	}
	
	@Test
	public void testFlag() {
		char color1 = 'R', color2 = 'G', color3 = 'B';
		
		Flag flag = new Flag(3, color1, color2, color3, 1);
		assertEquals(15, flag.getNumberCols());
		assertEquals(6, flag.getNumberRows());
		
		 char[][] expected = {
	{'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
	{'R', 'R', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
	{'R', 'R', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
	{'R', 'R', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
	{'R', 'R', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
	{'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'}
		 };
		 
	assertTrue(Arrays.deepEquals(expected, flag.getBoard()));
	
	char[][] nextStep = {
     {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R'},
     {'R', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'R'},
     {'R', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R'},
     {'R', 'R', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R'},
     {'R', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'R'},
     {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G', 'R'}
         };
	
	assertTrue(Arrays.deepEquals(nextStep, flag.nextAnimationStep()));
	
	}
}
