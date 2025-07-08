package lloops;

import java.util.Scanner;

public class even_num_in_dec_ord {
	public static void main(String[] k)
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the value from which the numbers to be printed");
		int n=x.nextInt();
		System.out.println("Even numbers in decending order from "+n);
		int i=0;
		while(n>=i)
		{
			System.out.println(n);
			n=n-2;
		}
	}

}
