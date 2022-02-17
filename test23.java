class test23
{
		public static void main(String s2[])
		{
			try
			{
				int  a[]={1,2};
				a[2]=3/0;
			}catch(ArithmeticException e)
			{
				System.out.println("Divide by 0");
			}
                                                    catch(Exception e)
			{
				System.out.println("Index of array is not defined");
			}
		}
}