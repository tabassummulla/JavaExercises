package garage;

import java.util.*;

public class Garage {

	public static void main(String args[]) {
		
		
	
		Car car = new Car("Lexus",153, 5, 4, true, true,"car", "is200", "saloon", "Petrol", "YX54KVH", 4, 2004, 100000, true, true );
		Motorcycle motorcycle = new Motorcycle("Honda", 600, "motorcycle","cbrr600", "sport-bike","Petrol", "XZ57TB", 2, 2007, 47, true, true  );
		Aircraft aircraft= new Aircraft(1005, "Boeing", 7000, true, "aircraft","747","wide-body", "Petrol", "NULL",8, 2002, 37200, true, false);
		
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		vehicles.add(car);
		vehicles.add(motorcycle);
		vehicles.add(aircraft);
		
		 
		for(int i=0; i< vehicles.size(); i++) {
			 if(vehicles.equals(vehicles.get(i).type.equals("car"))) {
				car.calcPrice();
				 
			 }
			 else if(vehicles.equals(vehicles.get(i).type.equals("motorcycle"))) {
				 motorcycle.calcPrice();
			 }
			 else if(vehicles.equals(vehicles.get(i).type.equals("aircraft"))) {
				 aircraft.calcPrice();
			 }
				
				
			}
		
		
 }

}		
		
		
		
	


