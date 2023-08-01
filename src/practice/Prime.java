package practice;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		
		int i;
		if(num==1) {
			System.out.println("1 Is Not Prime number & the Prime number starts from 2");
		}
		for(i=2;i<num;i++) {
			
			if(num%i==0) {
			System.out.println("Not Prime Number");
			break;
			}
		}
			if(num==i) {
				System.out.println(i+" :Prime");
		}
			scan.close();
	}
}
