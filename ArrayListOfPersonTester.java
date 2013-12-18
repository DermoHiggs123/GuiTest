//NB have to import the class
import java.util.ArrayList; //could also use java.util.*;
public class ArrayListOfPersonTester
{
	public static void main(String args[])
	{
		ArrayList<Person> peopleDetails = new ArrayList<Person>();
		
		peopleDetails.add(new Person("Jim", "Jones", 21));

		System.out.println(peopleDetails.get(0));
		
	}
}