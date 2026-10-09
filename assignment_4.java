import java.util.Scanner;
interface myinterface 
{
	public void accept();
	public void display();
}
class fan implements myinterface
{
	int speed;
	String fanswitch;
	
	public void accept ()
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the speed of fan");
		this.speed = sc.nextInt();
		System.out.println("Enter is fan on or off");
		this.fanswitch =sc.next();
		
	}
	
	public void display()
	{
		System.out.println("Speed of Fan:" + speed);
		System.out.println("Fan switch: " +fanswitch);
	}
}
class AC implements myinterface 
{
	int degree;
	String acSwitch;
	
	public void accept ()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature of AC");
		this.degree = sc.nextInt();
		System.out.println("Enter AC on or Off");
		this.acSwitch =sc.next();
	}
	public void display()
	{
		System.out.println("Temperature of AC:" + degree);
		System.out.println("AC switch: " + acSwitch);
	}
}
class Light implements myinterface
{
	String lighttype;
	String lightswitch;
	
	public void accept()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the light type");
		this.lighttype =sc.next();
		System.out.println("Enter is Light  ON orOFF");
		this.lightswitch = sc.next();
	}
	public void display() 
	{	
		System.out.println("Type of Light:" +lighttype);
		System.out.println("Light Switch: " +lightswitch);
	}
}
public class assignment4
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int choice =0;
		do{
			System.out.println("****MENU****");
			System.out.println("1,Fan");
			System.out.println("2,AC");
			System.out.println("3,Light");
			System.out.println("4,Exit");
			
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			
			switch (choice)
			{
				case 1:
					fan f = new fan();
					f.accept();
					f.display();
					break;
				case 2:
					AC ac = new AC();
					ac.accept();
					ac.display();
					break;
				case 3:
					Light light = new Light();
					light.accept();
					light.display();
					break;
				case 4:
					default:
					break;
			}
		  }while (choice != 4);
		  sc.close();
	}
}