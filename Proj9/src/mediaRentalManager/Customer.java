package mediaRentalManager;

import java.util.ArrayList;

public class Customer implements Comparable<Customer>{
	private String name;
	private String address;
	private String plan;
	public ArrayList<String> rented = new ArrayList<>();
	public ArrayList<String> queue = new ArrayList<>();
	
	public Customer(String name, String address, String plan) {
		this.name = name;
		this.address = address;
		this.plan = plan;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	
	public int compareTo(Customer other) {
		return this.name.compareTo(other.name);
	}
	
	public void addRented(String mediaTitle) {
		rented.add(mediaTitle);
		removeFromQueue(mediaTitle);
	}
	
	public void removeRented(String mediaTitle) {
		rented.remove(mediaTitle);
	}
	
	public String getRented() {
		return rented.toString();
	}
	
	public String getQueue() {
		return queue.toString();
	}
	
	public boolean addToQueue(String mediaTitle) {
		if (queue.contains(mediaTitle)) {
			return false;
		}
		
		queue.add(mediaTitle);
		return true;
	}
	
	public boolean removeFromQueue(String mediaTitle) {
		if (queue.contains(mediaTitle)) {
			queue.remove(mediaTitle);
			return true;
		}
		
		return false;
	}	
	
	public String toString() {
		return "Name: " + name + ", Address: " + address + ", Plan: " + plan + 
				"\n" + "Rented: " + getRented() + "\n" + "Queue: " + getQueue();
	}

}
