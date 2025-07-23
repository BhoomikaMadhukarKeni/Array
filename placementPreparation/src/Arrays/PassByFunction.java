package Arrays;
import java.util.*;
public class PassByFunction {
	public static void main(String[] args) {
		int[] arr = {1,2,3,8,9};
		System.out.println(Arrays.toString(arr));
		change(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void change(int[] jk) {
		jk[1] = 99;
	}
}
