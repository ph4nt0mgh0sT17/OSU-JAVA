package Osu;

import java.util.Scanner;

/**
 * The main application.
 *
 * @author Miko
 */
public class Main {

    public static void main(String[] args) {

		/*System.out.println("Hello, world!");

		OpticSeparation();

		// The biggest value of Integer
		System.out.println(String.format("The biggest value of Integer is: %d", Integer.MAX_VALUE));

		OpticSeparation();

		// Initializes a scanner for getting input from user
		Scanner scanner = new Scanner(System.in);

		// Gets the first number
		System.out.print("Enter a first number: ");
		int firstNumber = scanner.nextInt();

		// Gets the second number
		System.out.print("Enter a second number: ");
		int secondNumber = scanner.nextInt();

		// Adds two numbers
		int result = firstNumber + secondNumber;

		// Prints the result
		System.out.println(String.format("The result of '%d + %d' is: %d", firstNumber, secondNumber, result));

		OpticSeparation();

		// Gets the third number
		System.out.print("Enter a third number: ");
		int thirdNumber = scanner.nextInt();

		// Gets the fourth number
		System.out.print("Enter a fourth number: ");
		int fourthNumber = scanner.nextInt();

		// Divides two numbers
		double secondResult = ((double)thirdNumber / (double)fourthNumber);

		// Prints the result
		System.out.println(String.format("The result of '%d / %d' is: %f", thirdNumber, fourthNumber, secondResult));*/

		/*Car myCar = new Car("Wolkswagenn", "Golf", "Grey", 15, 2500, 1500);

		System.out.println(myCar);*/

		Game firstGame = new Game("The Witcher 3: Wild Hunt", "RPG", "Playstation 4", 93, "Game of the Year");
		Game secondGame = new Game("Assassin's Creed: Odyssey", "RPG", "Playstation 4", 83, null);

		System.out.println(firstGame);
		System.out.println(secondGame);

	}

	/**
	 * Separates text in console.
	 */
	private static void OpticSeparation() {
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println();
	}
}