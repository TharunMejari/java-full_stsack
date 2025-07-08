package lloops;

import java.util.Scanner;

public class natural_num_upto_n {
	public static void main(String[] k)
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enter value upto which the numbers to be printed");
		int n=x.nextInt();
		System.out.println("Natural numbers upto "+n);
		int i=0;
		while(n>=i)
		{
			System.out.println(i);
			i++;
		}
	}

}
