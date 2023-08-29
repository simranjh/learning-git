package sammiedoingjava;

import java.util.Scanner;

public class leapyear {
	public static void main(String[] args) {
		int year;
		System.out.println("Mention a year and I will tell you if it is a leap year or not: ");
		Scanner scanner = new Scanner(System.in);
		year = scanner.nextInt();
		scanner.close();
		
		if(year%4==0) {
			if(year%400!=0) {
			System.out.println("leap year");
		}
		}
		else 
	System.out.println("not a leap year");
		
	}
}
