package practice;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		int sum=0;
		int product=num*num;
		while(product>0) {
			int last=product%10;
			
				sum=sum+last;
				product/=10;
		}
		
		
		if(sum==num) {
			System.out.println("NEON number");
		}else {
			System.out.println("NOt a Neon number");
		}
		
	}

}
