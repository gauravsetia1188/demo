class Surinder{
	
	private int a;
	public int b;

	void initialise(int a,int b)
	{
		this.a=a;
		this.b=b;
	}

	void printing(){
		System.out.println(a+"\n"+b);
	}


}




class test{
	public static void main(String[] args)
{
	Surinder suri=new Surinder();
	Surinder punnu;
	suri.initialise(3,4);
	suri.printing();
	punnu=suri;
	punnu.printing();
}
}