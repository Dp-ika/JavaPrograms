package practice;

public class ArithmeticException {
	public static void main(String[] args) {
		int a=1;
		int b=0;
		int res=0;
		try {
			res=a/b;
		} catch (Exception e) {
			System.out.println("Arithmetic Exception");
		}
		
		System.out.println(res);
	}

}
