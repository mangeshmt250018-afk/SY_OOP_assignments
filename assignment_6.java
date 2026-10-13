import java.util.Scanner;

class DivisionByZeroException extends Exception
{
	DivisionByZeroException()
	{
		super("DivisionByZeroException : Division By zero.");
	}
	DivisionByZeroException(String msg)
	{
		super(msg);
	}
}

class InvalidNumberFormatException extends Exception
{
	InvalidNumberFormatException()
	{
		super("InvalidNumberFormatException :  Invalid Number Format Exception.");
	}
	InvalidNumberFormatException(String msg)
	{
		super(msg);
	}
}

class Calculation 
{
	static int num1,num2;
	
	void input() throws InvalidNumberFormatException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1:");
		
		if ( !sc.hasNextInt())
		{
			throw new InvalidNumberFormatException();
		}
		num1 = sc.nextInt();
		
		System.out.println("Enter number 2:");
		if ( !sc.hasNextInt())
		{
			throw new InvalidNumberFormatException();
		}
		num2 = sc.nextInt();
		
	}
	void Calculation () throws DivisionByZeroException{}
}

class Addition extends Calculation 
{
	public void Calculation()
	{
		int sum = num1 + num2;
		
		System.out.println("The Addition of "+ num1 +" and "+ num2 +" is :"+sum+"\n");
	}
}

class Subtraction extends Calculation 
{
	public void Calculation()
	{
		int sub = num1 - num2;
		
		System.out.println("The Substraction of "+ num1 +" and "+ num2 +" is :"+sub+"\n");
	}
}

class Multiplication extends Calculation 
{
	public void Calculation()
	{
		int mul = num1 * num2;
		
		System.out.println("The Multiplication of "+ num1 +"and"+ num2 +" is :"+mul+"\n");
	}
}

class Division extends Calculation 
{
	public void Calculation()
	{
		float div = num1 / num2;
		
		System.out.println("The Division of "+ num1 +"and"+ num2 +" is :"+div+"\n");
	}
}

class Reminder extends Calculation
{
	public void Clculation ()
	{
		int reminder = num1% num2;
		
		System.out.println("The Reminder of "+ num1 +"%"+ num2 +" is :"+reminder+"\n");
	}
}

class main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		 int choice = 0;
		 while (choice != 6)
		 {
		 	System.out.println("======MENU======");
		 	System.out.println("1.Addition");
		 	System.out.println("2.Substraction");
		 	System.out.println("3.Multiplication");
		 	System.out.println("4.Division");
		 	System.out.println("5.Reminder");
		 	System.out.println("6.Exit");
		 	
		 	System.out.println("Enter your choice :");
		 	choice = sc.nextInt();
		 	
		 	Calculation calculation = new Calculation();
		 	
		 	try
		 	{
		 		if (choice != 6)
		 		{
		 			calculation.input();
		 		}
		 		switch(choice)
			 		{
			 			case 1:
			 				Addition addition = new Addition ();
			 				addition.Calculation();
							break;
						case 2:
							Subtraction substraction = new Subtraction();
							substraction.Calculation();
							break;
						case 3 :
							Multiplication multiplaction = new Multiplication();
							multiplaction.Calculation();
							break;
							
						case 4:
							Division division = new Division ();
							division.Calculation();
							break;
							
						case 5 :
							Reminder reminder = new Reminder();
							reminder.Calculation();
							break;
							
						case 6 :
							System.out.println("The program Terminated!");
							break;
					}
				
					
		 	}	
		 	catch(InvalidNumberFormatException e)
		 	{
		 		System.out.println(e);
		 	}
		 	catch(DivisionByZeroException e)
		 	{
		 		System.out.println(e);
		 	}
		 		
			}
			sc.close();
	}
		
}
