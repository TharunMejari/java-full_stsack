package lloops;

import java.util.Scanner;

public class even_odd_deec_from_n {
	public static void main(String[] k)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("User please enter any value : ");
		int n=sc.nextInt();
		int i=n;
		if(i%2==0)
		{
			System.out.println("Even numbers in decending order from "+i);
			while(i>=0)
			{
				System.out.println(i);
				i=i-2;
			}
			i=n;
			int x=i-1;
			System.out.println("Odd numbers in decending order from : "+i);
			while(x>=0)
			{
				System.out.println(x);
				x=x-2;
			}
		}
		else
		{
			System.out.println("Odd numbers in decending order from : "+i);
			while(i>=0)
			{
				System.out.println(i);
				i=i-2;
			}
			i=n;
			int y=i-1;
			System.out.println("Even numbers in decending order from : "+i);
			while(y>=0)
			{
				System.out.println(y);
				y=y-2;
			}
		}
	}

}
