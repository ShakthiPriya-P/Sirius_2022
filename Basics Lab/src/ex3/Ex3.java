package ex3;

public class Ex3 {
	public static void main(String[] args) {
		//Explicit type casting
		double a=10.0;
		float b = (float) a;
		long c = (long) b;
		int d = (int) c;
		short e = (short) d;
		byte f = (byte) e;
	    System.out.println("double value a: "+a);	
	    System.out.println("float value b: "+b);
	    System.out.println("long value c: "+c);
	    System.out.println("int value d: "+d);
	    System.out.println("short value e: "+e);
	    System.out.println("byte value f: "+f);
	    System.out.println();
	    // Implicit type casting
	    f = 20;
	    e = f;
	    d =e;
	    c =d;
	    b = c;
	    a =b;
	    System.out.println("byte value f: "+f);
	    System.out.println("short value e: "+e);
	    System.out.println("int value d: "+d);
	    System.out.println("long value c: "+c);
	    System.out.println("float value b: "+b);
	    System.out.println("double value a: "+a);
		
	}
}
