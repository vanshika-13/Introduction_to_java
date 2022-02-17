import java.util.*;
class Circle
{
	double radius;
	Circle()
	{
		System.out.println("Using deafault constructor and its default value ->");
		System.out.println("");
		radius = 2;	
	}
	Circle(double r)
	{
		System.out.println("Using parameterised constructor and entered value of radius ->");
		System.out.println("");
		radius = r;	
	}
	void printData()
	{
		System.out.println("Radius of given circle is " + radius);
	}
	void printArea()
	{
		double area = 3.14 * radius * radius;
		System.out.println("Area of given circle is " + area);
	}
	void printPerimeter()
	{
		double circumference = 2*3.14*(radius);
		System.out.println("Circumference of given circle is " + circumference);
	}
	public static void main(String[] a)
	{
		System.out.println("");
		Circle c1 = new Circle();
		c1.printData();
		c1.printPerimeter();
		c1.printArea();
		System.out.println("");
		Circle c2 = new Circle(5);
		c2.printData();
		c2.printPerimeter();
		c2.printArea();
	}
}
