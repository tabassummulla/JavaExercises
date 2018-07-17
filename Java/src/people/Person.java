package people;

public class Person {

	String name ;
	int age;
	String jobTitle;

	
	public Person(String name, int age, String jobTitle) {
		
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;

	}
	
	public String toString() {
		return "Name:" + this.name + "   " + "Age :" +
	 this.age + "  " + "Job Title:"+ this.jobTitle;
	}
	
	
}
