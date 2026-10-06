package Arrays;
import java.util.*;
public class CountElement {
	public void Count() {
		Scanner sc = new Scanner(System.in);
		
		int count=0;
		int[] arr= {10,32,42,23,76,85,42};
		System.out.println("Enter the element in an array");
		int n = sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				count++;
			}
		}
		System.out.println("The element "+n+" occures "+ count + " times");
	}
}
