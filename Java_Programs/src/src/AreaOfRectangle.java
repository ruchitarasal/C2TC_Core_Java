package src;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		System.out.println("Enter the length of the rectangle: ");
		   Scanner length = new Scanner(System.in);
		     int len = length.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
		   Scanner breadth = new Scanner(System.in);
		     int bre = breadth.nextInt();
		     
		System.out.println("The area of the rectangle is "+ (len*bre)+ ".");     

	}

}
