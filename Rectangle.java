import java.util.*;
class Rectangle
{
	int length;
	int breadth;
	Rectangle()
	{
		System.out.println("Using deafault constructor and its's values ->");
		System.out.println("");
		length = 2;
		breadth = 3;	
	}
	Rectangle(int l,int b)
	{
		System.out.println("Using parameterised constructor and entered values ->");
		System.out.println("");
		length = l;
		breadth = b;	
	}
	void printData()
	{
		System.out.println("Length of given rectangle is " + length);
		System.out.println("Breadth of given rectangle is " + breadth);
	}
	void printArea()
	{
		int area = length * breadth;
		System.out.println("Area of given rectangle is " + area);
	}
	void printPerimeter()
	{
		int perimeter = 2*(length + breadth);
		System.out.println("Perimeter of given rectangle is " + perimeter);
	}
	public static void main(String[] a)
	{
		System.out.println("");
		Rectangle r1 = new Rectangle();
		r1.printData();
		r1.printPerimeter();
		r1.printArea();
		System.out.println("");
		Rectangle r2 = new Rectangle(5,4);
		r2.printData();
		r2.printPerimeter();
		r2.printArea();
	}
}
