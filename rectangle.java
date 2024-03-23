//Write a program to calculate area and perimeter of a rectangle
import java.io.*;
import java.util.Scanner;
class rectangle
{
	public static void main(String args[])
	{
		int length;
		int breadth;

		//Creating a Scanner object
		Scanner sc = new Scanner(System.in);

		//taking user input of length and breadth
		System.out.println("Enter the length of rectangle: ");
		length = sc.nextInt();
		System.out.println("Enter the breadth of rectangle: ");
		breadth = sc.nextInt();

		//calculation area and perimeter
		int perimeter = 2*(length + breadth);
		int area = length * breadth;

		//displaying area and perimeter
		System.out.println("The Area of rectangle is: "+area+"\nPerimeter of rectangle is: "+perimeter);
	}
}
