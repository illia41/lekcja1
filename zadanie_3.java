package com.company

import java.util.Scanner;

public class temperatura{
	public static void main{
		float c, f;
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj temperature w celsiuszach:  ");
		int c = scan.nextInt();
		f = (9.0/5.0)*c + 32;
		System.out.println(c, "stopnia celsiusza to ", f, "F");
	}
}