package sammiedoingjava;

import java.util.Scanner;

public class idstring {
	public static void main (String[] args) {
		System.out.println("input a one character string here:");
		
		Scanner scanner = new Scanner(System.in);
		String input= scanner.next();
		
		scanner.close();
		if(input.length()!= 1) {
			System.out.println("error in type of character");
		}
		else{
			char ch = input.charAt(0);
	

		if (ch== 'a'|| ch=='e' || ch== 'i' || ch=='o' || ch=='u'
			|| ch == 'A' || ch== 'E' || ch=='I'|| ch=='O' || ch== 'U') {
			System.out.println("Vowel");
		}
		else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
			System.out.println("constants");
		}
		else
			System.out.println("try again");
	}
	}
}
