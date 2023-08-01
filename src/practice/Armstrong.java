package practice;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int num1=num;
		int num2=num;
		int count=0;
		while(num!=0) {
			count++;
			num=num/10;
		}
		int count1=count;
		int product=1;
		int sum=0;
		
		while(num1!=0) {
			int last=num1%10;
			while(count1!=0) {
			product=product*last;
			count1--;
			}
			sum=sum+product;
			product=1;
			num1=num1/10;
			count1=count;
		}
		if(num2==sum) {
			System.out.println("armstrong");
		}else {
			System.out.println("NOT Armstrong");
		}
		scanner.close();
	}

}
