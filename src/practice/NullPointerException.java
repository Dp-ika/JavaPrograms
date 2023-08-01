package practice;

public class NullPointerException {

	public static void main(String[] args) {
		String  b=null;
		try {
			b.toLowerCase();
		} catch (Exception e) {
			System.out.println("NullPointerException");
		}
		System.out.println(b);
	}
}
