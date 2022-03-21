package ex27;
public class Investment {
	public static void main(String[] args) {
		float investAmount=14000;
		float yr1 = investAmount+(investAmount*0.4F);
		float yr2= yr1-1500;
		float yr3 = yr2+(yr2*0.12F);
		System.out.println("Amount at the end of third year is : $"+yr3);
	}
}
