package garage;

public class Aircraft extends Vehicle {
		
		
		private int airframeHours;
		private String make;
		private int maxPayload;
		private boolean entertainmentSystem;
		
	public Aircraft(int airframeHours,String make, int maxPayload, boolean entertainmentSystem, 
			String type, String model, String bodyType, String typeOfFuel, String numberPlate,
			int noOfWheels, int makeYear, int mileage,boolean insured, boolean manual) {	
		
		super(type, model, bodyType, numberPlate, typeOfFuel, noOfWheels, makeYear, mileage, insured, manual);
		
		this.airframeHours = airframeHours;
		this.make = make;
		this.maxPayload = maxPayload;
		this.entertainmentSystem = entertainmentSystem;
			
	}
		
	public void takeOff() {
		System.out.print("The aircraft is ready for takeoff");
	}
	
	
	public void land() {
		System.out.print("The aircraft is ready for landing");
	}
	
	@Override
	public void calcPrice( ) {
		
		double vat = 19.5;
		String priceRangeOne = "£100000 +";
		String priceRangeTwo = "£40000 to £60000";
	
		if(entertainmentSystem == true && maxPayload > 100000 && makeYear > 2016 ) {
			
			System.out.println("The price of your vehicle is between"+ "   " + priceRangeOne + "  " + 
					"plus and additional charge of vat at a rate of" + " " + vat + "%");
		}
		else {
			System.out.println("The price of your vehicle is between"+ "   " + priceRangeTwo + "  " + 
					"plus and additional charge of vat at a rate of" + " " + vat + "%");
		}
	} 
	
	}


