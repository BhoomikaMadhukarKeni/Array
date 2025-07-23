package Leetcode;
import java.util.*;
public class wealth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element of the 2d array : ");
		int[][]arr = new int[3][3];
		int max = arr[0][0];
		for(int row = 0; row < arr.length;row++) {
			for(int col = 0; col < arr[row].length;col++) {// every length of every array at index 0,1,2 in the example
				arr[row][col] = sc.nextInt();
			}
			
		}
		for(int row = 0 ;row < arr.length; row++) {
			int sum =0;
			for(int col = 0; col < arr[row].length;col++) {
			sum  = sum + arr[row][col];
			}
			if(sum > max) {
				max = sum;
		}
	}
System.out.println(max);
}}
