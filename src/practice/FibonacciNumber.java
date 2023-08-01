package practice;

import java.util.Scanner;

public class FibonacciNumber {
	
	public static void fibo(int num) {
		int a=0;
		int b=1;
		int res=0;
		for(int i=2;i<=num;i++) {
			res=a+b;
		
		if(res==a+b) {
			System.out.println(res+" ");
			a=b;
			b=res;
		}
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number");
		int num=scanner.nextInt();
		
		fibo(num);
		scanner.close();
	}

}
