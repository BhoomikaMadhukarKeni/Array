package basicPrograms;
import java.util.*;
public class Amstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int original = num;
		int temp;
		int amstrong = 0;
		
		while(num > 0){
			temp = num % 10 ;
			temp = (int) Math.pow(temp,3);
			amstrong += temp;
			num = num/10;
		}
		
		if(amstrong == original) {
		System.out.println("Number is amstrong");
	}else {
		System.out.println("not an amstrong");
	}
}
}
