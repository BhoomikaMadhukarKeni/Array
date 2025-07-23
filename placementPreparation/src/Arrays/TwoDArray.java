package Arrays;
import java.util.*;
public class TwoDArray {
	public static void main(String[] args) {
   //multi dimension array
	/* 1 2 3 4
	 * 2 4 5 6
	 * 3 5 5 5
	 */
		
	Scanner sc = new Scanner(System.in);
	int[][] num = new int[3][2];
	int[][] num1 = {
			{2,3,4},//0 index 
			{4,5,6,7},//1 index
			{4,5,5,5}// 2 index
	};
	
	//input
	System.out.println("Enter the elemnt of 2D array : ");
	for(int row = 0; row < num.length;row++) {
		for(int col = 0; col < num[row].length;col++) {// every length of every array at index 0,1,2 in the example
			num[row][col] = sc.nextInt();
		}
		
	}
	
	for(int row =0; row < num.length; row++) {
		for(int col = 0; col < num[row].length; col++) {
			System.out.print(num[row][col] + " ");
		}
		System.out.println();
	}
	
	for(int row = 0; row < num.length;row++) {
		System.out.println(Arrays.toString(num[row]));
	}
}
}
