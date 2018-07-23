package garage;

public class Vehicle {

	protected String type ;
	protected String model ;
	protected String bodyType;
	protected String typeOfFuel;
	protected String numberPlate;
	protected int noOfWheels;
	protected int makeYear;
	protected int mileage;
	protected boolean insured;
	protected boolean manual;
	
	

	public Vehicle(String type, String model, String bodyType, String typeOfFuel, String numberPlate,
			int noOfWheels, int makeYear, int mileage, boolean insured, boolean manual) {
		
		this.type = type;
		this.model = model;
		this.bodyType = bodyType;
		this.typeOfFuel = typeOfFuel;
		this.numberPlate = numberPlate;
		this.noOfWheels = noOfWheels;
		this.makeYear = makeYear;
		this.mileage = mileage;
		this.insured = insured;
		this.manual = manual;
	}


	public boolean checkInsured() {

		if(insured == true ) {
			System.out.println("Vehicle is insured");
		}
		else {
		System.out.println("Vehicle is not insured");	
		}
		return insured;
		
	}


	public void calcPrice() {
		
		
	}
	
}
