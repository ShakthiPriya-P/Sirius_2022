package ex11;
import java.util.*;
public class Ex11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr = new int[n][];
		for(int i=0;i<n;i++) {
			arr[i] = new int[i+1];
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		sc.close();
	}
}
