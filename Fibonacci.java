class fibonacci
{
	public static void fib(int n,int a,int b)
	{
		if(n==0)
		{
			return;
		}
		else
		{
			System.out.print(" "+a);
			fib(n-1,b,a+b);
		}
	}
	public static void main(String[] a)
	{
		fib(5,0,1);
	}
}
		 