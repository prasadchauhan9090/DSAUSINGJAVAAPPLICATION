package com.dsa.in;

public class AdjcentStringCalculationUsingJava {
	
	public static void main(String args[])
	{
		// Given input string
		String s = "hello";
		
		// Variable to store temporary difference between characters
		int temp = 0;
		
		// Variable to store the total sum of adjacent ASCII differences
		int add = 0;
		
		// Unused variable (always prints 0)
		int c = 0;
		
		// Loop through the string characters except the last one
		for(int i = 0; i < s.length() - 1; i++)
		{
			// Get the current character
			char d = s.charAt(i);
			
			// Get the next adjacent character
			char dd = s.charAt(i + 1);
			
			// Convert characters to their ASCII integer values
			int a = d;
			int b = dd;
			
			// Calculate the absolute difference between ASCII values
			temp = Math.abs(a - b);
			
			// Add the difference to the total sum
			add = add + temp;
			
			// Print each step difference
			System.out.println(temp);
		}
		
		// Print value of unused variable
		System.out.println(c);
		
		// Print the final result
		System.out.println("RESULT OF THE GIVEN STRING AFTER CONVERTOR INTO THE CHARACTER TO INTEGER AND ADDED AJCENT OF THE STRING IS :" + add);
	}

}
