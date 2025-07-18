package forr_looop;

import java.util.Scanner;

public class even_odd_in_dec_from_n {

	public static void main(String[] args) {
		Scanner x=new Scanner (System.in);
		System.out.println("Enter any value to print even and odd numbers : ");
		int n=x.nextInt();
		if(n%2!=0) 
		{
			System.out.println("Odd numbers : ");
		for(int i=n;i>=0;i-=2)
		{
			System.out.println(i);
		}
		System.out.println("Even Numbers : ");
		for(int j=n-1;j>=0;j-=2)
		{
			System.out.println(j);
		}
		}
		else
		{
			System.out.println("Even numbers : ");
			for(int i=n;i>=0;i-=2)
			{
				System.out.println(i);
			}
			System.out.println("Odd numbers : ");
			for(int j=n-1;j>=0;j-=2)
			{
				System.out.println(j);
			}
		}
		

	}

}
