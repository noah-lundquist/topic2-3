package app;

public class Person {
	
	private String firstName = "Mark";
	private String lastName = "Reha";
	
	public Person(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Person(Person person)
	{
		this.firstName = person.getFirstName();
		this.lastName = person.getLastName();
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	
}
