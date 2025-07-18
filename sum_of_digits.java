package forr_looop;

import java.util.Scanner;

public class sum_of_digits {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=x.nextInt();
		int s=0;
		for(int i=n;i>0;)
		{
			int d=i%10;
			s=s+d;
			i=i/10;
		}
		System.out.println(s);

	}

}
