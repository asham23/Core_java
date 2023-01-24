package Array;

import java.util.Scanner;

public class UsingScannerSorting {

	public static void main(ConvertingStringtoInt[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the size");
		int size=s.nextInt();
		
		//input the array
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the values");
			arr[i]=s.nextInt();
			
		}
		//printing the array
		System.out.println("the values of array are");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
			
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp;
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
				for(int i=0;i<arr.length;i++)
				{
				System.out.println("the sorting elements are:"+arr[i]);
			}

	}

}
