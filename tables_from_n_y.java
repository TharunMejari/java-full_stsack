package forr_looop;

import java.util.Scanner;

public class tables_from_n_y {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter Starting and ending values : ");
		int n=x.nextInt();
		int y=x.nextInt();
		for(int i=n;i<=y;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}
		

	}

}
