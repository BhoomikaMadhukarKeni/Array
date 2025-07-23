package Leetcode;
import java.util.*;
public class EvenDigitsInAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter the element of the array : ");
		for(int i =0 ; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = even(arr);
		System.out.println(ans);
	}
	
	public static int even(int[] arr) {
		int count =0;
	   for(int i =0; i< arr.length; i++) {
		   if(evenNumber(arr[i])) {
			   count ++;
		   }
	   }
	return count;
	}

	
	public static boolean evenNumber(int num) {
		
		if(numberOfDigits(num) % 2 == 0) {
			return true;
		}
		
		return false;
	}
	
	public static int numberOfDigits(int num) {
		
		int count = 0;
		while(num >  0) {
			count++;
			num = num / 10;
		}
		return count;
				
		
	}
}
