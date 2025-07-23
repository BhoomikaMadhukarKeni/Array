package Arrays;
import java.util.*;
public class MaximumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		for(int i = 0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		int max = num[0];
		
		for(int i =0 ; i < num.length; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		
		int min = num[0];
		for(int i =0; i<num.length;i++) {
			if(num[i] < min) {
				min = num[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
