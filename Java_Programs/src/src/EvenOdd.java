package src;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args)
	{

		System.out.println("Enter the number:");
         Scanner n = new Scanner(System.in); 
         int num = n.nextInt();
         
         if(num%2==0) {
        	 System.out.println(num+" is even.");
         }
         else
         {System.out.println(num+" is odd.");
	}

}
}

