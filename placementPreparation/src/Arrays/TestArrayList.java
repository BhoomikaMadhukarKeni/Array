package Arrays;
import java.util.*;
public class TestArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
	   for(int i = 0; i<= 10; i++) {
		   list.add(sc.nextInt());
	   }
	   
	   for(int i = 0 ; i <= 10; i++) {
		   System.out.println(list.get(i)); // get the element by the index
	   }
	   System.out.println(list+" ");
	}
}
