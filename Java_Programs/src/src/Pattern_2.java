package src;

import java.util.Scanner;
public class Pattern_2 {


	public static void main(String[] args) {
		int n,i,j;
		System.out.println("Enter the number of lines");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1; i<=n; i++)
		 { 
			for(j=1 ;j<=n-i; j++)
		     {
			    System.out.print(" ");
		      }
			for(j=1 ;j<=i ;j++)
		     {
			    System.out.print("*");
		      }
			 System.out.println();
		}
		
		
	}

}
