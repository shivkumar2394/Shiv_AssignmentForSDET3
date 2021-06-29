package Assignment_CoreJava;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int i = 1, f = 1;
		// 4=1*2*3*4=24
		// f=i*n;
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		for (i = 1; i < n; i++) {
			f = f * i;
		}
		System.out.println("Factorial number are: " + f);
	}

}
