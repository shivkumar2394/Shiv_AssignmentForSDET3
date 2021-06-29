package Assignment4;

import java.util.Hashtable;

public class KeyValueHashMap {

	public static void main(String[] args) {
		Hashtable<String, String> htable = new Hashtable<String, String>();
		htable.put("1", "abc");
		htable.put("2", "xyz");
		boolean blnExists = htable.containsKey("2");
		System.out.println("2 exists in Hashtable ? : " + blnExists);
	}
}
