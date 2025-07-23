package Arrays;
import java.util.*;
public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < arr.length; i++) {
		arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element that you want to search");
		int num = sc.nextInt();
		linearSearch(arr,num);
		}

    static void linearSearch(int[] arr, int num) {
	
    	for(int i = 0 ; i<arr.length;i++) {
    		if(num == arr[i]) {
    			System.out.println(arr[i] + " element found");
    			break;
    		}
    	}
		
	}
}

//best time complexity O(1) 
//worst time complexity O(n)
