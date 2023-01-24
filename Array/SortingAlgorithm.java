package Array;

public class SortingAlgorithm {

	public static void main(ConvertingStringtoInt[] args) {
		//compare one values with other values
		int [] arr={30,40,20,80,60};
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
