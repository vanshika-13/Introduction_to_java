interface Triangle
{
    double area();
    double perimeter();
}
    abstract class Isosceles 
{
    	private double  longSide,equalSide;
    	public double perimeter()
	{
        		return longSide + 2 * equalSide;
    	}
   	public void setsides(double l,double e)
	{
        		longSide = l;
        		equalSide = e;
    	}
    	public double getLongside()
	{
        		return longSide;
    	}
    	public double getEqualSide()
	{
        		return equalSide;
    	}
}
interface Right extends Triangle
{
    	double[] angles();
}
public class RightIsosceles extends Isosceles implements Right
{
    	public double area()
	{
        		return getEqualSide() * getLongside() * 0.5;
    	}
    	public double[] angles()
	{
        		double angle[]={90,45,45};
        		return angle;
    	}
    	public static void main(String[] args) 
	{
        		RightIsosceles r1=new RightIsosceles();
        		r1.setsides(9, 3);
        		System.out.println("the area of the triangle is " + r1.area());
        		System.out.println("the perimeter of the triangle is" + r1.perimeter());
        		double[] angles=r1.angles();
        		for (double element: angles) 
		{
            			System.out.println(element);
        		}
    	}
}
