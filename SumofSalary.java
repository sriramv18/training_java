import java.util.Scanner;
public class SumofSalary{
	public static void main(String[] args)
	{
			int ram,kane,raina,inc,max,desc,findmax,findmin,Nthmax,acsc;
						/********Input field*********/
		Scanner a = new Scanner(System.in);					
		Scanner b = new Scanner(System.in);
		Scanner c = new Scanner(System.in);
		Scanner d = new Scanner(System.in);								
		Scanner e = new Scanner(System.in);
		Scanner f = new Scanner(System.in);
		Scanner g = new Scanner(System.in);
				System.out.println("Enter the Ram:");
			ram = a.nextInt();
				System.out.println("Enter the Kane:");
			kane = b.nextInt();
				System.out.println("Enter the Raina:");		
			raina = c.nextInt();															
				System.out.println("Search the Employee Salary");	
			max = d.nextInt();
				System.out.println("Employee Salary Increment Precentage");
			inc = e.nextInt();	
					 	/************Input Get the field***********/
			if(ram >= max){											//Maxmimum of salary check
				System.out.println("Ram Is Maximum of Salary");
			}else if(kane >= max){
				System.out.println("Kane Is Maximum of Salary");
			}else if(raina >=max){
				System.out.println("Raina Is Maximum of Salary");
			}else{
				System.out.println("No Data");
			}
			if(ram <= max){											//Minimum of Salary Check
				System.out.println("Ram Is Minimum of Salary");
			}else if(kane <= max){
				System.out.println("Kane Is Minimum of Salary");
			}else if(raina <= max){
				System.out.println("Raina Is Minimum of Salary");
			}else{
				System.out.println("No Data");
			}		
			double TotalSalary =  ram+kane+raina;					//Calculate employee Total Salary
			double PrecCalc = (double)(inc/100.0);
			System.out.println("increment per "+PrecCalc);
			double incram = (ram*PrecCalc);
			double inckane = (kane*PrecCalc);
			double incraina = (raina*PrecCalc);
				System.out.println("Ram Increment Salary "+(incram+ram));		// Increment Each employee salary
				System.out.println("Kane Increment Salary "+(inckane+kane));
				System.out.println("Raina Increment Salary "+(incraina+raina));
				System.out.println("Sum of Salary "+TotalSalary);				
				System.out.println("avarage of Salary "+TotalSalary/3.0);
								/**********Decrement Precentage******/
				System.out.println("Employee Salary Decrement Precentage");
			desc = f.nextInt();	
								/***************End Of Precentage****/
			double PrecCalcalution = (double)(desc/100.0);
			double descram = (ram*PrecCalcalution);
			double desckane = (kane*PrecCalcalution);
			double descraina = (raina*PrecCalcalution);
				System.out.println("Ram Increment Salary "+(ram-descram));		// Decrement Each employee salary
				System.out.println("Kane Increment Salary "+(kane-desckane));
				System.out.println("Raina Increment Salary "+(raina-descraina));
				
					
					for (acsc = 0; acsc < 3; acsc++)
					{
						if (kane < ram)
						{
							Nthmax = ram;
							ram = kane;
							kane = Nthmax;
						}

						if (raina < kane)
						{
							Nthmax = kane;
							kane = raina;
							raina = Nthmax;
						}

    
					}
							System.out.println("Ascending "+ram+" "+kane+" "+raina);
							System.out.println("Descending "+raina+" "+kane+" "+ram);
							System.out.println("Enter the Nth Maximum of Salary");
				findmax = f.nextInt();
				switch(findmax)
				{
					case 1: 
							System.out.println("Nth Maximum of Salary Raina: "+raina);
							break;
					case 2: 
							System.out.println("Nth Maximum of Salary Kane: "+kane);
							break;
					case 3: 
							System.out.println("Nth Maximum of Salary Ram: "+ram);
							break;
					default:
							System.out.println("No Data");
							break;
				}
							System.out.println("Enter the Nth Minimum of Salary");
				findmin = f.nextInt();
				switch(findmin)
				{
					case 1: 
							System.out.println("Nth Minimum of Salary Ram: "+ram);
							break;
					case 2: 
							System.out.println("Nth Maximum of Salary Kane: "+kane);
							break;
					case 3: 
							System.out.println("Nth Maximum of Salary Raina: "+ raina);
							break;
					default:
							System.out.println("No Data");
							break;
				}
					
					
				}
			
		/* *FindMax Salary */
		
			// findmax = f.nextInt();
				
					
			
}
