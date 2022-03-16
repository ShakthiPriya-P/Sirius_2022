package ex13;
import java.util.*;
public class Ex13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students:");
		int m=sc.nextInt();
		System.out.println("Enter number of subjects:");
		int n=sc.nextInt();
		int[][] arr = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++) {
			int total=0;
			for(int j=0;j<n;j++) {
				total+=arr[i][j];
			}
			System.out.println("Student "+(i+1)+" total marks: "+total);
		}
		sc.close();
	}
}
