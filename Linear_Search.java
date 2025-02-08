package demo;

import java.util.Scanner;

public class LinearSearch 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a[]= {600,800,300,500,400,700};
		System.out.println("Enter your Target Number:");
		int key = s.nextInt();
		int start=0;
		int end=a.length-1;
		int flag=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==key)
			{
				System.out.println("Element Found:"+i);
				flag=1;
			}
		}
			if(flag==0)
			{
				System.out.println("Element not found");
			}
	}
}
