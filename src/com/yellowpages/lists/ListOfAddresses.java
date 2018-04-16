package com.yellowpages.lists;

import java.util.*;

import com.yellowpages.Address;

public class ListOfAddresses implements Runnable{
//	private Thread t;
	public void run() {
		Address adr = new Address("1629 Spring Avenue", "Norristown", "Pennsylvania");
		Address adr1 = new Address("1155 Alexander Avenue", "San Francisco", "California");
		Address adr2 = new Address("2635 Washington Street", "Corpus Christi", "Texas");
		List<Address> list = Arrays.asList(adr, adr1, adr2);
		
		try {
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).toString());
				Thread.sleep(500);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
