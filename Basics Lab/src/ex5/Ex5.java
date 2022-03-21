package ex5;
import java.util.*;
public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Ex5 obj=new Ex5();
		int n =sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		obj.avg(arr,n);
		sc.close();
	}
	public void avg(int arr[],int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		System.out.println("Average :"+(sum/n));
	}
}
