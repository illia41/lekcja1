package com.company

import java.util.Scanner;

public class dni{
	
	Scanner scan = new Scanner(System.in);
	System.out.println("wprowadz liczbe:");
	int liczba = scan.nextInt();
	switch (liczba) {
		case 1:
		{
			System.out.println("ponidzialek");
			Break;	
		}
		case 2:
		{
			System.out.println("wtorek");
			Break;	
		}
		case 3:
		{
			System.out.println("sroda");
			Break;	
		}
		case 4:
		{
			System.out.println("czwartek");
			Break;	
		}
		case 5:
		{
			System.out.println("piatek");
			Break;	
		}
		case 6:
		{
			System.out.println("sobota");
			Break;	
		}
		case 7:
		{
			System.out.println("niedziela");
			Break;	
		}
	}

}