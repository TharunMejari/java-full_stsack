package lloops;

import java.util.Scanner;

public class tables_from_n_to_n {
	public static void main(String[] k)
	{
		Scanner x=new Scanner (System.in);
		int n,y;
		System.out.println("User please enter the value t be started from : ");
		n=x.nextInt();
		System.out.println("User please enter the value to ne printed upto : ");
		y=x.nextInt();
		while(n<=y)
		{
			int a=0;
			while(a<=10)
			{
				System.out.println(n+"*"+a+"="+(n*a));
				a++;
			}
			System.out.println();
			n++;
		}
		
	}

}
