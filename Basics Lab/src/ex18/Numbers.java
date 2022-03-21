package ex18;
import java.util.*;
public class Numbers {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String[] arr = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
		System.out.println("Enter number:");
		String num=sc.next();
		for(int i=0;i<num.length();i++) {
			System.out.print(arr[Character.getNumericValue(num.charAt(i))]+" ");
		}
		sc.close();
	}
}
