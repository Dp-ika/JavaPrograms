package practice;

import java.util.Scanner;

public class StringClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			//rev=rev+str.charAt(i);
			rev=rev.concat(str.charAt(i)+"");
			System.out.print(rev.concat(str.charAt(i)+" "));
		}
		System.out.println();
		System.out.println(rev);
	}
}
