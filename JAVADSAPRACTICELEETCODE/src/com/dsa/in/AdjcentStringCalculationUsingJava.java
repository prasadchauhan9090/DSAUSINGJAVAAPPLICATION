package com.dsa.in;

public class AdjcentStringCalculationUsingJava {
	
	public static void main(String args[])
	{
		
		String s = "hello";
		int temp=0;
		int add=0;
		int c=0;
		
		for(int i=0;i<s.length()-1;i++)
		{
			char d=s.charAt(i);
			char dd=s.charAt(i+1);
			
			int a=d;
			int b=dd;
			
			//printing ascii values
			
			temp=Math.abs(a-b);
			add=add+temp;
			System.out.println(temp);
		}
		
		System.out.println(c);
		System.out.println("RESULT OF THE GIVEN STRING AFTER CONVERTOR INTO THE CHARACTER TO INTEGER AND ADDED AJCENT OF THE STRING IS :"+add);
	}

}
