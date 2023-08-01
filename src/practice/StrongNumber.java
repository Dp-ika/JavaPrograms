package practice;

import java.util.Scanner;

public class StrongNumber {

	public static int factorial(int num) {
		int fact=1;
		while(num>0) {
			fact=fact*num;
			num--;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int n=num;
		int sum=0;
		int temp=n;
		while(n>0) {
			int r=n%10;
			sum=sum+factorial(r);
			n/=10;
		}
		System.out.println("Factorial is :"+sum);
		if(temp==sum) {
			System.out.println("Strong number");
		}else {
			System.out.println("Not Strong number");
		}
	}
}
