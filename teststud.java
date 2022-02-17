class Stud
{
	int roll;
	String name;
	static String un="DIT";
	void input(int r , String n)
	{
		roll=r;
		name=n;
	}
	void display()
	{
		System.out.println("Roll="+roll);
		System.out.println(" Name="+name);
		System.out.println(" University Name="+un);
	}
}
class teststud
{
	public static void main(String[] a1)
	{
		Stud s1 = new Stud();
		Stud s2 = new Stud();
		s2.input(102,"A");
		s1.input(101,"Vanshika");
		s1.display();
	}
}	
 