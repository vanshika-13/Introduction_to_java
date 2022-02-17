import java.time.Instant;
import java.util.Date;
import java.util.*;
class GeometricObject 
{
	private String color;
	private Date dateCreated;
	public GeometricObject()
	{
		color = "white";
        		dateCreated = Date.from(Instant.now());
    	}
	public GeometricObject(String color, Date dateCreated)
	{
        		this.color = color;
        		this.dateCreated = dateCreated;
	}
	public String getColor()
	{
        		return color;
	}
	public Date getDateCreated()
	{
        		return dateCreated;
	}
}
class RightangleTriangle extends GeometricObject
{
	private double baze;
	private double hite;
	public RightangleTriangle()
	{
        		baze = 3;
        		hite = 5;
	}
	public RightangleTriangle(double base, double height, String color, Date createDate)
	{
        		super(color, createDate);
        		baze = base;
        		hite = height;
    	}
	public void setBase(double base)
	{
        		this.baze = base;
	}
	public double getBase()
	{
        		return baze;
	}
	public void setHeight(double height)
	{
        		this.hite = height;
	}
	public double getHeight()
	{
		return hite;
	}
	public double getArea()
	{
        		return (baze * hite) / 2;
	}
	public void printData()
	{
        		System.out.println("Base: " + baze + " Height: " + hite + " Color: " + getColor() + " Created date: " + getDateCreated());
	}
}

public class testMain 
{
	public static void main(String[] args)
	{
		RightangleTriangle t1 = new RightangleTriangle(3, 4, "red", Date.from(Instant.now()));
		System.out.println("Area: " + t1.getArea());
		t1.printData();
    	}
}