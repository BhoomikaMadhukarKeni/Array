package Arrays;
import java.util.*;
public class MaxIn2DArray {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);	
		 int[][] arr = new int[3][3];
		 System.out.println("Enter the elemengt of the array : ");
		 for(int row = 0; row < arr.length; row++) {
			 for(int col = 0; col < arr[row].length; col++) {
				 arr[row][col] = sc.nextInt();
			 }
		 }
		 System.out.println("the elemengt of  array are  : ");
		 for(int row = 0; row < arr.length; row++) {
			 for(int col = 0; col < arr[row].length; col++) {
				 System.out.println(arr[row][col]);
		 }
			 System.out.println(); 
	}
   int ans =  max(arr);
	int ans1 = min(arr);
	System.out.println("the maximun element of the 2D Array is : "+ans);
	System.out.println("the minimum element of the 2D Array is : "+ans1);
}

	 static int min(int[][] arr) {
		int max = arr[0][0];
		for(int row = 0; row < arr.length; row++) {
			 for(int col = 0; col < arr[row].length; col++) {
				 if(arr[row][col] > max) {
					 max = arr[row][col];
					 ;
				 }
		 }
		}
		return max;
	}

	 static int max(int[][] arr) {
		
		 int min =arr[0][0];
			for(int row = 0; row < arr.length; row++) {
				 for(int col = 0; col < arr[row].length; col++) {
					 if(arr[row][col] < min) {
						 min = arr[row][col];
						 ;
					 }
			 }
			}
			return min;
	}
}