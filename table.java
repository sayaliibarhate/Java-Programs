/*Write a program to display the 1 to 15 tables*/
import java.io.*;
import java.util.Scanner;
public class table
{
	public static void main(String args[])
	{
		int num = 1;
		System.out.println("The table of 1 is: ");
		for(int j=1 ; j<=15 ; j++)
		{
			System.out.println("\t");
			for(int i=1 ; i<=10 ; i++)
			{
				System.out.println(j+" * "+i+ " = "+(j * i));
			}
		}
	}
}
