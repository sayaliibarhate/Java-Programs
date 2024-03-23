/*Write a menudriven program to perform the following operations
	i. Calculate the volume of cylinder
	ii. Find the factorial of number
	iii. Check the number is armstrong or not
	1v. Exit*/
import java.io.*;
import java.lang.Math;
import java.util.Scanner;
class menu
{
	static double PI = 3.14;
	public static void main(String args[])
	{
		double radius,height;
		int no,num,fact=1;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("\n\nChoose any one: ");
			System.out.println("1) Volume of cylinder");
			System.out.println("2) Factorial of number");
			System.out.println("3) Armstrong number or not");
			System.out.println("4) Exit\n\n");
			int n = sc.nextInt();
			switch(n)
			{
				case 1:
					System.out.println("\nEnter the radius: ");
					radius = sc.nextDouble();
					System.out.println("Enter the height: ");
					height = sc.nextDouble();
					Double volume = PI * (radius*radius) * height;
					System.out.println("The volume of cylinder is: "+volume);
					break;
				case 2:
					System.out.println("\nEnter the number: ");
					num = sc.nextInt();
					for (int i=1 ; i<=num ; i++)
					{
						fact = fact * i;
					}
					System.out.println("The factorial of the number "+num+" is "+fact);
					break;
				case 3:
					int r, sum=0;
					System.out.println("\nEnter the number: ");
					no = sc.nextInt();
					int temp = no;
					while(temp != 0)
					{
						r = temp % 10;
						sum += (Math.pow(r,3));
						temp = temp/10;
					}
					if(sum == no)
						System.out.println(no+" is a armstrong number!");
					else
						System.out.println(no+" is not a armstrong number!");
					break;
				case 4:
					System.exit(1);
			}
		}
	}
}

					


