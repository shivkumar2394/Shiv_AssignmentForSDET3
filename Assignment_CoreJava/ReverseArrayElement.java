package Assignment_CoreJava;

public class ReverseArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 3, 5, 6 };
		System.out.println("Array in reverse order: ");

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}

}
