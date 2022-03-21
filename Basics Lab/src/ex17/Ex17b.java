package ex17;
public class Ex17b {
 
  public static void main(String[] args) {
    Example obj=new Example();
    obj.nonStatic();
  }
}
class Example{
	public int number = 10;
	 
	public static void nonStatic() {
		System.out.println(number);
	}
}
