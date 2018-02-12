//tu meri bahon mein duniya bhulade

class A implements Runnable{
	
	public void run(){
		for(int i=0;i<5;i++)
		{
			System.out.println("Class A"+i);
		}
	}

}

class B implements Runnable{
	
	public void run(){
		for(int i=0;i<5;i++)
		{
			System.out.println("Class B"+i);
		}
	}

}

class C extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Class C"+i);
			
		}
	}
}





public class Bholi{
	
	public static void main(String[] args)
	{
		Thread T1=new Thread(new A()); // Using Runnable Interface
		Thread T2=new Thread(new B()); // Using Runnable Interface
		C T3=new C(); // Using Thread class (Inheriting)
	//	System.out.println(T1.getPriority());
		T1.setPriority(9);
		T2.setPriority(7);
		T1.start();
		T2.start();
		T3.start();
		//System.out.println(T1.getPriority());System.out.println(T2.getPriority());
		//System.out.println(T3.getPriority());
	}
}