package basicPrograms;
import java.util.*;
public class palindrome {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		
		int i = 0 ;
		int j = str.length()-1;
		
		while(i<j) {
			
			if(str.charAt( i ) != str.charAt(j)) {
				System.out.println("not a palindrom");
				return; // if not put return it will print is palindrome
			}
			i++;
			j--;
		}
		System.out.println("is palindrome");
	}
	}

