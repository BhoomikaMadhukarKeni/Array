package basicPrograms;

import java.util.Scanner;

public class Factorial {
	public static void main() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num = sc.nextInt();
	int fact = 1;
	for(int i = 1; i<= num; i++) {
		fact = fact* i;
	}
	System.out.println(fact);
	}
}
