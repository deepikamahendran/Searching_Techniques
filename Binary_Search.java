package demo;

import java.util.Scanner;

public class BinarySearch 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a[]= {100,200,300,400,500};
		System.out.println("Enter your Target Number:");
		int key = s.nextInt();
		int start=0;
		int end=a.length-1;
		int flag=0;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(a[mid]==key)
			{
				System.out.println("Element Found:"+mid);
				flag =1;
				break;
			}
			else if(a[mid]<key)
			{
				start=mid+1;
			}
			else
			{
				start=mid-1;
			}
			if(flag==0)
			{
				System.out.println("Element not found");
			}
		}
	}
}
