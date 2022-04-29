//Java Program to Display Prime Numbers Between Two Intervals
package Javabatch;

import java.util.Scanner;

public class program23 {

	public static void main(String[] args) {
		int high, low, i;
	      boolean temp;
	      Scanner sc = new Scanner(System.in);
	    
	      System.out.print("Enter the starting number : ");
	      low =sc.nextInt();
	      System.out.print("Enter an ending Number: ");
	      high = sc.nextInt();
	      System.out.println("The prime numbers between the interval " + low + " and " + high + " are:");
	      while (low < high)
	      {
	         temp = false;
	         for(i = 2; i <= low/2; ++i) {
	            if(low % i == 0) {
	               temp = true;
	               break;
	            }
	         }
	         if (!temp && low != 0 && low != 1)
	            System.out.print(low + " ");
	         ++low;
	      }
	   }

	}


