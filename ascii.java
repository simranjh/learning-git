package sammiedoingjava;

import java.util.Scanner;

public class ascii {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter character:");
		
		char input = scanner.next().charAt(0);
		
		int ab = input;
		System.out.println("ASCII value: "+ ab);
		
	
	}
}
