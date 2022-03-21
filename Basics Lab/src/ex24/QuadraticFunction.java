package ex24;
import java.util.*;
public class QuadraticFunction {
	int a,b,c;
	public QuadraticFunction(){
		a=1;
		b=1;
		c=1;
	}
	public QuadraticFunction(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x: ");
		int x=sc.nextInt();
		QuadraticFunction obj=new QuadraticFunction(2,3,4);
		System.out.println(obj.calculate(x));
		obj.extractor();
		sc.close();
	}
	public int calculate(int x) {
		return(a*x*x+(b*x)+c);
	}
	public void extractor() {
		System.out.println("a: "+a+" b: "+b+" c: "+c);
	}
}
