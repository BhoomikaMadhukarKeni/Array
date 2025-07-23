package Arrays;
import java.util.*;
public class ArrayInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Array of primitives
		int[] var = new int[5];
		System.out.println("Enter the array element : ");
		for(int i =0; i < var.length;i++) { //inserting the element
			var[i] = sc.nextInt();
		}
		System.out.println("The array elements are : ");
		for(int i = 0; i< var.length;i++) {//printing the element
			System.out.println(var[i] + " ");
		}
		
		for(int j : var) { //using enhanced for loop
			System.out.println("Printing :"+j);
		}
		
		System.out.print(Arrays.toString(var));//using Arrays.toString
		
		///Array of object
		
		String[] arr = new String[5];
		
		System.out.println("Enter the String in to Array");
		for(int i =0; i<arr.length;i++) {
			arr[i] = sc.nextLine();
		}
		System.out.println("string entered are: ");
		
		for(int i =0; i<arr.length;i++) {
		System.out.println(arr[i]);
		
		}
		
		
	}
	}
	
