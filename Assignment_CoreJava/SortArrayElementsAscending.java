package Assignment_CoreJava;

public class SortArrayElementsAscending {

	public static void main(String[] args) {

		int a[] = { 80, 30, 20, 70, 50, 10, 40, 60 };
		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println();
			System.out.println("the sorting of array in Asc Order is:");
			for (int k= 0; k < a.length; k++) {
				System.out.println(a[k] + "");

			}
		}
	}

}
