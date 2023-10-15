package com.assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		System.out.println("Enter Roman Number ");
		Scanner sc = new Scanner(System.in);
		String romanNumeral = sc.next();
		int result = romanToInt(romanNumeral);
		System.out.println("Integer : "+ result);
		
	
	}

	public static int romanToInt(String s) 
	{
		if(s==null || s.length()==0)
		{
			return 0;
		}
		Map<Character,Integer> romanToInteger = new HashMap<>();
		romanToInteger.put('I', 1);
		romanToInteger.put('V', 5);
		romanToInteger.put('X', 10);
		romanToInteger.put('L', 50);
		romanToInteger.put('C', 100);
		romanToInteger.put('D', 500);
		romanToInteger.put('M', 1000);
		
		int value = romanToInteger.get(s.charAt(s.length()-1));
		for(int i=s.length()-2;i>=0;i--)
		{
			if(romanToInteger.get(s.charAt(i))<romanToInteger.get(s.charAt(i+1)))
			{
				value -= romanToInteger.get(s.charAt(i));
			}
			else
			{
				value += romanToInteger.get(s.charAt(i));
			}
		}
		return value;
	}

}
