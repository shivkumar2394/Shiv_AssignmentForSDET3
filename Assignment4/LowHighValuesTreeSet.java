package Assignment4;

import java.util.TreeSet;

public class LowHighValuesTreeSet {

	public static void main(String[] args) {

		// Create a TreeSet and populate it with elements
		TreeSet treeSet = new TreeSet();
		treeSet.add("element_1");
		treeSet.add("element_3");
		treeSet.add("element_2");
		treeSet.add("element_4");
		treeSet.add("element_5");

		// Object first() returns the lowest value in the TreeSet
		System.out.println("Lowest value in TreeSet is : " + treeSet.first());

		// Object last() returns the highest value in the TreeSet
		System.out.println("Highest value in TreeSet is : " + treeSet.last());
	}
}
