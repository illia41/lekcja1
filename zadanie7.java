package company

import java.util.Scanner;
import java.lang.Math.*;

public class punkty{
	public static void main{
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj x1");
		int x1 = scan.nextInt();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj y1");
		int y1 = scan.nextInt();

		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj x2");
		int x2 = scan.nextInt();

		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj y2");
		int y2 = scan.nextInt();
		
		float wynik = sqrt(pow(x2 - x1) + pow(y2 - y1));
		System.out.println(wynik);
}

}