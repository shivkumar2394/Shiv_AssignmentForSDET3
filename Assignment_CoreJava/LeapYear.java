package Assignment_CoreJava;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a year: ");  
		int n = sc.nextInt();
        if(n%4==0)
	
	        System.out.print("Leap Year");
        else
        	   System.out.print("Non Leap Year");
	    }




	}


