package Arrays;
import java.util.*;
public class SelectionSort {
	

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of the array : ");
			int size = sc.nextInt();
			System.out.println("Enter the element of the array : ");
			int[] arr = new int[size];
			for(int i =0; i<size; i++) {
				arr[i] = sc.nextInt();
			}
			selectionsort(arr);
			for(int val : arr) {
			System.out.println(val + "");
			}
		}
		public static void selectionsort(int[] arr) {
			
			for(int i =0; i< arr.length; i++) {
			int last = arr.length-i-1;
			int midindex = greatindex(arr,0,last);
			swap(arr,last,midindex);
			}
			
		}
		public static int greatindex(int[] arr,int start,int end) {
			
			int maxindex = start;
			for(int i = start;i<=end;i++) {
				if(arr[i] > arr[maxindex]) {
					maxindex = i;
				}
			}
			return maxindex;
		}
		
		public static void swap(int[] arr,int first,int sec) {
			int temp = arr[first];
			arr[first] = arr[sec];
			arr[sec] = temp;
		}
	}
