package ex15;
import java.util.*;
import java.lang.Math;
public class ex15b {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int digits=0;
		while(temp>0) {
			digits+=1;
			temp/=10;
		}
		temp=n;
		int sum=0;
		while(temp>0) {
			sum+=Math.pow(temp%10,digits);
			temp/=10;
		}
		if(n==sum) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
		sum=0;
		for(int i=1;i<n;i++) {           
            if(n%i==0) {                              
                sum += i;           
            }         
        }            
        if (sum==n) {  
            System.out.println("Perfect number");         
        }
        else
        {                      
            System.out.println("Not a perfect number");    
        }  
        sc.close();
	}
}
