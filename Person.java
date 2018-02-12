class Employee
{
	private int id=34;
	private String name="Chaska";

	//Lets add a random comment

	public int getId()
	{
		return (id);
	}
	public String getName()
	{
		return (name);
	}

}


class Student extends Employee{
	
	private String college_name;

	public void set_name(String s)
	{
		college_name=s;
	}
	public String get_name()
	{
		return college_name;
	}
}	

public class Person
{
	public static void main(String[] args)
{
	Student s1=new Student();
	s1.set_name("NIT JALANDHAR");
	System.out.println(s1.getId());
	System.out.println(s1.getName());
	System.out.println(s1.get_name());

}	
}