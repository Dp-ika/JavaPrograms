package practice;

import java.util.Scanner;

public class PrimeFlag {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		for(int i=2;i<num;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
				}
			}
			if(isPrime) {
				System.out.println(i);
			}
		}
	}
}
