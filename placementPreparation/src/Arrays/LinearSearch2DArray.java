package Arrays;
import java.util.*;
public class LinearSearch2DArray {
	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of 2D Array");
		for(int row= 0 ; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				arr[row][col] = sc.nextInt();
			}
		}
		System.out.println("2D Array :");
		for(int row= 0 ; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				System.out.println(arr[row][col]+ " " );
			}
			System.out.println();
		}
		
		System.out.println("Enter the element to be searched in 2D Array :");
		int t = sc.nextInt();
		search(arr,t);
		
	}

       static void search(int[][] arr, int t) {
		// TODO Auto-generated method stub
    	   for(int row= 0 ; row < arr.length; row++) {
   			for(int col = 0; col < arr[row].length; col++) {
   				
   				if(arr[row][col] == t) {
   					System.out.println("Element found "+arr[row][col]);
   				    return;
   				}
   				}
   			}
    	   System.out.println("Not found");
	}
	
}