package com.yellowpages;

import java.util.*;

import com.yellowpages.lists.*;


public class MainApplication  {
	public static void main(String[] args) throws MyException {
//		ListOfAddresses obj1 = new ListOfAddresses();
		ListOfPhones obj2 = new ListOfPhones();

		Runnable t1 = new ListOfAddresses();
		Thread t2 = new ListOfPhones();
		
//			t1.run();
//			
//			t2.start();		
		
		obj2.printMap();
		
		
	}
}
