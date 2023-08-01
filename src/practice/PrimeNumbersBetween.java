package practice;

import java.util.Scanner;

public class PrimeNumbersBetween {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter start digit");
		int start=scanner.nextInt();
		System.out.println("Enter end digit");
		int end=scanner.nextInt();
		for(int i=start;i<end;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%2==0) {
					System.out.println("not prime");
					break;
				}
			}
			if(i==2) {
				System.out.print(i);
			}
		}
	}
}
