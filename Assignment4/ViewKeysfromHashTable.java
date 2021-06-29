package Assignment4;

import java.util.Enumeration;
import java.util.Hashtable;

public class ViewKeysfromHashTable {
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put("1", "One");
		h.put("2", "Two");
		h.put("3", "Three");
		Enumeration e = h.keys();

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
