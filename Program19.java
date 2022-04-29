//Java Program to Find ASCII Value of a Character
package Javabatch;

import java.util.Scanner;

public class Program19 {

	public static void main(String[] args) {
		
		System.out.print("Enter a character: ");  
		Scanner sc = new Scanner(System.in);  
		char chr = sc.next().charAt(0);  
		int asciiValue = chr;  
		System.out.println("ASCII value of " +chr+ " is: "+asciiValue);  
		}  

	}


