package Array;

import java.util.Scanner;

public class MergingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
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
		
		//second array
		System.out.println("enter the size1");
		int size2=sc.nextInt();
		//input the array
		int[] arr2=new int[size2];
		for(int i=0;i<size2;i++)
		{
			System.out.println("enter the values");
			arr2[i]=sc.nextInt();
			
		}
		//printing the array
		System.out.println("the values of array are");
		for(int i=0;i<size2;i++)
		{
			System.out.println(arr2[i]);
		}
		 
		int []arr3=new int[size1+size2];
		
		for(int i=0;i<arr3.length;i++)
		{
			if(i<arr1.length)
			{
				arr3[i]=arr1[i];
				
			}
			else
			{
				arr3[i]=arr2[i-size1];
				
			}
		System.out.println("the merging array is:");
		}
		//print the array3
		for(int i=0;i<arr3.length;i++)
		{
			System.out.println(arr3[i]);
		}
		
		
		
	}

}
