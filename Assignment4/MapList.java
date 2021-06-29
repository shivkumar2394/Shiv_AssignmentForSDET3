package Assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapList {

	public static void main(String[] args) {
	     Map<Integer, String> hm = new HashMap<Integer, String>();
	     hm.put(1, "abc");
	     hm.put(2, "bcd");
	     hm.put(3, "cde");
	     hm.put(4, "def");

	      ArrayList<Integer> keyList = new ArrayList<Integer>(hm.keySet());
	      ArrayList<String> valueList = new ArrayList<String>(hm.values());

	      System.out.println(" keys ::"+keyList);
	      System.out.println("values ::"+valueList);

	}

}
