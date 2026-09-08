import java.util.Scanner;

class Complex_Op 
{
	float real,imag;
	Complex_Op() 
	{
		real = 0;
		imag =0;
	}
	Complex_Op(float comp1,float comp2)
	{
		real = comp1;
		imag =comp2;
	}
	public void AddNumber(Complex_Op c1,Complex_Op c2)
	{	
		float real,image;
		real = (c1.real + c2.real);
		imag = (c1.imag +c2.imag);
		System.out.println("\nAddition of given complex no is :("+real+")+("+imag+")i");
	}
	public void SubNumber(Complex_Op c1,Complex_Op c2)
	{	
		float real,image;
		real = (c1.real - c2.real);
		imag = (c1.imag - c2.imag);
		System.out.println("\nSubstration of given complex no is :("+real+")+("+imag+")i");
	}
	public void MultiplyNumber(Complex_Op c1,Complex_Op c2)
	{	
		float real,image;
		real = (c1.real * c2.real)+(c1.imag * c2.imag);
		imag = (c1.imag * c2.real)+(c1.real * c2.imag);
		System.out.println("\nMultiplaction of given complex no is :("+real+")+("+imag+")i");
	}
	public void divideNumber(Complex_Op c1,Complex_Op c2)
	{	
		float real,image;
		real = ((c1.real * c2.real)+(c1.imag * c2.imag))/((c1.imag * c1.imag)+(c2.imag * c2.imag));
		imag = (c1.imag * c2.real)+(c1.real * c2.imag)/((c1.imag * c1.imag)+(c2.imag * c2.imag));
		System.out.println("\nDivision of given complex no is :("+real+")+("+imag+")i");
	}
}
public class complex
{
	public static void main (String args[])
	{ 
		int choice =0;
		float num1, num2,num3,num4;
		
		Complex_Op cal = new Complex_Op();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first no. (real and imageinary part.\n: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		Complex_Op obj1 = new Complex_Op(num1,num2) ;
		
		System.out.println("\nEnter the secound no. (real and imageinary part.\n: ");
		num3 = input.nextInt();
		num4 = input.nextInt();
		Complex_Op obj2 = new Complex_Op(num3,num4) ;
	
		System.out.println("First number :("+num1+") + ("+num2+")i");
		System.out.println("secound number : ("+num3+") + ("+num4+")i");
		
		
		do{
			
			System.out.println("\n=========Menu========= \n");
			System.out.println("1. Addition\n");
			System.out.println("2. Substraction \n");
			System.out.println("3. Multiplaction\n");
			System.out.println("4. Division\n");
			System.out.println("5. exit\n");
			System.out.println("Choose the opration you want to perform :");
			choice = input.nextInt();
			
			switch(choice)
			{
			case 1:
				cal.AddNumber(obj1,obj2);
				break;
			case 2:
				cal.SubNumber(obj1,obj2);
				break;
			case 3:
				cal.MultiplyNumber(obj1,obj2);
				break;
			case 4:
				cal.divideNumber(obj1,obj2);
				break;
			case 5 :
				System.out.println("Program terminated!");
				break;
			default:
				System.out.println("Invalid choice.Please select valid choice.");
			}
			
	}while(choice != 5);
}
}
