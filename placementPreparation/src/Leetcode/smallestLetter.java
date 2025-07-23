package Leetcode;
import java.util.*;
public class smallestLetter {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] arr = {'c','d','f','g'};
		
		System.out.println("Enter the target element : ");
		char target = sc.next().charAt(0);
		int ans =smallLetter(arr,target);
		System.out.println(ans);
	}

	public static char smallLetter(char[] arr, char target) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
		int mid = start + (end - start) /2;
		
		if(target >arr[mid]) {
			start  = mid +1;
		}else {
		    end = mid -1;
		}
		}
		return arr[start % arr.length];
	}
}
