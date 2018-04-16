package com.yellowpages.lists;

import java.util.*;

import com.yellowpages.PhoneBook;

public class ListOfPhones extends Thread{
//	private Thread t;
	PhoneBook ph = new PhoneBook("1", "361-313-9629");
	PhoneBook ph1 = new PhoneBook("2", "305-830-3441");
	PhoneBook ph2 = new PhoneBook("3", "619-833-3876");
	public void run(){		
		List<PhoneBook> list = Arrays.asList(ph, ph1, ph2);
		try {
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).toString());
				Thread.sleep(500);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void printMap(){
		Map<String, PhoneBook> hashMap = new HashMap<String, PhoneBook>();
		hashMap.put(ph.getId(), ph);
		hashMap.put(ph1.getId(), ph1);
		hashMap.put(ph2.getId(), ph2);
		Set<Map.Entry<String, PhoneBook>> entries = hashMap.entrySet();
		for(Map.Entry<String, PhoneBook> phone : entries) {
			System.out.println(phone.getKey());
			PhoneBook phoneNumber = phone.getValue();
			phoneNumber.toString();
		}
		
	}
}
