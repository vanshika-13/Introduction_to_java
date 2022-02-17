class max
{
	public static void main(String[] s)
	{
		int a[] = new int[11]
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i = 0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Maximum number you entered is " + max);
	}
}
		