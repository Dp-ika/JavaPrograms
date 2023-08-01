package practice;
//WRITE A JAVA PROGRAM TO FIND EVEN NUMBER FROM THE ARRAY
public class ArrayEvenNumber {
	public static void main(String[] args) {
		int[] ar= {5,6,8,9,7,2,4};
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				System.out.println(ar[i]);
			}
			//System.out.println(ar[i]);
		}
	}
}
