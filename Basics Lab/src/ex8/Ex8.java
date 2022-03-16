package ex8;
import java.util.*;
public class Ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element:");
		int elt=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<n;i++) {
			if(arr[i]==elt) {
				System.out.println("Index:"+i);
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("Element not found");
		}
		sc.close();
	}
}
