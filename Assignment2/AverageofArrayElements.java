package Assignment2;

import java.util.Scanner;

public class AverageofArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count, temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		count = scan.nextInt();

		int num[] = new int[count];
		int sum = 0;
		double avg = 0;
		System.out.println("Enter array elements:");
		for (int i = 0; i < count; i++) {
			num[i] = scan.nextInt();
			sum = sum + num[i];
			avg = sum / num.length;
		}
		scan.close();
		System.out.println("Array Elements sum is: " + sum);
		System.out.println("Array Elements average is: " + avg);
	}
}
