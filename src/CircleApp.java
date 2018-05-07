// Title: Lab No 9
// Author: John Aoraha
// Date: May 7, 2018

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {

		// declare and initialize variable to output number of circles created.
		int numCircles = 0;

		// initial prompt.
		System.out.println("Welcome to the Circle Tester!");

		// intialize scanner.
		Scanner scan = new Scanner(System.in);

		// while loop and cont variable to allow user to continue.
		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {

			// initialize radius based on user input, use circle class to store circle data
			// and use validator to class to validate data
			Circle radius = new Circle(Validator.getDouble(scan, "Please enter a radius: "));

			//output circumference calculation from circle class
			System.out.println("Circumference: " + radius.getFormattedCircumference());

			//output area calculation from circle class
			System.out.println("Area: " + radius.getFormattedArea());

			//add +1 to number of circles tested for each execution of while loop.
			numCircles++;

			// prompt user to continue and accept  y/n input.
			System.out.print("Continue? (y/n) ");
			cont = scan.next();
		}
		scan.close();

		// output number of circles upon completion of while loop, if 1 loop then use singular case.
		if (numCircles == 1) {
			System.out.println("You created " + numCircles + " circle.");
			System.out.println("Goodbye!");
		} else {
			System.out.println("You created " + numCircles + " circles.");
			System.out.println("Goodbye!");
		}

	}
}
