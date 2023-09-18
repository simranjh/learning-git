// Write a Java program to count the letters, spaces, 
// numbers and other characters of an input string.

package sammiedoingjava;

import java.util.Scanner;

public class countplus {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
				
				String str;
				System.out.print("enter the string:");
				str = sc.nextLine();
				
				char ch[] = str.toCharArray();
				int Letters=0, Spaces=0, numbers=0, others=0;
				
				for(int i=0; i<str.length(); i++) 
				{
					if(Character.isLetter(ch[i]))
					{
						Letters++;
					}
					else if(Character.isSpaceChar(ch[i])) {
						Spaces++;
					}
					else if(Character.isDigit(ch[i]))
					{
						numbers++;
					}
					else
					{
						others++;
					}
				}
				System.out.println("Spaces are: "+ Spaces);
				System.out.println("letters are: "+ Letters);
				System.out.println("numbers are: "+ numbers);
				System.out.println("other characters are: "+ others);
				
				
		}
}

