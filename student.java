import java.util.*;

class student{

int roll_no;
String name;
String course;
static String university_name = "DIT UNIVERSITY";

void intput(){
Scanner sc = new Scanner(System.in);
System.out.println("enter roll no , name and course");
roll_no = sc.nextInt();
name = sc.next();

while(true){
if(course.equalIgnoreCase ("java") || course.equalIgnoreCase ("dm") ){
break;
}
else{
System.out.println("course = ", course);
System.out.print("Enter valid cousre");
}}
}

void display(){
Sytsem.out.println("Roll no " , +roll_no);
Sytsem.out.println("Nmae " , +name);
Sytsem.out.println("Course " , +course);
Sytsem.out.println("University name " , +university_name);
}


public static void main (String[] args){
student s1 = new student();
s1.input();
s1.display();
}
}
