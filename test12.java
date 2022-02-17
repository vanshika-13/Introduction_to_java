interface bank
{
	void display();
}
interface job
{
	void show();
}
class user implements bank,job
{
	public void display()
	{
		System.out.println("displaying bank interface");
	}
	public void show()
	{
		System.out.println("displaying job interface");
	}
}
class test12
{
	public static void main(String[] a)
	{
		user u = new user();
		u.display();
		u.show();
	}
}