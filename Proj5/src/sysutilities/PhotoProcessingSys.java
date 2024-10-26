package sysutilities;

import javax.swing.JOptionPane;

public class PhotoProcessingSys {
	private String name;
	private double balance;
	private Address address;
	private int transactions;
	private StringBuffer log;
	
	public PhotoProcessingSys(String name, String street, String city,
			String state, String zipCode) {
		this.name = name.strip();
		balance = 0;
		transactions = 0;
		log = new StringBuffer("Image Transactions \n");
		// Set the Address to a default value if an invalid Address is given
		try {
			address = new Address(street, city, state, zipCode);
		} catch (IllegalArgumentException e) {
			address = new Address();
		}
	}
	
	public PhotoProcessingSys() {
		name = "NONAME";
		balance = 0;
		transactions = 0;
		log = new StringBuffer("Image Transactions \n");
		address = new Address();
	}
	
	public String imageTransaction(String imageName, String task,
			String taskOptions, boolean graphicalMode) {
		transactions++;
		log.append("Transaction #" + transactions + ": ");
		
		if (graphicalMode) {
			PictureManager.graphicalModeOn();
			JOptionPane.showMessageDialog(null, "Continue");
		} else {
			PictureManager.graphicalModeOff();
		}
		
		if (task.equals("display")) {
			log.append(PictureManager.displayPicture(imageName));
			balance++;
			return PictureManager.displayPicture(imageName);
		} else if (task.equals("clear")) {
			log.append(PictureManager.clearScreen());
			balance++;
			return PictureManager.clearScreen();
		} else if (task.equals("displaylast")) {
			log.append(PictureManager.displayLastPicture());
			balance++;
			return PictureManager.displayLastPicture();
		} else if (task.equals("blackandwhite")) {
			log.append(PictureManager.displayPictureBlackWhitePosterize(imageName, 
					true, false));
			balance++;
			return PictureManager.displayPictureBlackWhitePosterize(imageName, 
					true, false);
		} else if (task.equals("posterize")) {
			log.append(PictureManager.displayPictureBlackWhitePosterize(imageName, 
					false, true));
			balance++;
			return PictureManager.displayPictureBlackWhitePosterize(imageName, 
					false, true);
		} else if (task.equals("blackandwhiteposterize")) {
			log.append(PictureManager.displayPictureBlackWhitePosterize(imageName, 
					true, true));
			balance++;
			return PictureManager.displayPictureBlackWhitePosterize(imageName, 
					true, true);
		} else if (task.equals("selectcolors")) {
			String colors = containsRGB(taskOptions);
			
			boolean red = false;
			boolean green = false;
			boolean blue = false;
			
			// Sets RGB to true/false depending on if the String contains it
			if (colors.contains("r")) {
				red = true;
			}
			if (colors.contains("g")) {
				green = true;
			}
			if (colors.contains("b")) {
				blue = true;
			}
			
			log.append(PictureManager.displayPictureSelectRedGreenBlue(imageName, 
					red, green, blue));
			balance += 2;
			return PictureManager.displayPictureSelectRedGreenBlue(imageName, 
					red, green, blue);
		}
		// Returns an empty string if the transaction is invalid
		return "";
	}
	
	// Returns a String version of the log of transactions
	public String getTransactions() {
		return log.toString();
	}
	
	public double getBalance() {
		return balance;
	}
	
	// Returns a String of letter(s) that show which RGB are in the String
	private String containsRGB(String colors) {
		colors = colors.toLowerCase();
		String containedColors = "";
		if (colors.contains("r")) {
			containedColors += "r";
		}
		if (colors.contains("g")) {
			containedColors += "g";
		}
		if (colors.contains("b")) {
			containedColors += "b";
		}
		return containedColors;
	}
	
	public String toString() {
		return "Customer Name: " + name + "\n" + "Customer Address: " + address
				+ "\n" + "Balance: " + balance;
	}
}