import java.util.Scanner;

public class largestnum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Write three numbers");
		
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		num3=scanner.nextInt();
		
		scanner.close();
		
		if (num1>num2 && num1>num3) {
			System.out.println("largest number: " + num1);
		}
		else if (num2>num1 && num2>num3) {
			System.out.println("largest number: " + num2);
		}
		else
		{
			System.out.println("largest number: " + num3);
		}	
	}
}
