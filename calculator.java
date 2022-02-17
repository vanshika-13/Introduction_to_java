import java.util.*;
interface cal
{
	int add(int a,int b);
	int sub(int c,int d);
	int mul(int e,int f);
	int div(int g,int h);
}
class calculator implements cal
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	} 
	public int mul(int a,int b)
	{
		return a*b;
	} 
	public int div(int a,int b)
	{
		return a/b;
	}
	public static void main(String[] s)
	{
		calculator c = new calculator();
		System.out.println("sum = " + c.add(45,9));
		System.out.println("diff = " + c.sub(45,9));
		System.out.println("prod = " + c.mul(45,9));
		System.out.println("quot = " + c.div(45,9));
		
	}  
}