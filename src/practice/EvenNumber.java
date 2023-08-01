package practice;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int first=scanner.nextInt();
		int last=scanner.nextInt();
		System.out.println("Even Numbers");
		for(int i=first;i<=last;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		scanner.close();
	}

}
