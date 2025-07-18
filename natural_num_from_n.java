package lloops;

import java.util.Scanner;

public class natural_num_from_n {
	public static void main(String[] k)
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the value from which the numbers to be printed");
		int n=x.nextInt();
		System.out.println("Natural numbers from "+n);
		int i=1;
		while(n>=i)
		{
			System.out.println(n);
			n--;
		}
	}

}
