package ex21;
import java.util.*;
public class Ex21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year");
		int year =sc.nextInt();
		System.out.println("Enter month");
		String month =sc.next().toUpperCase();
		switch(month) {
		case "JANUARY":
		case "MARCH":
		case "MAY":
		case "JULY":
		case "AUGUST":
		case "OCTOBER":
		case "DECEMBER":
			System.out.println(31);
			break;
		case "APRIL":
		case "JUNE":
		case "SEPTEMBER":
		case "NOVEMBER":
			break;
		case "FEBRUARY":
			if (((year % 4 == 0) && !(year % 100 == 0))|| (year % 400 == 0))
				System.out.println(29);
			else
                   System.out.println(28);
            break;
        default:
        	System.out.println("Invalid month");
		}
		sc.close();
		
	}

}
