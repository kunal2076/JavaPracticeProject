package com.java.algo.interviewquestions;

import java.util.*;

/*
Sonder wants to help guests plan their stay
by finding check-in and check-out dates that accommodate a desired length of stay.

Sonder determines availability based on existing bookings,
in this case, we’re serializing them as colon-separated pairs of integers.
The first integer is a check-in date, and the second is a check-out date.
Each integer represents an offset since Jan 1, 2019. 
E.g. '0:1' represents a booking where the check-in date is Jan 1st 2019,
and the check-out date is Jan 2nd 2019.

Directions
Implement a method, booking_start_date(string bookings, int stay_length, int current_date)
that will return the first day that can accommodate a booking of length stay_length.

Examples:
Input: bookings: '3:5 0:2 7:14', stay_length: 1, current_date: 4
Output: 5
Input: bookings: '7:14 0:3 3:6', stay_length: 2, current_date: 4
Output: 14
Input: bookings: '0:2 5:6 7:14', stay_length: 1, current_date: 3
Output: 3

Rules:
Input is well-formed
Bookings will not overlap
Bookings are not sorted in any order
Only dates later than or equal to current date should be returned

*/

public class RoomBookingsStartDate {

	public static void main(String[] args) {
		
		int date = new RoomBookingsStartDate().booking_start_date("3:5 0:2 7:14", 1, 4);
		//int date = new RoomBookingsStartDate().booking_start_date("7:14 0:3 3:6", 2, 4);
		//int date = new RoomBookingsStartDate().booking_start_date("0:2 5:6 7:14", 1, 3);
		System.out.println(date);
	}
	
	int booking_start_date(String bookings, int stay_length, int current_date) {
		
		String[] bookingsArr = bookings.split(" ");
		List<Integer> bookingsList = new ArrayList<>();
		for(int i=0; i<bookingsArr.length; i++) {
			bookingsList.add(Integer.parseInt(bookingsArr[i].split(":")[0]));
			bookingsList.add(Integer.parseInt(bookingsArr[i].split(":")[1]));
		}
		Collections.sort(bookingsList);
		System.out.println(bookingsList.toString());
		
		for(int i=0; i<bookingsList.size()-2; i=i+2) {
			int prevCheckoutDate = bookingsList.get(i+1);
			int nextCheckinDate = bookingsList.get(i+2);
			
			System.out.println("prevCheckoutDate " + i + " " + prevCheckoutDate);
			System.out.println("nextCheckinDate " + i + " " + nextCheckinDate);
			
			if((prevCheckoutDate <= current_date && nextCheckinDate >= current_date) 
					&& (nextCheckinDate-prevCheckoutDate >= stay_length)) {
				while(current_date<=nextCheckinDate) {
					nextCheckinDate--;
				}
				return nextCheckinDate;
			}
		}
		
		return bookingsList.get(bookingsList.size()-1);
	}
	
	
	

}
