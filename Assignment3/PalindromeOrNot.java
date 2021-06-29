package Assignment3;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--)
			rev = rev + str.charAt(i);
		if (str.equals(rev))
			System.out.println("Given string is a palindrome");
		else
			System.out.println("Given string is not a palindrome");
	}
}