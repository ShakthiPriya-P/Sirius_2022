package ex25;
public class Ex25 {
	protected class base { 
		String Method() {
		return "Wow";
		}
	}
	class dervied {
		public void useD() {
			base z = new base();
			System.out.println("base says, " + z.Method()); 
			}
		}
}
