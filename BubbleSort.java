public class BubbleSort implements SortingAlgorithm
{
	public void sort(int[] arr)
	{
		for(int j=0; j<arr.length; j++)
			for(int i=0; i<arr.length - 1 - j; i++)
				if(arr[i] > arr[i+1])
					swap(arr, i, i+1);
	}

	public void swap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}