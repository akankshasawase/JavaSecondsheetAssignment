//Java Program to Find Quotient and Remainder//Method overloading
package Javabatch;

public class Program2 {

	public static void main(String[] args) {
		int x=30,y=10;
		double output=division(x,y);
		System.out.println(output);
		
		System.out.println(division(100.2,20.05));
		double output2=division(x);
		System.out.println(output2);
	}
	public static double division(int  x,int y)
	{
		double quotient=x/y;
		return quotient;

}
	public static double division (double x,double y)
	{
		System.out.println("We are inside second division method");
		double quotient=x/y;
		return quotient;

}
	
	public static double division (int x)
	{
	
		double remainder =x/9;
		return remainder;

}
}
