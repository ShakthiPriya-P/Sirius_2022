package ex17;
public class Ex17b {
 
  public static void main(String[] args) {
    Example obj=new Example();
    obj.nonStatic();
  }
}
class Example{
	public static int number = 10;
	 
	public void nonStatic() {
		System.out.println(number);
	}
}
