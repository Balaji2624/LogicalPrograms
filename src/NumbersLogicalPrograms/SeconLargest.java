package NumbersLogicalPrograms;

public class SeconLargest {

	public static void main(String args[])
	{
		int[] arr= {4,0,56,23,42,20};
		int max=arr[0];
		int s_max=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				s_max=max;
				max=arr[i];
			}else if(arr[i] >s_max && arr[i] !=max)
			{
				s_max=arr[i];
			}
		}
		System.out.println("Second max of the given array is : "+s_max);
	}
}
