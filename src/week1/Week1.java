/*
 *
 * Project: Week1
 * Author:  Osbardo Rodriguez
 * Date:    2/6/18
 */
package week1;

/*
 * Import the Scanner java package
 * import statement must come after the package and before the class is defined.
 */
import java.util.Scanner;

/**
 * Define class Week1
 */
public class Week1 {

	/**
	 *
	 * @param args command line arguments
	 */
	public static void main( String[] args ) {
		System.out.println( "Hello World" );
		System.out.print( "This is on one line" ); // 'print' does not add a new line, but 'println' does
		System.out.println( " and then I go to the next line" );

		/*
		 * Variables
		 * 2 parts to a variable
		 * 1. Name
		 * 2. Type
		 */
		int number1; // Variable declaration
		int number2, sum, product; // Variables can also be declared in one line

		// Assign values to variables
		number1 = 5;
		number2 = 10;
		sum     = number1 + number2; // Simple addition
		product = number1 * number2; // Multiplication

		System.out.println( "number1 + number2 = " + sum );
		System.out.println( "number1 * number2 = " + product );

		/*
		 * Variables can also be declared and assigned a value on the same line
		 */
		int number3 = 20;
		System.out.println( "number3 = " + number3 );

		/*
		 * Have user input variables
		 */
		int userNumber1;
		int userNumber2;
		int userSum;

		/*
		 * Instantiate the Scanner
		 */
		Scanner input = new Scanner( System.in ); // Create a scanner to obtain input from the command window

		/*
		 * Get numbers from the user
		 */
		System.out.print( "Enter user entered variable 1: " );
		userNumber1 = input.nextInt();

		System.out.print( "Enter user entered variable 2: " );
		userNumber2 = input.nextInt();

		userSum = userNumber1 + userNumber2; // Simple addition

		System.out.println( "Variable 1 + Variable 2 = " + userSum );

		/*
		 * User entered variables can also be declared and assigned a value on the same line
		 */
		System.out.print( "Enter user entered variable 3: " );
		int userNumber3 = input.nextInt();
		System.out.println( "Variable 3 = " + userNumber3 );
	}
}
