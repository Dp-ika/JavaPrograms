package practice;

public class ArrayIndexOutofBoundException {
	public static void main(String[] args) {
		int []ar= {1,2,3,5,6};
		for(int i=0;i<=ar.length;i++) {
			System.out.println(ar[6]);
		}
	}

}
