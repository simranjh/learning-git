package sammiedoingjava;

public class factor {
	public static void main(String[] args) {
int i;
System.out.println("Divisible by 3: ");
		for ( i =0; i<=100; i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}			

System.out.println("\nDivisible by 5: ");
		for( i=0;i<=100;i++) {
			if(i%5==0) {
				System.out.println(i);
			}
		}
		
System.out.println("\nDivisible by 3 and 5 both: ");
		for(i = 0;i<=100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println( i);
			}
		}
	}
}
