package com.company

import java.util.Scanner;

public class boki{
	public static void main{
		float str1, str2, str3;
		Scanner scan = new Scanner(System.in);
		System.out.println("strona 1: ");
		int str1 = scan.nextInt();
		Scanner scan = new Scanner(System.in);
		System.out.println("strona 2: ");
		int str2 = scan.nextInt();
		Scanner scan = new Scanner(System.in);
		System.out.println("strona 3: ");
		int str3 = scan.nextInt();
		if((str1 <= 0)||(str2 <= 0 )||(str3 <= 0)){
			System.out.println("nie");
		}
		else{
			System.out.println("tak");
		}
	}
}