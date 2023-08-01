package practice;
//write a javaa program to print reverse number
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int n=num;
		int rem=0;
		int rev=0;
		while(num!=0) {
			rem=num%10;
			System.out.print(rem);
			num=num/10;
		}
		
		scanner.close();
	}
}
