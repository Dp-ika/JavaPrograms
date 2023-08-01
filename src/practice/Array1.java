package practice;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int a=scanner.nextInt();
		int []ar=new int[a];
		for(int i=0;i<a;i++) {
			ar[i]=scanner.nextInt();
		}
		for(int i=0;i<a;i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
