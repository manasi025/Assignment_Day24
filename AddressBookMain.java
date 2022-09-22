package com.manasi;

public class AddressBookMain 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.out.println("Welcome to AdderssBook Program.");
		
		 AddressBookIF person1 = new Person();
	        person1.createContact();
	        person1.display();
	        person1.addContact();
	        person1.editContact();
	        person1.deleteContact();
	        person1.addToBook();
	        person1.operation();
	        person1.searchPerson();
	        person1.displayBook();
	        person1.addContactByCity();
	        person1.viewByCity();
	        person1.addContactByState();
	        person1.viewByState();
	        person1.sortAddressBook();
	        person1.sortByCity();
	        person1.sortByState();
	}

}


/*

OUTPUT :


Welcome to AdderssBook Program.
Enter how many contacts you want to create
3
Enter Name of the person
abc
Enter First Name :
ash
Enter Last Name :
pitt
Enter Address :
us
Enter City :
nyc
Enter State :
ny
Enter Zip :
17635
Enter Phone Number :
9483577846
Enter Email :
abc@gmmail.com
Enter Name of the person
zyx
Enter First Name :
zack
Enter Last Name :
effron
Enter Address :
cal
Enter City :
nevada
Enter State :
cal
Enter Zip :
764
Enter Phone Number :
821649857
Enter Email :
zyx@gmail.com
Enter Name of the person
manasi
Enter First Name :
manasi
Enter Last Name :
barge
Enter Address :
nashik
Enter City :
nashik
Enter State :
maharashtra
Enter Zip :
422101
Enter Phone Number :
8364864897
Enter Email :
manasi@gmail.com
Created contact list is
abc--> Contact [firstName=abc, lastName=pitt, address=us, state=ny, email=abc@gmmail.com, city=nyc, zip=0, phoneNumber=9483577846]
manasi--> Contact [firstName=manasi, lastName=barge, address=nashik, state=maharashtra, email=manasi@gmail.com, city=nashik, zip=0, phoneNumber=8364864897]
zyx--> Contact [firstName=zyx, lastName=effron, address=cal, state=cal, email=zyx@gmail.com, city=nevada, zip=0, phoneNumber=821649857]
Enter how many contacts you want to add


*/