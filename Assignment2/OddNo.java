package Assignment2;

import java.util.Scanner;

public class OddNo {

	public static void main(String[] args) {

		System.out.println("Enter range");
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();

		int max = sc.nextInt();
		sc.close();
		System.out.println("Odd Numbers:");
		for (int i = min; i < max; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
