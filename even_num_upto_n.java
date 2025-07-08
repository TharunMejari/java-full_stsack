package lloops;

import java.util.Scanner;

public class even_num_upto_n {
	public static void main(String[] k)
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the value upto where the number sto be printed.");
		int n=x.nextInt();
		System.out.println("Even numbers upto"+n);
		int i=0;
		while(i<=n)
		{
			System.out.println(i);
			i=i+2;
		}
	}

}
