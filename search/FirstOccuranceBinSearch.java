package search;

public class FirstOccuranceBinSearch {

	private static int num;
	private static int index;
	public static void main(String[] args) {
		int [] intArr = {1,2,2,2,3, 3,4,4,4 ,4,5,5,9};
		//find n
		num = 4;
		int index = search(intArr);
		System.out.println("index is "+ index);
	}

	private static int search(int[] intArr) {
		int ind = binarySearch(intArr, 0, intArr.length-1);
		return ind;
	}

	private static int binarySearch(int[]arr, int start, int end) {

		int mid = start + (end-start)/2;

		if(num <= arr[mid]) {
			System.out.println("searching left " + start + " " + (mid));
			if(start == mid && num == arr[mid]) {
				index = mid;
			}else {
				binarySearch(arr, start, mid);
			}
		}else
			if(num>arr[mid]) {
				System.out.println("searching right " + (mid+1) + " " + end);
				if(mid+1 == end && num==arr[end]) {
					index = end;
				}else {
					binarySearch(arr, mid+1, end);
				}
			}

		return index;

	}

}
