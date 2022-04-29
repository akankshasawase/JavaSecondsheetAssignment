//Java Program to Check Whether a character is Vowel or Consonant.
package Javabatch;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		char ch;
	Scanner o =new  Scanner(System.in);
	System.out.println("Enter acharacter");
	ch=o.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

	}

}
