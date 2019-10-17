package src;

public class Pattern {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i= 1; i <=10; i++) {
			arr[i-1]=i;
			for(int j =0; j < i-1; j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println("\n");
		}

	}

}
