//Java Program to Check Whether Number is Even or Odd
package Javabatch;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = o.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
		

	}

}
