import java.util.*;

// Class to book/check availability

public class Book {
	private Date startDate; 
	private String[] availArray = new String[365]; 
	private boolean checkAvail = false;
	int totalBookPrice; 
	int currentInvoiceNumber = 4000;
	int currentCustomerAccNumber = 1000;
	
	String userInput;
	String bookName;
	String bookAddress = "";
	String bookRoomType;
	long bookPhoneNumber;
	int bookCheckInDate;
	int daysNeeded;
	
	
	// Initiate the queue 
	Queue<String> queue = new LinkedList<>();
	
	// Initiate the Binary Search Tree to hold customer information.
	// Receives a Customer object and uses the phone number as a key.
	// No two customers may use the same phone number.
	// BST doesn't take duplicates, and we don't want duplicate entries for the same customer. 
	BSTFunctions BST = new BSTFunctions();
	
	// Create a LINKEDLIST for invoice data
	// holds object LineItem which is generated per booking of a room a day (2 
	LinkedList<LineItem> itemList = new LinkedList<LineItem>();
	
	Scanner input = new Scanner(System.in);
	
	// Constructor to construct a new date 
	Book(Date start){
		startDate = start;
		clearAvailArray();
	}
	
	// Main user interface
	public void mainMenuPrompt() {
		int menuInput;
		
		// moved to beginning: Scanner input = new Scanner(System.in);
		
		System.out.println("\n"+"What would you like to do? [PRESS NUMBER]");
		System.out.println("    [1]: Manage the queue");
		System.out.println("    [2]: Book 1st customer in queue");		
		System.out.println("    [3]: Invoice Management");
		System.out.println("    [4]: View Customer History");		
		
		menuInput = input.nextInt(); // Read user input
		input.nextLine(); // Throw away the '/n' not used by .nextInt
		System.out.println("\n"+"You have selected input [" + menuInput + "].");
		
		switch (menuInput) {
		// We will add nested scopes to this switch statement so I don't need to make a million variables
		case 1: {
			// code option 1
			System.out.println("\n"+"----------------[MENU > [1] MANAGE THE QUEUE]");
			queueMenu(); // Opens the queue menu options (3)
			break;
		}
		case 2: {
			// code option 2
			System.out.println("\n"+"----------------[MENU > [2] BOOK 1ST CUSTOMER IN QUEUE]");
			bookFirst();
			break;
		}
		case 3: {
			// code option 3
			System.out.println("\n"+"----------------[MENU > [3] INVOICE MANAGEMENT]");
			break;
		}
		case 4: {
			// code option 4
			System.out.println("\n"+"----------------[MENU > [4] VIEW CUSTOMER HISTORY]");
			break;
		}
		}
		
		System.out.println("\n"+"Returning to main menu.");
		mainMenuPrompt();

	} // end mainMenuPrompt method
	
	public void queueMenu() {
		// MainMenu option 1

		int menuInput;
		
		System.out.println("\n"+"What would you like to do? [PRESS NUMBER]");
		System.out.println("    [1]: Add a customer to queue");
		System.out.println("    [2]: View the queue");		
		System.out.println("    [3]: Return to main menu");	
		
		menuInput = input.nextInt();
		input.nextLine(); // Throw away the '/n' not used by .nextInt
		
		switch (menuInput) {
		case 1: {
			// Queue sub-menu option 1: add a customer to queue
			System.out.println("\n"+"----------------[MENU > [1] MANAGE THE QUEUE > [1] ADD A CUSTOMER TO QUEUE]");
			addUser();
			break;
		}
		case 2: {
			// Queue sub-menu option 2: view the queue
			System.out.println("\n"+"----------------[MENU > [1] MANAGE THE QUEUE > [2] VIEW THE QUEUE]");
			System.out.println("Queue: "+queue);
			break;
		}
		case 3: {
			// Queue sub-menu option 3: return to main menu
			break;
		}
		} // end switch
		
	} // end addUSer method
	
	public void bookFirst() {
		// MainMenu option 2 
		// Fields needed to create a new <Customer> object:


		
		// Retrieve name from front of queue        
		bookName = queue.poll();
		
		// If queue is empty, aka bookName == null
		if (bookName == null) {
			System.out.println("The queue is currently empty. Please input the name of the customer you are booking.");
			bookName = input.nextLine();
		}
		
		// Get name, phone number, address, desired room type, check in date, check out date
		System.out.println("Booking " + bookName + ".");
		System.out.println("Please input the 10-digit phone number with no hyphens or parenthesis.");
		// Exception will be handled here using the 'hasNext' method that 'Scanner' supplies for prevalidation of phone number
		//if (input.hasNextLong() && input.hasNextLong().hasch) //@@@@@@@@@@@@@inspect this code, it might break. might need to declare input.nextLong in its variable first before calling it in if
	
		bookPhoneNumber = input.nextLong();
		input.nextLine(); // Throw away the '/n' not used by .nextLong
		System.out.println("Please input customer address.");
		bookAddress = input.nextLine();			
		System.out.println("What is the desired room type? Type 'LOW', 'MID', or 'HIGH'");
		bookRoomType = input.nextLine();
		System.out.println("What is the desired check-in date? Please input mmddyyyy with no hyphens or dashes.");
		String desiredInDate = input.nextLine();
		bookCheckInDate = getDayNumber(desiredInDate); // check this value )
		System.out.println("What is the desired check-out date? Please input mmddyyyy with no hyphens or dashes.");
		String desiredOutDate = input.nextLine();
		
		daysNeeded = (int) getDaysBetween(desiredInDate, desiredOutDate);
		
		// Call on the findAvail method to see if desired room type is available for selected date(s)
		findAvail(bookRoomType,desiredInDate,desiredOutDate);
		
		checkAvail = false; //@@@@@@@@@@@@@@ REMOVE THIS AFTER : : THIS IS DEBUG ONLY TO GET INTO THIS LOOP
		if (checkAvail == true) { // Available rooms were found for all selected dates
			System.out.println("\n"+"\n"+"Would you like to book? Type 'YES' or 'NO'.");
			userInput = input.nextLine();
			if (userInput.contentEquals("YES")) {
				// User wants to book the found dates and rooms
				// Output total, update total
				bookRoom(bookCheckInDate,daysNeeded);
				// then create a customer object for that confirmed booking with the given parameters
				Customer newCustomer = new Customer(bookName,bookPhoneNumber,bookAddress,currentCustomerAccNumber);
				
				
				// @@@ STOPPING POINT HERE !_!__!!_!_!_!_
				// Now I need to make a Binary Search Tree with object Customer
				// change main menu option 3 and 4 to update with new stuff
				// pray to god everything works
				//
				// Instead of splitting it into two options: new vs. returning customer, 
				// maybe just internally check the data and 
				// create a new profile if search returns false
				// and not worry
				
				BST.insertNode(BST.ROOT, newCustomer);
				
				System.out.println("Print the current BST:"); // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@DEBUG
				BST.printInOrder(BST.ROOT);
				System.out.println("");
		
			} // else, quit to main menu
		} else { // if checkAvail == false
			// prompt menu: We could not find available room types for all selected days. What would you like to do?
			// 1) Show me other available types of rooms for my selected days.
			// 2) Show me the earliest available date for my selected room type. 
			int menuInput;
			
			System.out.println("\n"+"\n"+"Unable to find available rooms for the selected room type and dates. How would you like to proceed?");
			System.out.println("    [1]: Find other available types of rooms for the given dates");
			System.out.println("    [2]: Find earliest available date for the given room type");		

			menuInput = input.nextInt();
			input.nextLine(); // Throw away the '/n' not used by .nextInt
			
			switch (menuInput) {
			case 1: {
				// Queue sub-menu option 1: Find other available types of rooms for the given dates
				System.out.println("\n"+"----------------[MENU > [2] BOOK 1ST CUSTOMER IN QUEUE > [1] FIND OTHER AVAILABLE TYPES OF ROOMS FOR THE GIVEN DATES]");
				// Using the predefined dates of stay, find other rooms that are available, regardless of room type.
				findAvailDates(bookCheckInDate, daysNeeded);
				break;
			}
			case 2: {
				// Queue sub-menu option 2: Find earliest available date for the given room type
				System.out.println("\n"+"----------------[MENU > [2] BOOK 1ST CUSTOMER IN QUEUE > [2] FIND EARLIEST AVAILABLE DATE FOR THE GIVEN ROOM TYPE]");
				break;
			}
			} // end switch
			
		} // end else
		
		
		// the function will suggest other room types, or offer to find the earliest date for a selected room type.
		// when selected, it will appropriate the data structures
	} // end bookFirst method
	
	// findAvailDates method is menu [2] > [1], "Find other available types of rooms for the given dates"
	// Receives check in date and length of stay (in days) and returns available rooms for those days, regardless of type. 
	// Looks in the availArray for checkString and traverses the string in its entirety
	public void findAvailDates(int bookCheckInDate, int daysNeeded) {
		String checkString;
		int[] availRooms = new int[273]; // VALUE 273 because our array layout: [1:separator]+[90:LOW]+[2:separator]+[90:MID]+[3:separator]+[90:HIGH]
		for (int i = 0; i < availRooms.length; i++)
			availRooms[i]=0;
		int availRoomsIndex = 0; // creates an index to input availRooms into the array
		int indexInDate = bookCheckInDate; // create a copy to use in the loop
		for (int i = 0; i < daysNeeded; i++) {
		// For x number of days
		// How to see which day each avail room corresponds to? Input ix100 into array and use those numbers as separators
		// so any number x where x = 0 or x >= 100 is a separator
			availRooms[availRoomsIndex] = (i * 100);
			availRoomsIndex++;
		// CheckString = the avail. string for the requested in date
			checkString = availArray[indexInDate]; // index number corresponds to the date from start
			
			for (int j = 0; j < 90; j++) {
				// Look through the values for low number rooms
				// if available, what do I want to do? Display the room numbers that are available? 
				// Room numbers start from #1, so index 0 = room #1 
								
				if (checkString.substring(j,(j+1)).contentEquals("0")) {					
					availRooms[availRoomsIndex] = (j+1); // j+1 because index n = room#(n+1)
					availRoomsIndex++;
				}
			}
							
			indexInDate++; // increment inDate for use if there is next 'i' loop				
		}//end 'i' for loop
		 
		// Print the availRooms array, separating by day separator, and set false if no avail rooms that day 
		int countRooms = 0;
		int countDay = 1;
		System.out.println("\n"+"\n"+"Showing available room numbers for all room types rooms for day 1 of stay:");
		for (int i = 1; i < availRooms.length; i++){ // start at i=1 because i=0 index is first separator	
			if (availRooms[i] > 90) {
				// is a separator
				if (countRooms == 0) {
					// No availability for that day
					System.out.println("");
					System.out.println("There are no rooms available for day "+countDay+" of stay period.");
					System.out.println("");
				} 
				countRooms = 0;
				countDay++;
				System.out.println("\n"+"\n"+"Showing available room numbers for all room types for day "+countDay+" of stay:");
			} else { // not a separator
				if (availRooms[i] != 0) {
					System.out.print(availRooms[i]);
					countRooms++;
					if (i > 0) 
						System.out.print(", ");
				}
			}
		}
		// Calculate room avail for day 3, because no separator after last day so aggregate again
		if (countRooms == 0) {
			System.out.println("");
			System.out.println("There are no rooms available for day "+countDay+" of stay period.");
		}
		
		// Ask if user wants to book 
		System.out.println("\n"+"\n"+"Would you like to book? Type 'YES' or 'NO'.");
		String userInput = input.nextLine();
		if (userInput.contentEquals("YES")) {
			// User wants to book the found dates and rooms
			// Output total, update total
			System.out.println("DEBUG: bookCheckInDate = "+bookCheckInDate); // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@DEBUG
			bookRoom(bookCheckInDate,daysNeeded);
			// then create a customer object for that confirmed booking with the given parameters
			Customer newCustomer = new Customer(bookName,bookPhoneNumber,bookAddress,currentCustomerAccNumber);
			
			// Insert into the BST
			BST.insertNode(BST.ROOT, newCustomer);
			
			System.out.println("Print the current BST:"); // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@DEBUG
			BST.printInOrder(BST.ROOT);
			System.out.println("");
	
		} // else, quit to main menu
		
	} // end findAvailDates method
	
	
	
	public void bookRoom(int inDate,int daysNeeded) {
		// book method that prompts user for input and updates the value of the string to '1' in the availArray 
		//		receives: day # of stay (day 1, day 2, day 3), and room number to book
		//					if room number to book is already '1', it prompts an error and revisits the method
		//		updates: the total price, availArray
		//		outputs: total price, confirmation message
		int roomNumber;
		int stringIndex;
		int selectedDate = inDate;
		totalBookPrice = 0;
		String checkString = "";
		
		for (int i = 1; i <= daysNeeded; i++) { // **pretty sure this is less than or equal to..
			System.out.println("\n"+"Please enter the room number to book for day "+i+".");
			roomNumber = input.nextInt(); 
			input.nextLine();
			// check if the room number is available in the array 
			stringIndex = roomNumber - 1; 
			checkString = availArray[selectedDate];
			
			
			while (checkString.substring(stringIndex,(stringIndex+1)).contentEquals("1")) {
				// while room number is taken
				System.out.println("Room number "+roomNumber+" is unavailable. Please enter a different room number.");
				roomNumber = input.nextInt();
				input.nextLine();
				stringIndex = roomNumber - 1;
			}
			
			// room number is not taken
			// we made a copy of the availability String for that date index in availArray, named checkString
			// turn checkString into a char[], replace letter by index, then convert array back into a String
			// and store that updated checkString into the availArray
			char[] checkStringChars = checkString.toCharArray();
			checkStringChars[stringIndex] = '1';
			checkString = String.copyValueOf(checkStringChars);
			availArray[selectedDate] = checkString; 
			totalBookPrice = totalBookPrice + getPrice(roomNumber); // get the price of the room number and add to total price, variable located outside
			
			// add a lineitem to the linkedlist named itemList 
			System.out.println("Adding line item with startDate = "+startDate+", inDate = "+inDate); // @@@@@@@@@@@@@@@@@@@@@@@@@@@DEBUG
			itemList.add(new LineItem(roomNumber,startDate,++inDate,currentInvoiceNumber,currentCustomerAccNumber,getPrice(roomNumber))); // ++inDate to use preincrement value, then increment
			
			System.out.println(("Printing itemList:")); //@@@@@@@@@@@@@@@@@@@@@@DEBUG
			for (LineItem element : itemList)
				System.out.println(element + "\n");
			//System.out.println("Totalbookprice = "+totalBookPrice+", getPrice = "+getPrice(roomNumber)); // @@@@@@@@@@@@@@@@@@@DEBUG
			//System.out.println("Updated string for day "+i+", checkString = "+checkString+", availArray[inDate] ="+availArray[inDate]); //@@@@@@@@@@@@@@@@@@@@@@@@@DEBUG
			//System.out.println("selectedDate = "+selectedDate); //@@@@@@@@@@@@@@@@@@@@@@DEBUG
			
			selectedDate++; 
		} // end for 
		System.out.println("The total price for your booking is: "+totalBookPrice+".");
		currentInvoiceNumber++; // increment currentInvoiceNumber
		currentCustomerAccNumber++; // @@@ Hmm... This gets incremented... might need to make two options: New Guest (generate new account number) vs. Returning Guest (do not gen. new) 
		// ^
		
	} // end bookRoom method
	
	public int getPrice(int roomNumber) {
		int total = 0;
		if (roomNumber > 60) { // "HIGH" = 200$
			total = 200;
			return total;
		} else if (roomNumber > 30) { // "MID" = 150$
			total = 150;
			return total;
		} else { // LOW = 100$
			total = 100;
			return total;
		}
	}
	
	public void clearAvailArray () {
		for (int i = 0; i < availArray.length; i++)
			// Index 0-29: Low Tier Rooms 
			// Index 30-59: Mid Tier Rooms 
			// Index 60-89: High Tier ROoms
			availArray[i]="000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"; // 90 rooms
	}

	public int getDayNumber(String date) {
		// Takes a date and outputs the number of days from Jan 1, 2019 start of hotel
		int day, month, year;
		year = Integer.parseInt(date.substring(4,8));
		month = Integer.parseInt(date.substring(0,2)) - 1; // -1 because Date object counts months from 0  	
		day = Integer.parseInt(date.substring(2,4)); //  - 1; // -1 because Date object counts days from 0  	
		
		Calendar endDate = new GregorianCalendar();
		
		endDate.set(year, month, day);
		
		Date eD = endDate.getTime();
		System.out.println("endDate = " +eD.toString()); // @@@@@@@@@@@@@@DEBUG CODE
		return (int) ((eD.getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24));
	}
	
	public int getDaysBetween(String in, String out) {
		int inDate, outDate, totalDays;
		
		inDate = getDayNumber(in);
		outDate = getDayNumber(out);
		totalDays = outDate - inDate;
		
		return totalDays;
	}
	
	public void findAvail(String roomType, String dayIn, String dayOut) {
		// Given room type, check in and check out dates
		// output boolean result of whether or not it is available
		// Does not book or change any values
		String checkString;
		int daysNeeded = (int) getDaysBetween(dayIn, dayOut);
		int inDate = (int) getDayNumber(dayIn);
		boolean avail = true; // true, set false  instead of false, set true -- easier
		int[] availRooms = new int[93]; // VALUE 93 because our array layout: [1:separator]+[30:LOW]+[2:separator]+[30:MID]+[3:separator]+[30:HIGH]
		for (int i = 0; i < availRooms.length; i++)
			availRooms[i]=0;
		int availRoomsIndex = 0; // creates an index to input availRooms into the array
		
		for (int i = 0; i < daysNeeded; i++) {
		// For x number of days
		// How to see which day each avail room corresponds to? Input ix100 into array and use those numbers as separators
		// so any number x where x = 0 or x >= 100 is a separator
			availRooms[availRoomsIndex] = (i * 100);
			availRoomsIndex++;
		// CheckString = the avail. string for the requested in date
			checkString = availArray[inDate]; // index number corresponds to the date from start
			
			
			if (roomType.contentEquals("LOW")) {
				for (int j = 0; j < 30; j++) {
					// Look through the values for low number rooms
					// if available, what do I want to do? Display the room numbers that are available? 
					// Room numbers start from #1, so index 0 = room #1 
									
					if (checkString.substring(j,(j+1)).contentEquals("0")) {					
						availRooms[availRoomsIndex] = (j+1); // j+1 because index n = room#(n+1)
						availRoomsIndex++;
					}
				}
			} else if (roomType.contentEquals("MID")) {
				for (int j = 30; j < 60; j++) {
					// Look through the values for low number rooms
					// if available, what do I want to do? Display the room numbers that are available? 
					// Room numbers start from #1, so index 0 = room #1 
					if (checkString.substring(j,(j+1)).contentEquals("0")) {
						availRooms[availRoomsIndex] = (j+1); // j+1 because index n = room#(n+1)
						availRoomsIndex++;
					}
				}
			} else { // rT = High
				for (int j = 60; j < 90; j++) {
					// Look through the values for low number rooms
					// if available, what do I want to do? Display the room numbers that are available? 
					// Room numbers start from #1, so index 0 = room #1 
					if (checkString.substring(j,(j+1)).contentEquals("0")) {
						availRooms[availRoomsIndex] = (j+1); // j+1 because index n = room#(n+1)
						availRoomsIndex++;
					}
				}
			}				
			inDate++; // increment inDate for use if there is next 'i' loop				
		}//end 'i' for loop
		
		/* @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ DEBUG: Print availRooms array
		System.out.println("AvailRooms Array");
		for (int i = 0; i < availRooms.length; i++) {
			if (i > 0)
				System.out.print(", ");
			System.out.print(availRooms[i]);
		}
		@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ END DEBUG */ 
		
		// Print the availRooms array, separating by day separator, and set false if no avail rooms that day 
		int countRooms = 0;
		int countDay = 1;
		System.out.println("");
		System.out.println("Showing available room numbers for "+roomType+" rooms for day 1 of stay:");
		for (int i = 1; i < availRooms.length; i++){ // start at i=1 because i=0 index is first separator	
			if (availRooms[i] > 90) {
				// is a separator
				if (countRooms == 0) {
					// No availability for that day
					System.out.println("\n"+"There are no "+roomType+" rooms available for day "+countDay+" of stay period."+"\n");
					avail = false;
				} 
				countRooms = 0;
				countDay++;
				System.out.println("\n"+"Showing available room numbers for "+roomType+" rooms for day "+countDay+" of stay:");

			} else { // not a separator
				if (availRooms[i] != 0) {
					System.out.print(availRooms[i]);
					countRooms++;
					if (i > 0) 
						System.out.print(", ");
				}

			}
			
		}
		// Calculate room avail for day 3, because no separator after last day so aggregate again
		if (countRooms == 0) {
			System.out.println("\n"+"There are no "+roomType+" rooms available for day "+countDay+" of stay period.");
			avail = false;
		}
		checkAvail = avail; // pass the boolean value
	} // end findAvail method
	

	
	public void addUser() {
		// Queue sub-menu option 1
		// adds a user to the queue
		String name = "";
		String addAgain ="";
		
		System.out.println("\n"+"Please enter the name you wish to add to the queue.");
		name = input.nextLine();
		queue.add(name);
		System.out.println(name+" has been successfully added to the queue."); 
		System.out.println("\n"+"Would you like to add another name? Type 'YES' or 'NO'.");
		addAgain = input.nextLine();
		if (addAgain.contentEquals("YES")) {
			addUser();
		}
	}
	

	
}
