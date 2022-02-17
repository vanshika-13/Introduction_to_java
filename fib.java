class fib
{
	static int p(int n)
	{
		if(n == 0 || n==1)
		{
			System.out.println(p(n));
			return 0;
		}
		else
		{
			return p(n-1)+p(n-2);
		}
	}
	public static void main(String[] a)
	{
		p(5);
	}
}