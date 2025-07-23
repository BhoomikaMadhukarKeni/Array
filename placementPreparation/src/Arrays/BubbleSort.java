package Arrays;
import java.util.*;
public class BubbleSort {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the element of the array : ");
		for(int i =0; i< arr.length; i++ ) {
			arr[i] = sc.nextInt();
		}
	  bubblesort(arr);
	  for(int val : arr) {
		  System.out.println(val + " ");
	  }
	}
	
	public static void bubblesort(int[] arr) {
		boolean swp;
		for(int i = 0; i < arr.length; i++ ) { // at every pass largest element will come at last
		    swp = false;
			for(int j = 1; j < arr.length-i;j++) {
				
				if(arr[j] < arr[j-1]) { // for increasing order 
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swp = true;
				}
			
			}
			if(!swp) {
				break;
			}
		}
	}
}
