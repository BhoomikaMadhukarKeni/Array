package basicPrograms;
import java.util.*;
public class Prime {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start and end number: ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		for(int num = start ; num <= end; num++) {
		boolean prime = true;
		
		if(num <= 1) {
		prime = false;
		}
		else {
		for(int i =2; i < num; i++) {
			if(num % i == 0) {
				prime = false;
				break;
			}
		}
		}
		
		if(prime) {
			System.out.println(num+ " ");
		}
		}
}
}

