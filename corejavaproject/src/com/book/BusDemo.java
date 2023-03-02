package com.book;

//import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class BusDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,20));
		buses.add(new Bus(3,true,40));
		int userOpt =1;
		Scanner scanner= new Scanner(System.in);
		for(Bus b:buses) {
			b.displaybusinfo();
		}
		while(userOpt==1) {
			System.out.println("enter 1 to book and 2 to exit");
			userOpt=scanner.nextInt();
			if(userOpt==1) {
		//	System.out.println("Booking...");
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("your booking is confirmed");
				}
				
				else
					System.out.println("sorry. Bus is full. Try another bus or date.");
	
			}
		}

	}

}