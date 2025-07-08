package if_elsee;
import java.util.Scanner;
public class leap_year {
	public static void main(String[] k)
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enter any year :");
		int a=x.nextInt();
		if(a%4==0 && a%100!=0 || a%100==0 && a%400==0)
		{
			
				System.out.println("Leap year.");
			
		}
		else
		{
			System.out.println("Not a leap year.");
		}
	}

}
