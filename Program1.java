//Java Program to Add, subtract, multiply and divide Two Numbers
package Javabatch;

public class Program1 {

	public static void main(String[] args) {
		int x=10,y=20;
		add(x,y);
		substract(x,y);
		int output= multiply(x,y);
		System.out.println(output);
		System.out.println(divide(x,y));
		

	}
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void substract(int a,int b)
	{
		System.out.println(a-b);
	}
	public static int multiply(int a,int b)
	{
		return(a*b);
	}
	public static double divide(int x,int y)
	{
		return y/x;
	}
}
