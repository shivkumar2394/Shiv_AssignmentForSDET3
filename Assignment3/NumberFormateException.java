package Assignment3;

import java.util.Scanner;

public class NumberFormateException {

	public static void main(String[] args) {
		int number;

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("Enter any valid numeber: ");

			try {

				number = Integer.parseInt(sc.next());

				System.out.println("You entered: " + number);
				break;
			}

			catch (NumberFormatException e) {

				System.out.println("NumberFormatException occured");
			}
		}
	}
}
