package ex7;
import java.util.*;
public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter 1 for ascending 2 for descending:");
		int sort=sc.nextInt();
		if(sort==1) {
			for(int i=0;i<n;i++) {
				for(int j=i+1; j<n;j++)
				{
					if(arr[i]>arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		else {
			for(int i=0;i<n;i++) {
				for(int j=i+1; j<n;j++)
				{
					if(arr[i]<arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		System.out.println("Sorted array:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}
