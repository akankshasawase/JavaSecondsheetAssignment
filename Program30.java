//Java Program to Check Whether a Number can be Express as Sum of Two Prime Numbers
package Javabatch;

import java.util.Scanner;

public class Program30 {

	public static void main(String[] args) {
		int number;
    Scanner sc = new Scanner(System.in);
System.out.println("Enter a number: ");
		number = sc.nextInt();

		boolean flag = false;
		for (int i = 2; i <= number / 2; ++i) {

			if (checkPrime(i)) 
			{

			 if (checkPrime(number - i))
			 {

	          System.out.printf("%d = %d + %d\n", number, i, number - i);
					flag = true;
				}
			}
		}

		if (!flag)
		{
			System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
		} 
		else {
			System.out.println(number + " is expressed as the sum of two prime numbers.");
		}
		sc.close();
	}

	public static boolean checkPrime(int num) {
		boolean isPrime = true;

		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}
}

	


