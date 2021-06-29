package Assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String[] args) {
		   ArrayList<String> fr = new ArrayList<String>();
		   fr.add("mango");
		   fr.add("apple");
		   fr.add("banana");
		   fr.add("strawberry");
		   System.out.println("Before Sorting:");
		   for(String counter: fr){
				System.out.println(counter);
			}

		   Collections.sort(fr);
		   System.out.println("After Sorting:");
		   for(String counter: fr){
				System.out.println(counter);
			}
		}
	}