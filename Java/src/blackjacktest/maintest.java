package blackjacktest;

import static org.junit.Assert.*;

import org.junit.Test;

import blackjack.main;

public class maintest {

@Test
// To test whether class does not exist 
public void testblackjack() {
	
	main testing = new main();
	assertNull("Error no class created", testing);
			
	
}
@Test
//To test whether method exists  
public void testexisitingmethod() {
	
	main testing = new main();
	assertNotNull(testing.blackjack(12, 10));
			
	
}
@Test

// To test expected result 
public void testmethod() {
	
	main testing = new main();
	assertEquals("error",12,testing.blackjack(12, 10));
			
	
}
}
