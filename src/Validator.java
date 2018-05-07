import java.util.Scanner;

public class Validator {

	public static double getDouble(Scanner scan, String prompt) {

		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (scan.hasNextDouble()) {
				d = scan.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid value. Try again.");
			}
			scan.nextLine();
		}
		return d;
	}
}