class adder
{
	int add(int a , int b)
	{
		return a+b;
	}
	int add(int a , int b , int c)
	{
		return a+b+c;
	}
	double add(double a , int b)
	{
		return a+b;
	}
	/*void main(String[] h)
	{
		System.out.println("HELLO");
	}*/
	//we can overload the main function but the argument should not be string .
	public static void main(String[] s)
	{
		adder x = new adder();
		System.out.println(x.add(2,3));
		System.out.println(x.add(4,3,5));
		System.out.println(x.add(4.5,3));
		//System.out.println(x.main("vanshika"));
	}
}