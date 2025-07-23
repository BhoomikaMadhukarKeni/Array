package Arrays;
import java.util.*;
public class ReverseOfArray {

	public static void main(String[] arg) {
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array element : ");
		for(int i = 0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("Before reversing the array element : ");
		for(int i = 0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
		reverse(num);
		System.out.println("After reversing the array element : ");
		for(int i = 0; i<num.length; i++) {
			System.out.println(num[i]);
		}
	}
	
	static  void reverse(int[] num) {
		int start = 0;
		int end = num.length-1;
		
		while(start < end) {
			int temp = num[start]; /// you can also create separate function and call this later
			num[start] = num[end];
			num[end] = temp;
			start++;
			end--;
		}
	}
	
}
