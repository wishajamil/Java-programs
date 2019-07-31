import java.util.*;
// for bst
public class Customer {
	private String name;
	private long phoneNumber;
	private String address;
	private int customerAccNum;
	
	
	// Constructors
	Customer(String n, long pN, String a, int cAN){
		name = n;
		phoneNumber = pN;
		address = a;
		customerAccNum = cAN;
	}
	
	// Setter methods
	public void setName(String n) {
		name = n;
	}
	
	public void setPhoneNumber(long pN) {
		phoneNumber = pN;
	}
	
	
	public void setAddress(String a) {
		address = a;
	}
	
	public void setAccountNumber(int cAN) {
		customerAccNum = cAN;
	}
	
	// Getter methods
	public String getName() {
		return name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getAccountNumber() {
		return customerAccNum;
	}
	
	// toString method
	public String toString() {
		return "[NAME: " + name + ", PHONE NUMBER: " + phoneNumber + ", ADDRESS: " + address+"]"; 
	}
}
