package Assignment3;

import java.util.HashMap;
import java.util.Map;


public class OccurrenceOfCharString {

	public static void main(String[] args)
    {
        String str ="DevLabs Alliance Training";
        characterCount(str);
    }
		static void characterCount(String inputString)
	    {
	        
	        HashMap<Character, Integer> charCountMap
	            = new HashMap<Character, Integer>();
	  
	        
	  
	        char[] strArray = inputString.toCharArray();
	  
	        // checking each char of strArray
	        for (char c : strArray) {
	            if (charCountMap.containsKey(c)) {
	  
	           
	                charCountMap.put(c, charCountMap.get(c) + 1);
	            }
	            else {
	  
	                
	                charCountMap.put(c, 1);
	            }
	        }
	  
	        // Printing the charCountMap
	        for (Map.Entry entry : charCountMap.entrySet()) {
	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }
	    }
	  
	    
	}