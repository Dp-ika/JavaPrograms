package practice;

public class ArrayPrime {
	public static void main(String[] args) {
		int [] ar= {6,9,1,10,2,4,7,5,12,11};
		for(int i=0;i<ar.length;i++) {
			int count=0;
			for(int j=1;j<=ar[i];j++) {
				if(ar[i]%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(ar[i]);
			}
			
		}
	}

}