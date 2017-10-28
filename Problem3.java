package probles;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) 
	{ 
		sum();//calling method sum
		}

	static void sum() 
	{//reading two numbers
	Scanner ss = new Scanner(System.in); 
	int a=ss.nextInt();
	int b=ss.nextInt(); 
	int c; 
	c=a+b; 
	System.out.printf("first number is :"+a);
	System.out.printf("\nsecond number is :"+b);
	System.out.printf("\noutput number is :"+c);
	

ss.close(); } }