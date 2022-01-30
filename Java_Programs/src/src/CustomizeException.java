package src;

import java.util.Scanner;
public class CustomizeException {

	public static void main(String[] args) throws agelimit
	{int age;
	System.out.println("Enter the age");
	Scanner sc=new Scanner(System.in);
	age=sc.nextInt();
	
	if(age<18)
	{
		throw new agelimit("Your age is less than 18.");
	}
	else
	{System.out.println("You are eligible for vaccination.");
	}
	

}}


class agelimit extends Exception
{
	agelimit(String msg)
	{super(msg);}
}

