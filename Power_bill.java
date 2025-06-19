package elsee_if;

import java.util.Scanner;

public class Power_bill {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int cus_id,prev_reading,cur_reading,usuage_units,amount;
		System.out.println("Emter customer ID : ");
		cus_id=x.nextInt();
		System.out.println("Enter previous readings : ");
		prev_reading=x.nextInt();
		System.out.println("Enter Current redaings : ");
		cur_reading=x.nextInt();
		usuage_units=cur_reading-prev_reading;
		
		if(usuage_units>=0 && usuage_units<=50)
		{
			System.out.println("\t_____POWER BILL_____\n"+
								"CUSTOMER ID \t\t=\t"+cus_id+
								"\n PREVIOUS READINGS\t=\t"+prev_reading+
								"\nCURRENT READINGS\t=\t"+cur_reading+
								"\nUSUAGE UNITS\t\t=\t"+usuage_units+
								"\nAMOUNT\t\t\t=\tFREE");
		}
		else if(usuage_units>=51 && usuage_units<=100)
				{
					amount=usuage_units*2;
					System.out.println("\t_____POWER BILL_____\n"+
										"CUSTOMER ID \t\t=\t"+cus_id+
										"\n PREVIOUS READINGS\t=\t"+prev_reading+
										"\nCURRENT READINGS\t=\t"+cur_reading+
										"\nUSUAGE UNITS\t\t=\t"+usuage_units+
										"\nAMOUNT\t\t\t=\t"+amount);
				}
				else if(usuage_units>=101 && usuage_units<=200)
						{
							amount=usuage_units*3;
							System.out.println("\t_____POWER BILL_____\n"+
												"CUSTOMER ID \t\t=\t"+cus_id+
												"\n PREVIOUS READINGS\t=\t"+prev_reading+
												"\nCURRENT READINGS\t=\t"+cur_reading+
												"\nUSUAGE UNITS\t\t=\t"+usuage_units+
												"\nAMOUNT\t\t\t=\t"+amount);
						}
						else if(usuage_units>=201 && usuage_units<=400)
								{
									amount=usuage_units*5;
									System.out.println("\t_____POWER BILL_____\n"+
														"CUSTOMER ID \t\t=\t"+cus_id+
														"\n PREVIOUS READINGS\t=\t"+prev_reading+
														"\nCURRENT READINGS\t=\t"+cur_reading+
														"\nUSUAGE UNITS\t\t=\t"+usuage_units+
														"\nAMOUNT\t\t\t=\t"+amount);
								}
								else if(usuage_units>=401 && usuage_units<=600)
										{
											amount=usuage_units*7;
											System.out.println("\t_____POWER BILL_____\n"+
																"CUSTOMER ID \t\t=\t"+cus_id+
																"\n PREVIOUS READINGS\t=\t"+prev_reading+
																"\nCURRENT READINGS\t=\t"+cur_reading+
																"\nUSUAGE UNITS\t\t=\t"+usuage_units+
																"\nAMOUNT\t\t\t=\t"+amount);
										}
										else
										{
											System.out.println("Please enter valid data.");
										}
		

	}  // close main

}  // close class
