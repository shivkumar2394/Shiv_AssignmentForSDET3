package Assignment_CoreJava;

public class PrimeNo {
	public static void main(String[] args) {

		int i, j, flag = 0;
		for (i = 0; i < 100; i++)

		{
			flag = 0;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(i);
			}

		}
	}

}
