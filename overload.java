class Addition 
{
	public int add(int a, int b, int c)                                 // adding three integer values.
	{
 
		int sum = a + b + c;
		return sum;
    	}
    	public double add(double a, double b, double c)      // adding three double values.
    	{
 		double sum = a + b + c;
       		 return sum;
    	}
	public int add(int a, int b)                                       // adding two integer values.
    	{
        		int sum = a + b;
        		return sum;
    	}
 
    	public static void main(String[] args)
    	{
 		Addition ob = new Addition();
 		 int sum2 = ob.add(1, 2, 3);
        		System.out.println("sum of the three integer value :" + sum2);
        		double sum3 = ob.add(1.0, 2.0, 3.0);
        		System.out.println("sum of the three double value :"+ sum3);
    	}
}