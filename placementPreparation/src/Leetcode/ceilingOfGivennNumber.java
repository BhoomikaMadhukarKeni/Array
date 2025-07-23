package Leetcode;

import java.util.Scanner;

public class ceilingOfGivennNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
	
		System.out.println("Enter the element of the array : ");
		for(int i =0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			}
		
		System.out.println("Enter the element to be searched");
		int target = sc.nextInt();
		
		int ans = binarySearch(arr,target);
		System.out.println(ans);
	}

	 static int binarySearch(int[] arr, int target) {
		
		 int start = 0;
		 int end = arr.length-1;
		 
		 while(start<=end) {
			 int mid = start +(end - start) / 2;
			 if(target < arr[mid]) {
				 end = mid -1;
			 }
			 else if(target > arr[mid]) {
				 start = mid + 1;
			 }else {
				 return mid;
			 }
		 }
		return start;
	}
}
