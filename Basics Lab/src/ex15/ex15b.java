package ex15;
import java.util.*;
import java.lang.Math;
public class ex15b {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag = false;
		//Armstrong Number
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
			flag=true;
		}
		//Perfect Number
		sum=0;
		for(int i=1;i<n;i++) {           
            if(n%i==0) {                              
                sum += i;           
            }         
        }            
        if (sum==n) {  
            System.out.println("Perfect number");  
            flag=true;
        }
       //Palindrome 
        temp=n;
        int reverse=0;
        while(temp>0) {
        	reverse=(reverse*10)+temp%10;
        	temp/=10;
        }
        if(n==reverse) {
        	System.out.println("Palindrome Number");
        	flag=true;
        }
        if(!flag) {
        	System.out.println("None of these");
        }
        sc.close();
	}
}
