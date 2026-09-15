import java.util.Scanner;
class Bag
{
	String colour ;
	double wt;
	
	static int total_count = 0;
	static double total_wt = 0;
	
	
	Bag ()
	{
		colour = "red";
		wt = 1.0;
		total_count ++;
		total_wt ++;
	}
	Bag(String colour,double wt)
	{
		this.colour = colour;
		this.wt = wt;
		total_count ++;
		total_wt ++;
	}
	
	void display()
	{
		System.out.println("Bag colour :"+ colour);
		System.out.println("Bag weight :"+wt+"kg");
	}
	void total()
	{
		System.out.println("Bag colour :"+ total_count);
		System.out.println("Total Bag weight :"+total_wt+"kg");
	}
}
class main
{
	public static void main(String[] args)
	{
		int choice;
		String colour;
		Scanner input = new Scanner(System.in);
		System.out.println("\nEnter the colour of the Bag :");
		colour = input.nextLine();
				
		System.out.println("Enter the weight of the Bag :");
		double wt = input.nextDouble();
		do{
			System.out.println("\n=========Menu========= \n");
			System.out.println("1. Default\n");
			System.out.println("2. Parameterize\n");
			System.out.println("3. exit\n");
			System.out.println("Enter your choice :");
			choice = input.nextInt();
			switch(choice)
			{
			case 1:
				Bag b1 = new Bag();
				System.out.println("=====================================");
				System.out.println("default constructur\n");
				
				b1.display();
				b1.total();
				System.out.println("=====================================");
				break;
			case 2:
				
				Bag b2 = new Bag(colour,wt);
				System.out.println("\n=====================================");
				System.out.println("parameterize constructor\n");
				
				b2.display();
				b2.total();
				System.out.println("=====================================");
				break;
			case 3 :
				System.out.println("Program terminated!");
				break;
				
			default:
				System.out.println("Invalid choice.Please select valid choice.");
			
			}
		
		}while (choice!= 3);
	}
}

