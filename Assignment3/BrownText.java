package Assignment3;

public class BrownText {
	public static void main(String[] args) {

		String str = "A brown fox ran away fast";
		System.out.println(str.contains("brown"));
		if (str.contains("brown"))
			System.out.println("Present");
		else
			System.out.println("not present");
	}
}
