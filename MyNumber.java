/*Define a class MyNumber having one private int data member. Write a default constructor to initialize it to 0 and another constructor to initialize it to a value(Use this). Write methods isNegative, isPositive, isZero, isOdd, isEven. Create an object in main. Use command line arguements to pass a value to the object and perform the above tests.*/
import java.io.*;
import java.util.Scanner;
public class MyNumber
{
	private int n;
	public MyNumber()
	{
		n=0;
	}
	public MyNumber(int n)
	{
		this.n=n;
	}
	public boolean isNegative()
	{
		if(n < 0)
			return true;
		else 
			return false;
	}
	public boolean isPositive()
	{
		if(n > 0)
                        return true;
                else
                        return false;
        }
	public boolean isZero()
	{
		if(n == 0)
                        return true;
                else
                        return false;
        }
	public boolean isEven()
	{
		if(n%2 == 0)
                        return true;
                else
                        return false;
        }
	public boolean isOdd()
	{
		if(n%2 != 0)
                        return true;
                else
                        return false;
        }
	public static void main(String args[]) throws ArrayIndexOutOfBoundsException
	{
		int n = Integer.parseInt(args[0]);
		MyNumber m1 = new MyNumber(n);
		if(m1.isZero())
			System.out.println("Zero!");
		else if(m1.isNegative())
			System.out.println("Negative Number!");
		if(m1.isPositive())
			System.out.println("Positive Number");
		if(m1.isEven())
			System.out.println("Even Number!");
		if(m1.isOdd())
			System.out.println("Odd Number!");
	}
}


