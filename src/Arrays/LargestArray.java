package Arrays;

public class LargestArray {
	public void Large() {
		int[] arr = {12,34,56,87,76,43};
		int Largest = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(Largest<arr[i]) {
				Largest=arr[i];
			}
		}
		System.out.println("Largest element in the array is  "+ Largest);
	}
}
