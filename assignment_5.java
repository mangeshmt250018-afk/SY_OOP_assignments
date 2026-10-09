import java.util.Scanner;
class Shape
{
	void compute_area()
	{
		System.out.println("Area of a shape");
	}
	
}
class Triangle extends Shape
{
	double base;
	double height;
	Triangle(double base,double height)
	{
		this.base=base;
		this.height=height;
	}
	@Override
	void compute_area()
	{
		double area =0.5*base*height;
		System.out.println("Area of Triangle="+area);
	}
}
class Rectangle extends Shape
{
	double length;
	double width;
	Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	@Override
	void compute_area()
	{
		double area = length*width;
		System.out.println("Area of Triangle=" +area);
	}
}
class Circle extends Shape
{
	double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}
	@Override
	void compute_area()
	{
		double area =Math.PI*radius*radius;
		System.out.println("Area of circle="+area);
	}
}
class main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		
		Shape shape;
		int choice;
		do 
		{
			System.out.println("+++++++Area Calculation++++++");
			System.out.println("1,Triangle");
			System.out.println("2,Rectangle");
			System.out.println("3,Circle");
			System.out.println("4,Exit");
		
			System.out.println("Enter your choice");
			choice=sc.nextInt();
				
			switch (choice)
			{
			
				case 1:
					System.out.println("Enter base of triangle");
					double base = sc.nextDouble();
				
					System.out.println("Enter height of triangle:");
					double height = sc.nextDouble();
				
					shape = new Triangle(base,height);
				
					shape.compute_area();
					break;
				case 2:
					System.out.println("Enter length of rectangle");
					double length = sc.nextDouble();
					
					System.out.println("Enter width of rectangle");
					double width = sc.nextDouble();
					shape= new Rectangle(length,width);
					
					shape.compute_area();
					break;
				case 3:
					System.out.println("Enter radius of circle");
					double radius = sc .nextDouble();
					shape = new Circle(radius);
					shape.compute_area();
					break;
				case 4:
					System.out.println("Program Termineted!");
					break;
				default:
					System.out.println("invalid choice");
			}
		}while(choice != 4);
		sc.close();
	}
}
