package com.greatlearning.driver;
import com.greatleaning.balanceBraces.*;
import java.util.Scanner;

public class driver {
	
	public static void main (String[] args)
    { 
		String inputBrackets = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter bracket sequence");

		inputBrackets = scan.next();
		Balancebraces brackets = new Balancebraces(inputBrackets);
		
		if(brackets.checkBraceSeq())
		{
			System.out.println("The entered String has Balanced Brackets");
		}
		else
		{
			System.out.println("The entered Strings do not contain Balanced Brackets");	
		}
		
    }
}
