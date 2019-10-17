package search;

public class BinarySearchExample {

	static int num;

	public static void main(String[] args) {
		//int [] intArr = {41, 3, 65, 13, 35, 2, 9, 1, 10, 48, 23, 12, 74, 49};

		//sort(intArr);
		//System.out.println("sorted: ");
		//		for(int i = 0; i < intArr.length; i++)
		//			System.out.println(intArr[i]);

		int [] intArr = {1,2,3,4,5,6,7,8,9,10};
		//find n
		num = 4;
		int index = search(intArr, num);
		System.out.println(num + " is at index " + index);

	}

	public static int search(int[] intArr, int num) {
		int ind= searchBinary(intArr, 0, intArr.length-1);
		return ind;
	}

	//returns index of found number
	//	public static int searchBinary(int[] intArr, int start, int end) {
	//		System.out.println("searchBinary invoked..." + start + " " +end);
	//		
	//		int index = -1;
	//		int arrlength = end - start + 1;
	//		int[] locArr = new int[arrlength];
	//		System.arraycopy(intArr, start, locArr, 0, arrlength);
	//		
	//		if(arrlength == 2) {
	//			index = intArr[start]==num? start:end;
	//		}else {
	//		System.out.println("in else, arrlength="+arrlength);
	//			int center = (end-start)/2;
	//			System.out.println("center is "+ center);
	//			if(num == locArr[center]) {
	//				index= center;
	//			}
	//			else if(num < intArr[center]) {
	//				System.out.println("num less than center val");
	//				searchBinary(locArr, 0, center-1);
	//			}else if(num > intArr[center]){
	//				System.out.println("num greater than center val");
	//				searchBinary(locArr, center+1, arrlength-1);
	//			}
	//		}
	//		
	//		return index;
	//		
	//	}


	//{ 1, 2, 3, 4, 5, 6, 7, 8, 9}
	public static int searchBinary(int[] intArr, int start, int end) {

		System.out.println("searchBinary invoked..." + start + " " +end);

		if(end-start == 1) {
			System.out.println("should return " + (intArr[start]==num? start:end));
			return intArr[start]==num? start:end;
		}

		if(start == end && num==intArr[start]) {
			System.out.println("start same as end " + num + " " + intArr[start]);
			return start;
		}

		int center = start + (end-start)/2;
		System.out.println("center is "+ center);
		if(num == intArr[center]) {
			return center;
		}
		else if(num < intArr[center]) {
			System.out.println("num less than center val");
			return searchBinary(intArr, start, center-1);
		}else if(num > intArr[center]){
			System.out.println("num greater than center val");
			return searchBinary(intArr, center+1, end);
		}


		return -1;

	}

}
