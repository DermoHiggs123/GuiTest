// Dermot Hegarty 02/09/09
// Person: Revision 1.0
// This is a very basic class to represent a person
// We could (and will) add lots more
public class Person
{
	//instance fields (should always be private)
	private String firstName;
	private String lastName;
	private int age;
	
	//constructor (Note: no default constructor)
	public Person(String f, String l, int a)
	{
		firstName = f;
		lastName = l;
		age = a;
	}
	
	//accessor methods
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String toString()
	{
      //return "abc";
		return firstName + " " + lastName + " " + age;
	}
}