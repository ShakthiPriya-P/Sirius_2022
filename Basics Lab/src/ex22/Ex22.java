package ex22;
class Example{
	public int publicVar=10;
	private int privateVar=10;
	protected int protectedVar=10;
	public void publicMethod(){
		System.out.println("Public method");
	}
	private void privateMethod(){
		System.out.println("Private method");
	}
	protected void protectedMethod(){
		System.out.println("Protected method");
	}
}
public class Ex22 {
	public static void main(String[] args) {
		Example obj=new Example();
		System.out.println(obj.publicVar);
		//System.out.println(obj.privateVar);
		System.out.println(obj.protectedVar);
		obj.publicMethod();
		//obj.privateMethod();
		obj.protectedMethod();
	}
}
