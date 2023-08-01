package practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int last=num;
		int count=0;
		for(int i=1;i<=num;i++) {
		
			if(i%2==0) {
			count++;
			}
		}
		if(count==2) {
			System.out.println(last+ " prime number");
			
		}else {
			System.out.println("not a prime number");
		}
		scanner.close();
	}
}
