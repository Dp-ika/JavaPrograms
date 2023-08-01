package practice;

import java.util.Scanner;

public class NumberReverse {

	public static void reverse(int num) {
		int n=num;
		int rev=0;
		while(num!=0) {
			int last=num%10;
			rev=rev*10+last;
			num=num/10;
		}
		if(n==rev) {
		System.out.println(rev+" is Palindrome number");
		}else {
			System.out.println(rev+" Not Palindrome number");
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		reverse(num);
		scanner.close();
	}
}
