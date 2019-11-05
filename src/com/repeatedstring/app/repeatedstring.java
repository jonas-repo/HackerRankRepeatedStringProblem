package com.repeatedstring.app;

public class repeatedstring {

	public static void main(String[] args) {
		
		// https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
		
		//variable declaration
		
		long count1=0;
		long lettersQuantity=0;
		long notCompletedChars= 0;
		long aQuantity = 0;
		
		
		//inputs like hacker rank problem does
		String s = "aba";
		long n = 10;
		
		//array initialization
		char[] array = s.toCharArray();
		
		//count a repeated in single string
		for(char i : array)
		{
			if(i == 'a')
			{
				count1++;
			}
		}
		
		//math process to get the prediction of the strings
		//I do it in this way because do it by cycle is very very slow and hacker rank does not accept slow programs
		lettersQuantity = n / array.length;
		notCompletedChars = (n % array.length);
		aQuantity = count1 * lettersQuantity;
		
		//check if in not completed strings are 'a' missing
		if(notCompletedChars >= 0)
		{
			for(int i = 0; i < notCompletedChars; i++)
			{
				if(array[i] == 'a')
				{
					aQuantity++;
				}
			}
		}
		
		
		System.out.println("Number of repeated strings: "+lettersQuantity);
		System.out.println("Number of not completed strings: "+notCompletedChars);
		System.out.println("Number of 'a' letters: "+aQuantity);
		
	}

}
