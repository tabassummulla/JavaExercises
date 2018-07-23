package garage;

public class Car extends Vehicle implements Features {

	private String carManufacturer;
	private int horsePower;
	private int noOfSeats;
	private int noOfDoors;
	private boolean hasAirbags;
	private boolean hasSeatBelts;
	
	
	public Car(String carManufacturer,int horsePower, int noOfSeats, int noOfDoors, boolean hasAirbags, boolean hasSeatBelts,
			String type, String model, String bodyType, String typeOfFuel, String numberPlate,
			int noOfWheels, int makeYear, int mileage,boolean insured, boolean manual) {
		
		super(type,model, bodyType, numberPlate, typeOfFuel, noOfWheels, makeYear, mileage, insured, manual);
	
		this.carManufacturer = carManufacturer;
		this.horsePower = horsePower;
		this.noOfSeats = noOfSeats;
		this.noOfDoors = noOfDoors;
		this.hasAirbags = hasAirbags;
		this.hasSeatBelts = hasSeatBelts;
		
		
	}

	public void changeDirection() {
		System.out.println("Turn left");
		
	}



	public void accelerate() {
		System.out.println("Increase speed");
	}



	public void applyBreaks() {
		System.out.println("Stop for the traffic lights");
		
	}



	public void changeGear() {
		System.out.println("Shift to second gear");
		
	}



	public void fuelUp() {
		System.out.println("Car is low on fuel");
		
	}
	
	@Override
	public void calcPrice() {
		
		double vat = 12.5;
		String priceRangeOne = "£10000 to £25000";
		String priceRangeTwo = "£1000 to £9000";
		
		if(mileage < 10000 && makeYear > 2015) {
				
			System.out.println("The price of your vehicle is between"+ "   " + priceRangeOne + "   " + 
								"plus and additional charge of vat at a rate of" + " " + vat + "%");
		
		}
		else if(mileage > 50000 && makeYear < 2007) {
			
			System.out.println("The price of your vehicle is between"+ "   " + priceRangeTwo + "   " + 
					"plus and additional charge of vat at a rate of" + " " + vat + "%");
		}
		
		
		
	}
	
	
	
}
