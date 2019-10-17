package sorting;

public class QuickSort {
	
	//in-place sort, with avg O(nlogn) and worst-O(sqr(n))

	public static void main(String[] args) {
		int[] arr = { 4, 7, 0, 5, 2, 0, 6, 3, 1, 8};
		sort(arr, 0, arr.length-1);
		System.out.println("final:");
		for(int a:arr) {
			System.out.println(a);
			}

	}

	public static void sort(int[] arr, int start, int end)	{
		if(start<end) {
			int p = partition(arr, start, end);
			sort(arr, start, p-1);
			sort(arr, p+1, end);
		}

	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int pIndex= start;

		System.out.println("pivot="+pivot+" pindex="+pIndex);
		for(int a:arr) {
			System.out.println(a);
		}
		
		//fix pIndex to start value, then as i increases,
		//compare i'th value to pivot value, if its smaller than pivot
		//swap pIndex value and i'th index value, then increment pIndex
		//this will help in moving smaller values to left side,
		//pIndex will stop increasing once all smaller that pivot values are moved by swapping, 
		//then just move pivot value to pIndex position,
		//which will divide the array by pivot value at middle having smaller vals to left and greater ones to right

		for(int i=start; i < end; i++) {
			
			if(arr[i] <= pivot) {
				int temp=arr[pIndex];
				arr[pIndex] = arr[i];
				arr[i] = temp;
				pIndex += 1;
			}
		}
		
		//swap only if value at pIndex is greater than current pivot value
		if(arr[pIndex] > arr[end]) {
			int temp=arr[pIndex];
			arr[pIndex] = arr[end];
			arr[end] = temp;
		}
		System.out.println(" &  pivot="+pivot+" pindex="+pIndex);
		for(int a:arr) {
			System.out.println(a);
		}
		System.out.println("------------");
		return pIndex;
	}
	

}
