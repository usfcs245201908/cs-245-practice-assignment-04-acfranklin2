public class SelectionSort implements SortingAlgorithm
{
	public void swap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public void sort(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++)
			for(int j = i+1; j< arr.length; j++)
			{
				if(arr[j] < arr[i])
					swap(arr, i, j);
			}
	}
}