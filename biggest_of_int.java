package NEsted_if;

import java.util.Scanner;

public class biggest_of_int {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter three values : ");
		a=x.nextInt();
		b=x.nextInt();
		c=x.nextInt();
		if(a>b && a>c)
		{
			if(a>b && a>c && a>0 && b>0 && c>0)
			{
				System.out.println("A is big.");
			}
			else if(a>b && a>c && a<=0 || b<=0 || c<=0)
				{
					System.out.println("a is big.\n"+"but we not consider zeroes and negative values.\n"+"please enter positive values.");
				}
		}
		else if(b>a && b>c)
				{
					if(b>a && b>c && b>0 && a>0 && c>0)
					{
						System.out.println("B is big.");
					}
					else if(b>a && b>c && a<=0 || b<=0 || c<=0)
						{
							System.out.println("B is big .\n"+"But we not consider zeroes and negative values.\n"+"Please enter positive values.");
						}
				}
				else if(c>a && c>b)
					{
						 if(c>a && c>b && c>0 && a>0 && b>0)
						 {
							 System.out.println("C is big.");
						 }
						 else if(c>a && c>b && a<=0 || b<=0 || c<=0)
							 {
								 System.out.println("C is big.\n"+" but we not consider zeroes and negative values.\n"+"Please enter positive values.");
							 }
					}
					else if(a==b && a>c)
							{
								if(a==b && a>c && a>0 && b>0 && c>0)
								{
									System.out.println("A and B is equal and big.");
								}
								else if(a==b && a>c && a<=0 || b<=0 || c<=0)
									{
										System.out.println("A and B are equal and big.\n"+"But we not consider zeres and negative values.\n"+"Please enter positive values.");
									}
							}
							else if(a==c && a>b)
								{
									if(a==c && a>b && a>0 && b>0 && c>0)
									{
										System.out.println("A and C are equal and big.");
									}
									else if(a==c && c>a && a<=0 || b<=0 || c<=0)
										{
											System.out.println("A and C are big and equal.\n"+"but we not consider zeroes and negative.\n"+"please enter positive values.");
										}
								}
								else if(b==c && b>a)
										{
											if(b==c && b>a && b>0 && a>0)
											{
												System.out.println("B and C are big and equal.");
											}
											else if(b==c && b>a && b<=0 || a<=0)
													{
														System.out.println("B and C are big and equal.\n"+"But we not consider zeroes and negative values."+"please enter positive values.");
													}
										}
										else if(a==b && a==c)
											{
												if(a==b && a==c && a>0 )
												{
													System.out.println("All three values are equal.");
												}
												else if(a==b && a==c && a<=0)
													{
														System.out.println("All three values are equal.\n"+"but we not consider zeroes and negative values.\n"+"please enter positive values.");
													}
											}
											else
											{
												System.out.println("Enter valid data.");
											}
	}

}
