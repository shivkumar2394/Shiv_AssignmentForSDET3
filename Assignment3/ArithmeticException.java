package Assignment3;

public class ArithmeticException {
	public static void main(String[] args) {

		try {
			int n1 = 20;
			int n2 = 0;
			int n3 = n1 / n2;
			System.out.println(n3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
