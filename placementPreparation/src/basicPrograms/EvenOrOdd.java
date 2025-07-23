package basicPrograms;
import java.util.*;
public class EvenOrOdd {
	public static void main(String[] srgs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		for(int i = 0; i<=num; i++ ) {
		if(num % 2 == 0) {
			System.out.println("the number "+num+ " is even number");
		}
		else {
			System.out.println("the numbe "+num+ " is odd number" );
		}
		num = num-1;
}
}
}
