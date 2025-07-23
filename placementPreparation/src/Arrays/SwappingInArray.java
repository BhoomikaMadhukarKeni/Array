package Arrays;
import java.util.*;
public class SwappingInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] obj = new int[4];
		
		for(int i =0; i< obj.length; i++) {
			obj[i] =  sc.nextInt();
		}
		 System.out.println("Before swaping : ");
		 for(int i =0; i< obj.length; i++) {
				System.out.println(obj[i]);
			}
		 swap(obj,1,2);
		 System.out.println("After swaping : ");
		 for(int i =0; i< obj.length; i++) {
				System.out.println(obj[i]);
			}
	}

    static void swap(int[] obj, int i, int j) {
		// TODO Auto-generated method stub
		int temp = obj[i];
		obj[i] = obj[j];
		obj[j] = temp;
	}
}
