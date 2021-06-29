package Assignment4;

import java.util.Set;

public class HashSet {

	public static void main(String[] args) {

			  Set<Integer> h = (Set<Integer>) new HashSet();

			    h.add(new Integer("1"));
			    h.add(new Integer("2"));
			    h.add(new Integer("3"));

			    Object[] objArray = h.toArray();

			    for (Object obj : objArray)
			      System.out.println(obj);

		}

	}