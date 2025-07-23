package Arrays;
import java.util.*;
public class LinearSearchStringa {
	public static void main(String[] arg) {
		String[] arr = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the strings : ");
		for(int i =0; i<arr.length;i++) {
			arr[i] = sc.nextLine();
		}
		System.out.println("Enter the string to be searched");
		String str = sc.nextLine();
		
		int ans = linearSearch(arr,str);
		System.out.println(ans); 
		
		System.out.println("Enter the single string : ");
		String ch = sc.nextLine();
		
		System.out.println("Enter the target character : ");
		char t = sc.next().charAt(0);
	
		int ans1 = charSearch(ch,t);
		System.out.println(ans1);
	}

	static int linearSearch(String[] arr, String str) {
	
	 if(arr.length == 0) {
		 return -1;
	 }
	  
	 for(int i = 0 ;i < arr.length; i++) {
		if(arr[i].equals(str)) {  /// use arr[i].equals(target) for searching string
			return i;
		} 
	 }
	 return -1;
	}
	
	static int charSearch(String ch , char t) {
		
		if(ch.length() == 0) {
			return -1;
		}
		
		for(int i =0 ; i<ch.length();i++) {
			if(t == ch.charAt(i)) { // for searching character at any position
				return i;
			}
		}
		return -1;
	}
}
