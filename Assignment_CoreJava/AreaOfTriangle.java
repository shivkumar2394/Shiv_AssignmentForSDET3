package Assignment_CoreJava;

import java.util.Scanner;

public class AreaOfTriangle {
	
	public static void main(String[] args) {

		System.out.println("Enter base");
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		System.out.println("Enter height");
		int height= sc.nextInt();
		sc.close();
	        double 	area= 0.5*height*base;
	       	 System.out.println("Area of Triangle is:"+area);
	   
	}

}
