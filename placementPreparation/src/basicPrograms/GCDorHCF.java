package basicPrograms;
import java.util.*;
public class GCDorHCF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second number : ");
		int num2 = sc.nextInt();
		while(num1 != num2) {
			if(num1 == 0) {
				System.out.println("GCD "+num2);
				break;
			}
			if(num2 == 0 ) {
				System.out.println("GCD "+num1);			}
			if(num1 > num2) {
				num1 = num1 - num2;
			}
			if(num2 > num1) {
				num2 = num2 - num1;
			}
		}
		if(num1 == num2) {
			System.out.println("GCD "+num1);
		}
	}
}
