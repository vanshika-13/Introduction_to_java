class Stud
{
	int roll;
	String name;
	void input(int r , String n)
	{
		roll=r;
		name=n;
	}
	void display()
	{
		System.out.print("Roll="+roll);
		System.out.print(" Name="+name);
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
 