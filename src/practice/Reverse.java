package practice;

import java.util.Scanner;

public class Reverse {

	public static void reverse(int num) {
		int rev=0;
		while(num !=0) {
			int last=num%10;
			rev=rev*10+last;
			num=num/10;
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in); 
			int num=scanner.nextInt();
			
			reverse(num);
		scanner.close();
	}
}
