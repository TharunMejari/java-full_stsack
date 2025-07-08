package lloops;

import java.util.Scanner;

public class odd_num_upto_n {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the value upto the odd numbers to be printed.");
		int n=x.nextInt();
		int i=1;
		while(n>=1)
		{
			System.out.println(n);
			n=n-2;
		}
	}

}
