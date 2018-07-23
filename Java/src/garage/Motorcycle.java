package garage;

	public class Motorcycle extends Vehicle implements Features{

		private String motorcycleManufacturer;
		private int cylinderCapacity;
		
	public Motorcycle(String motorcycleManufacturer, int cylinderCapacity, 
			String type, String model, String bodyType, String typeOfFuel, String numberPlate,
				int noOfWheels, int makeYear, int mileage,boolean insured, boolean manual ) {
	
	super(type, model, bodyType, numberPlate, typeOfFuel, noOfWheels, makeYear, mileage, insured, manual);
	
	this.motorcycleManufacturer = motorcycleManufacturer;
	this.cylinderCapacity = cylinderCapacity;

	
}


	public void changeDirection() {
		System.out.println("Turn right");
	}
		

	public void accelerate() {
		System.out.println("Increase speed");
	}


	public void applyBreaks() {

		System.out.println("Slow down");
	}

	public void changeGear() {

		System.out.println("Shift to first gear");
	}

	public void fuelUp() {
		System.out.println("Motorcycle is low on fuel");
	} 

	
	
	@Override
	public void calcPrice() {
		
		double vat = 9.5;
		String priceRangeOne = "£1000 to £5000";
		String priceRangeTwo = "£6000 to £10000";
		
		if(mileage < 600 && makeYear > 2016) {
				
			System.out.println("The price of your vehicle is between"+ "   " + priceRangeTwo + "   " + 
								"plus and additional charge of vat at a rate of" + " " + vat + "%");
		
		}
		else if(mileage > 600 && makeYear < 2008) {
			
			System.out.println("The price of your vehicle is between"+ "   " + priceRangeOne + "   " + 
					"plus and additional charge of vat at a rate of" + " " + vat + "%");
		}
}
	}