package lloops;

import java.util.Scanner;

public class leap_years_btw {
	public static void main(String[] k)
	{
		int n=2000;

		while(n<=2025)
		{
			if(n%4==0 && n%100!=0)
					{
			
				System.out.println(n);
					}
			n++;
		}
	}

}
