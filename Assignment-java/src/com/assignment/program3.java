package com.assignment;

import java.util.HashSet;
import java.util.Scanner;

public class program3 {

	public static void main(String[] args) 
	{
		System.out.println("Enter Sentence ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.replaceAll(" " , "");
		str = str.toLowerCase();
		HashSet<Character> hs = new HashSet<>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=97 && str.charAt(i)<=122)
				hs.add(str.charAt(i));
			
		}
		if(hs.size()==26)
			System.out.println("panagram");
		else
			System.out.println("not panagram");
	}

}
