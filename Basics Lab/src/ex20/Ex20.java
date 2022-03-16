package ex20;
import java.util.*;
public class Ex20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
	
		}
		for(int i=0;i<n;i++) {
			int large=arr[i][0];
			for(int j=1;j<n;j++) {
				if(arr[i][j]>large) {
					large = arr[i][j];
				}
			}
			System.out.println("Largest number in row "+i+" is "+large);
			sc.close();
		}
	}
}
