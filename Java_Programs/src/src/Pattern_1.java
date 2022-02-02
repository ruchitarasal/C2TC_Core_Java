package src;

import java.util.Scanner;

public class Pattern_1 {

	public static void main(String[] args) {
		System.out.println("Enter the no of lines");
		int i,j;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (i=1 ;i<=n ;i++)
		{
			for(j=1 ;j<=i ;j++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
		
		

	}

}
