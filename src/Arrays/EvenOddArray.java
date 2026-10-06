package Arrays;

public class EvenOddArray {
	public void EvenOdd() {
		int[] arr = {23,45,22,145,56,32};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("Even "+ arr[i]);
			}else {
				System.out.println("Odd "+ arr[i]);
			}
		}
	}
}
