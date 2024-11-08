package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import photomanager.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class StudentTests {
	
	@Test
	public void testPhotoConstructorsToString() {
		Photo photo1 = new Photo("umcp/college8.jpg", 100, 200, 
				"05/21/2015-17:08");
		Photo photo2 = new Photo(photo1);
		
		String p1 = photo1.toString();
		String p2 = photo2.toString();
		
		assertTrue(p1.equals(p2));
	}
	
	@Test 
	public void photoConstructorExceptions() {
		//photo3 should throw an exceptions for blank/null Strings
		boolean p3Exception = false;
		try {
			Photo photo3 = new Photo("", 300, 200, null); 
		} catch (IllegalArgumentException e) {
			p3Exception = true;
		}
		
		//photo4 should throw an exceptions for negative ints
		boolean p4Exception = false;
		try {
			Photo photo4 = new Photo("umcp/college8.jpg", -125, 200, 
					"01/21/1987-17:08"); 
		} catch (IllegalArgumentException e) {
			p4Exception = true;
		}
		
		if (p3Exception && p4Exception) {
			assertTrue(true);
		} else {
			fail("photo3 or photo4 did not throw an exception!");
		}
	}
	
	@Test
	public void testAddComments() {
		Photo photo = new Photo("umcp/college8.jpg", 100, 200, 
				"05/21/2015-17:08");	
		
		photo.addComments("1").addComments("2").addComments("3");
		
		//addComments should throw an exceptions for blank/null Strings
		try {
			photo.addComments("");
			fail("addComments did not throw an exeption!");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	@Test
	public void testGetters() {
		Photo photo1 = new Photo("umcp/college8.jpg", 100, 200, 
				"05/21/2015-17:08");
		photo1.addComments("This is a comment! Pretty cool.");
		
		String photoSource = "umcp/college8.jpg";
		int width = 100;
		int height = 200;
		String date = "05/21/2015-17:08";
		String comments = "This is a comment! Pretty cool.";
		
		//Answer should be true meaning the gets return the same values above
		boolean answer = (photo1.getPhotoSource().equals(photoSource)) && 
				(photo1.getHeight() == height) && (photo1.getWidth() == width)
				&& (photo1.getDate().equals(date)) && 
				(photo1.getComments().equals(comments));
		
		assertTrue(answer);
	}
	
	@Test
	public void testCompareTo() {
		Photo photo1 = new Photo("umcp/college7.jpg", 100, 200, 
				"05/21/2015-17:08");
		Photo photo2 = new Photo("umcp/college8.jpg", 100, 200, 
				"03/15/2038-17:08");
		Photo photo3 = new Photo("umcp/college1.jpg", 100, 200, 
				"11/07/2024-17:08");
		Photo photo4 = new Photo(photo1);
		
		int p1p4Compare = photo1.compareTo(photo4);
		int p1p3Compare = photo1.compareTo(photo3);
		int p2p3Compare = photo2.compareTo(photo3);
		
		assertTrue(p1p4Compare == 0 && p1p3Compare == -1 && p2p3Compare == 1);
	}
	
	@Test
	public void testFindPhoto() {
		PhotoManager pm = new PhotoManager();
		pm.addPhoto("umcp/college0.jpg", 200, 200, 
				"10/20/2020-18:10");
		int photoFound1 = pm.findPhoto("umcp/college0.jpg");
		if (photoFound1 == -1) {
			fail("umcp/college0.jpg could not be found!");
		} 
		assertEquals(0, photoFound1);
		
		int photoFound2 = pm.findPhoto(null);
		assertEquals(-1, photoFound2);
	}
	
	@Test
	public void testAddPhoto() {
		PhotoManager pm = new PhotoManager();
		pm.addPhoto("umcp/college0.jpg", 200, 200, 
				"10/20/2020-18:10");
		boolean addedPhoto = pm.addPhoto("umcp/college0.jpg", 200, 200, 
				"10/20/2020-18:10");
		
		//Test for repeat added photos
		if (addedPhoto == true) {
			fail("The same photo was added again!");
		} else {
			assertTrue(true);
		}
	}
	
	@Test
	public void testGetComments() {
		PhotoManager pm = new PhotoManager();
		pm.addPhoto("umcp/college0.jpg", 200, 200, 
				"10/20/2020-18:10");
		pm.addComment("umcp/college0.jpg", "This is a photo");
		
		String comments1 = pm.getComments("umcp/college0.jpg");
		assertEquals("This is a photo", comments1);
		String comments2 = pm.getComments("umcp/college2.jpg");
		assertEquals(null, comments2);
		
	}
	
	@Test
	public void testRemovePhotos() {
		PhotoManager pm = new PhotoManager();
		pm.addPhoto("umcp/college1.jpg", 300, 400, "09/17/2020-17:10");
		pm.addPhoto("umcp/college3.jpg", 200, 200, "11/18/2019-09:00");
		pm.addPhoto("umcp/college8.jpg", 200, 200, "10/18/2020-18:30");
		pm.addPhoto("umcp/college7.jpg", 480, 640, "07/14/2021-18:27");
		
		boolean removedPhoto3 = pm.removePhoto("umcp/college3.jpg");
		assertTrue(removedPhoto3);
		
		pm.removeAllPhotos();
		
		//Test if all photos have been removed
		assertEquals(-1, pm.findPhoto("umcp/college1.jpg"));
		assertEquals(-1, pm.findPhoto("umcp/college8.jpg"));
		assertEquals(-1, pm.findPhoto("umcp/college7.jpg"));
	}
	
	@Test
	public void testLoadPhotos() {
		PhotoManager pm = new PhotoManager();
		boolean loadPhotos1 = pm.loadPhotos("photoInfoToLoad.txt");
		assertTrue(loadPhotos1);
		
		// loadPhotos2/3 should return false since the files don't exist;
		boolean loadPhotos2 = pm.loadPhotos("noFile.txt");
		assertTrue(!loadPhotos2);
		boolean loadPhotos3 = pm.loadPhotos(null);
		assertTrue(!loadPhotos3);
	}
	
	@Test
	public void testSortPhotosByDate() {
		PhotoManager pm = new PhotoManager();
		pm.addPhoto("umcp/college1.jpg", 300, 400, "09/17/2020-17:10");
		pm.addPhoto("umcp/college3.jpg", 200, 200, "11/18/2019-09:00");
		String expected = "umcp/college3.jpg,200,200,11/18/2019-09:00"
				+ "umcp/college1.jpg," + "300,400,09/17/2020-17:10";
		pm.sortPhotosByDate();
		assertEquals(expected, pm.toString());
	}
}