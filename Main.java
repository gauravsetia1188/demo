import java.util.*;
import java.lang.*;
import java.io.*;
public class Main{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int sum=sc.nextInt();
		int n=sc.nextInt();
		ArrayList<Integer> list=new ArrayList <Integer>();
		for(int i=0;i<n;i++)
		{
			int x;
			x=sc.nextInt();
			list.add(x);
		}
		int len=list.size();
		int i=0;int j=len-1;
		int x,y;
		Collections.sort(list);
		while(i<j)
		{
			x=list.get(i);
			y=list.get(j);
			if((x+y)==sum)
			{
				System.out.println("Mil Gaya Sum");
				break;
			}
			else if((x+y)>sum)
			j--;
			else 
			i++;

		}
		System.out.println("Phat ke cauliflower ho gai");
	}
			
}
	
