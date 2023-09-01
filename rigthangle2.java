package sammiedoingjava;

import java.util.Scanner;

public class rightangle2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int var= scanner.nextInt();
		scanner.close();
		int k=1;
		for(int i=1; i<=var; i++) 
		{
			for(int j=1;j<=i;j++) 
			{
		System.out.print(k++);
		
			}System.out.println(" ");
		}
	}
}
