package Array;

import java.util.Scanner;

public class SortingtheArray {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size");
		int size=sc.nextInt();
		
		//input the array
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the values");
			arr[i]=sc.nextInt();
			
		}
		//printing the array
		System.out.println("the values of array are");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
		//second array
		System.out.println("enter the size");
		int size1=sc.nextInt();
		//input the array
		int[] arr1=new int[size1];
		for(int i=0;i<size1;i++)
		{
			System.out.println("enter the values");
			arr1[i]=sc.nextInt();	
		}
		//printing the array
		System.out.println("the values of array are");
		for(int i=0;i<size1;i++)
		{
			System.out.println(arr1[i]);
		}	
	}
}
