package people;

import java.util.ArrayList;

public class main {
	
	public static void main(String[] args) {
		
		
		Person bob = new Person("Bob", 21, "Doctor");
		
		Person sam = new Person("Sam", 19, "Student");
		
		Person alice = new Person( "Alice", 25, "Engineer");
		

		System.out.println(bob.toString());
		
		
		ArrayList<Person> array = new ArrayList<Person>();
		 array.add(bob);
		 array.add(sam);
		 array.add(alice);
	
		
		for(int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		
		
		
		
		
	}
	
	
	
	
}
