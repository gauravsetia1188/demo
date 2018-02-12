import java.util.*;
import java.lang.*;
import java.io.*;

public class Box{
	
	public static void main(String[] args)
	{
		boolean isAnagram=false;
		Scanner sc=new Scanner(System.in);
		String s1,s2;
		s1=sc.nextLine();
		s2=sc.nextLine();
		char[] first=s1.toCharArray();
		char[] second=s2.toCharArray();
		Arrays.sort(first);Arrays.sort(second);
		isAnagram=Arrays.equals(first,second);
		if(isAnagram)
		{
			System.out.println("Anagram haige hai ji");
		}
		else
		{
			System.out.println("wajgi");
		}
	}
}