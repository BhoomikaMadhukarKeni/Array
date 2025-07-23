package basicPrograms;
import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :: ");
		int num = sc.nextInt();
		int first = 1;
		int sec = 1;
		System.out.println(first);
		System.out.println(sec);
		
		for(int i = 3; i<= num; i++) {
			int temp = first + sec;
			System.out.println(temp);
			first = sec;
			sec = temp;
		}
	}
}
