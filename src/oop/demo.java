package oop;


class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}


public class demo {

	public static void main(String[] args) {
		// Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Joe";
		person1.email = "joe@testeamil.com";
		person1.phone = "2343242334";
		
		// Abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.sleep();
		
		
		/*
		// Person-
		
		//Attributes, variables, adjectives, descriptors
		String name = "joe";
		String email = "joe@testemail.com";
		String phone = "32423432342";
		
		//Action, activity, behaviour
		//System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
		//what if we wanted to do this for another person?
		String name2 = "sarah";
		String email2 = "sarah@testemail.com";
		String phone2 = "234343243";
		
		//Action, activity, behaviour
		//System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2 + " is eating");
		
		// what about binding attributes and properties together?

	}
	
	// Enhance by adding functions to minimise code
	static void walking(String name) {
		System.out.println(name + " is walking");
	*/
	}

}
