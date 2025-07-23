package basicPrograms;
import java.util.*;
public class Sum {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number rannger");
			int n = sc.nextInt();
			int sum = (n/2)*(n+1);
			System.out.println("sum of number"+sum);
		}
}
