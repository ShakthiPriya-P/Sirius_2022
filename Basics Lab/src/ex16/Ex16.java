package ex16;
import java.util.*;
public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element:");
		int elt=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==elt) {
				count+=1;
				if(count==1) {
					System.out.println("Element present at :"+i);
				}
			}
		}
		if(count==0) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element occurs "+count+" times");
		}
		sc.close();
	}

}
