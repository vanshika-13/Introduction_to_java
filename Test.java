class Test
{
	int a=5;
	static int b=10;
	
	void input(int c)  
	{	
		a=c;
		System.out.println(" a= "+a);
		System.out.println(" B ="+b);  // static var
	}
	static void display()
	{
		System.out.println(" B="+b);
		System.out.println(" A="+a);  // error cannot be accessed
	}
	public static void main(String[] a1)
	{
		Test t1=new Test(); //copy of a and input(), no copy of b
		Test t2=new Test();
		//t1.b=11;
		t1.input(10);
		t2.input(15);
		display();
		System.out.println(" b="+b);
		//System.out.println(" a="+a);  // cannot access 
	}
}
