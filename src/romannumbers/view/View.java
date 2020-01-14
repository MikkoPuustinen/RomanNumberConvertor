package romannumbers.view;

import java.util.Scanner;

import romannumbers.model.Model;
import romannumbers.model.ModelIF;
import romannumbers.model.RomanNumbers;
/**
 * A text based user interface for converting roman numbers.
 * @author Mikko Puustinen
 *
 */
public class View implements ViewIF{
	private ModelIF model;
	private Scanner scanner;
	
	public View () {
		this.scanner = new Scanner(System.in);
		this.model = new Model();
	}
	/**
	 * Starts the application by printing the starting information and beginning the main loop.
	 */
	public void start() {
		System.out.println("RomanNumberConvertor2000\n\n\nType 'h' for help\n\nWrite a roman number.");
		convertNumbers(scanner.nextLine());
	}
	
	private void convertNumbers(String romanNumber) {
		switch (romanNumber) {
			case "q":
				end();
				break;
			case "h":
				printHelp();
				break;
			default:
				try {
					System.out.println(model.handleUserInput(romanNumber.toUpperCase()));
				} catch (IllegalArgumentException iae) {
					System.out.println(iae.getMessage());
				}
		}

		System.out.println("Write a roman number: ");
		convertNumbers(scanner.nextLine());
	}
	
	private void end() {
		scanner.close();
		System.exit(-1);
	}
	
	private void printHelp() {
		System.out.println("Commands:\nq: quit the app\nh: print this help\n\nConvert roman numbers by"
				+ " typing the number you want to convert. The app will not accept any characters \nthat are not "
				+ "roman numerals. The accepted numerals are: M, D, C, L, X, V, I. The app will "
				+ "also not accept malformed roman numerals. \nSee the Wikipedia page for roman numbers"
				+ " for correct formatting.");
	}
}
