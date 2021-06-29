package Assignment3;

public class CharToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String to char

		String s1 = "SDET Training Assignment";
		System.out.println("Given String is:" + s1);
		char[] ch = s1.toCharArray();
		int len = ch.length;
		System.out.println("Char Array elements: ");
		for (int i = 0; i < len; i++) {
			System.out.println(ch[i]);
		}
		// Char to String
		char s2[] = { 'S', 'D', 'E', 'T', ' ', 'T', 'r', 'a', 'i', 'n', 'i', 'n', 'g' };
		String str = new String(s2);
		System.out.println(str);

	}

}
