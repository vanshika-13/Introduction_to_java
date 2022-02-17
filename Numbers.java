import java.util.*;
class Numbers
{
	int n;
	void getnum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which you want to check ");
		n = sc.nextInt();
	}
	int check()
	{
		int sum =0,i=1;
		while(sum <= n)
		{
			sum = sum + i ;
			i++;
			if(sum == n)
			{
				return 1;
			}
		}
		return 0;		
	}
	void dispnum()
	{
		if(check() == 1)
		{
			System.out.println("The entered number is a trinagular number ");
		}
		else
		{	
			System.out.println("The entered number is not a trinagular number ");
		}
	}
	public static void main(String[] a)
	{
		Numbers n1 = new Numbers();
		n1.getnum();
		n1.check();
		n1.dispnum();
	}
}