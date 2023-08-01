package practice;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		int count=0;
		for(int i=1;i<=num;i++) {
			int last=num%10;
			int last1=last;
			int last2=last;
			while(last>0) {
				count++;
				num/=10;
			}
			int count1=count;
			int product=1;
			int sum=0;
			while(last1>0) {
				int rem=last1%10;
				while(count1>0) {
					product=product*rem;
					count1--;
				}
				sum=sum+product;
				product=1;
				count1=count;
				last1=last1/10;
			}
			if(sum==last2) {
				System.out.println(i+" ");
			}
		}
		
			
		
	}

}
