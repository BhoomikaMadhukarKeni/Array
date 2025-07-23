package basicPrograms;
import java.util.*;
public class ReverseOfDigit {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the nummber");
	long temp;
	long reverse = 0;
	long num = sc.nextInt();
	while(num > 0) {
	temp = num % 10;
	reverse = reverse * 10 + temp;
	num = num / 10;
	}
	
	System.out.println(reverse);
	
	}
}
