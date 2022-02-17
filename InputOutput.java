import java.io.IOException;
class CirclesWithException
{
	private static double radius;
	CirclesWithException(double r)
	{
		setRadius(r);
	}
	void setRadius(double r)
	{
		if(r<0)
		throw new IllegalArgumentException("the radius of a circle cannot be negative");
		radius=r;
	}
	double getRadius()
	{
		return radius;
	}
	void printRadius()
	{
		System.out.println(radius);
	}
}
public class Q2
{
	public static void main(String[] args)
	{
		try
		{
			CirclesWithException p = new CirclesWithException(7.9);
			p.printRadius();
			CirclesWithException z = new CirclesWithException(0);
			z.printRadius();
			CirclesWithException n = new CirclesWithException(-5);
			n.printRadius();
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
