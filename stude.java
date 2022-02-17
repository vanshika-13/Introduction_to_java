import java.util.*;
class courseException extends Exception
{
	public courseException(String s)
    	{
        		super(s);
    	}
}
class stude
{
	static void compare(String c) throws courseException
	{
		if(!c.equalsIgnoreCase("JAVA"))
		{
			throw new courseException("Course doesnot Match");
		}
		else 
		{
			System.out.println("Course = JAVA");
		}	
	}
	public static void main(String[] a)
	{
		Scanner sc = new Scanner(System.in);
		String u_name = sc.next();
		String course = sc.next();
		//stude s = new stude();
		try
		{
			System.out.println("University name = DIT");
			compare(course);
		}catch(courseException e)
		{
			System.out.println(e);
		}
	}
}
		