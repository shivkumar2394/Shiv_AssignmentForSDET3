package Assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ReverseArrayList {

	public static void main(String[] args) {  
        List<String> l = new ArrayList<String>();  
        l.add("abc");  
        l.add("def");  
        l.add("ghi");  
        l.add("jkl");  
        System.out.println("Before Reversing");  
        System.out.println(l.toString());  
          
        Collections.reverse(l);  
        System.out.println("After Reversing");  
        System.out.println(l);  
    }  
}  