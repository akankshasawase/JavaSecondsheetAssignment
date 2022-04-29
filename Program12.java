//Java Program to Generate Multiplication Table
package Javabatch;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args)
	{
		 Scanner s = new Scanner(System.in);
			System.out.print("Enter number:");        
			int n=s.nextInt();
		        for(int i=1; i <= 10; i++)
		        {
		            System.out.println(n+" * "+i+" = "+n*i);
		        }

	}

}
