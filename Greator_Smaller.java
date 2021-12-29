package Assignments;

import java.util.Scanner;


public class Greator_Smaller {
	public static void main(String args[]) {
		int n;
		System.out.println("Enter n");
		Scanner sc =new Scanner(System.in);
	    n=sc.nextInt();
		if(n<10)
		{
			
			if(n<5)
			{
			System.out.println(n+ " is smaller than 5");
			}
			else
			{
		    System.out.println(n+ " is greater than 5");
			}
		}
		else
		{
			System.out.println(n+ " is greater than 10");
		}
		
	}

}
