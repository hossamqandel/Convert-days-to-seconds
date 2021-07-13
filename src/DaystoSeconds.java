
import java.util.Scanner;

public class DaystoSeconds {
	
/*You need a program to convert days to seconds.
The given code takes the amount of days as input.
Complete the code to convert it to seconds and output the result.*/

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		int hours = 24;
		int minutes = 60;
		int seconds = 60;
		System.out.println(days * hours * minutes * seconds);

		
		
	}
}

