import java.util.*;
class teacher
{
	int teacher_id;
	String name;
	char teacher_type;
	String subject;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id of the teacher ");
		teacher_id = sc.nextInt();
		System.out.println("Enter the name of the teacher ");
		name = sc.next();
		System.out.println("Enter type of teacher (p or t)");
		teacher_type = sc.next().charAt(0);
		if(teacher_type == 'p')
		{
			subject = "Introduction to Java";
		}
		else if(teacher_type == 't')
		{
			subject = "Computer Organisation And Architecture";
		}
	}
	void display()
	{
		System.out.println("The id of the teacher is " + teacher_id);
		System.out.println("The name of the teacher is " + name);
		System.out.println("The subject taught by the teacher is " + subject);
	}
	public static void main(String[] s)
	{
		teacher t1 = new teacher();
		teacher t2 = new teacher();
		t1.input();
		t1.display(); 
		t2.input();
		t2.display(); 
	}
}


	