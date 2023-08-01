package practice;

import java.util.Scanner;

public class ArmstrongNumbers {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		for(int i=1;i<=num;i++) {
			int i1=i;
			int i2=i;
			int count=0;
			while(i2!=0) {
				i2=i2/10;
				count++;
			}
			int product=1;
			int sum=0;
			int count1=count;
			while(i1!=0) {
				int last=i1%10;
				while(count1!=0) {
					product=product*last;
					count1--;
				}
				sum=sum+product;
				count1=count;
				product=1;
				i1=i1/10;
			
			}
			if(i==sum) {
				System.out.print(i+" "
						);
			}
		}
	}

}
