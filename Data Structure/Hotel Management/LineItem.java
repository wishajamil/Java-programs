// for linkedlist
import java.util.*;
import java.text.*;

public class LineItem {
	private Date startDate; 
	private int roomNumber;
	private int date;
	private int invoiceNumber;
	private int customerAccNum;
	private int price;
	
	LineItem(int rN,Date sD, int d, int iN, int cAN, int p){
		startDate = sD;
		roomNumber = rN;
		date = d;
		invoiceNumber = iN;
		customerAccNum = cAN;
		price = p;
	}
	
	
	public String toString() {
		Date displayDate = getDate(startDate, date);
		System.out.println("startDate = "+displayDate.toString()); // @@@@@@@@@@@@@@@@@@@@@@@DEBUG
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(displayDate);
		return "[ROOM NUMBER: "+roomNumber+", DATE: "+date+", INVOICE NUMBER: "+invoiceNumber+", CUSTOMER ACCOUNT NUMBER: "+customerAccNum+", PRICE: "+price+"]";
	}
	
	// Calculates the gregorian output of the Date instead of days-from
	// Receives the days-from-start int and outputs the corresponding date in mm-dd-yyyy format
	public Date getDate(Date startDate, int daysFrom) {
		// Date object is not tied to any human calendar; It represents a point in time. 
		// Here we convert the 'Date' object into a 'Calendar' object which we use to represent the Gregorian Calendar
		// and we added the days, then converted back to 'Date' object. 
		
		Date sDate = startDate; 
		int dFrom = daysFrom; 
		Calendar cal = new GregorianCalendar();
		cal.setTime(sDate);
		cal.add(Calendar.DATE, dFrom);
		Date getDate = cal.getTime();
		return getDate;
	}
}
 