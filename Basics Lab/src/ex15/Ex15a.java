package ex15;
import java.lang.Math;
public class Ex15a {
	public static void main(String[] args) {
		for(int n=2;n<=100;n++) {
			boolean flag=true;
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(n);
			}
			
		}
	}
}
