package Assignment2;

public class ReverseNo {
	public static void main(String[] args) {
		  int num = 123, rv = 0;

		    while(num != 0) {
		    
		      int digit = num % 10;
		      rv = rv * 10 + digit;
		      num /= 10;
		    }

		    System.out.println("Reverse of Number: " + rv);
		  }
		}



