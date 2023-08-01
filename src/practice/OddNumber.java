package practice;

import java.util.Scanner;

public class OddNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int first=sc.nextInt();
		int last=sc.nextInt();
		System.out.println("Odd NUmbers");
		for(int i=first;i<=last;i++) {
			
			if(i%2!=0) {
			
				System.out.println(i);
			}
			
//			}else {
//				System.out.println("Odd NUmber"+i);
//			}
		}
		sc.close();
	}
}
