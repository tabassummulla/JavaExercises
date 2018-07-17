package people;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		
		Person bob = new Person("Bob", 21, "Doctor");
		
		Person sam = new Person("Sam", 19, "Student");
		
		Person alice = new Person( "Alice", 25, "Engineer");
		
		// Overriding the to String method
		System.out.println(bob);
		
		
		ArrayList<Person> array = new ArrayList<Person>();
		 array.add(bob);
		 array.add(sam);
		 array.add(alice);
	
		// for loop to print out all people to screen 
		for(int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name = input.nextLine();
		

	for(int i =0; i < array.size();i++) {
		if (name.equals(array.get(i).name)){
			System.out.println(array.get(i).toString());
		}
	}
	}
}

	
	
	
	
	
		
	
		
		
	
	
