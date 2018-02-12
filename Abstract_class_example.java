abstract class Person{
	
	void display()
	{
		System.out.println("Hanji mein keha kiddan");
	}

	abstract void chaska(int n);

}


class Student extends Person{
	

	void chaska(int n){
		for(int i=0;i<n;i++)
	{
		System.out.println(i);
	}
}

	}


public class Abstract_class_example{
	public static void main(String[] args)
	{
		Student s=new Student();
		s.display();
		s.chaska(5);
	}
}