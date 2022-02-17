import java.util.*;

class student{

int roll_no;
String name;
String course;
static String university_name = "DIT UNIVERSITY";

void input(){
Scanner sc = new Scanner(System.in);
System.out.println("enter roll no , name and course");
roll_no = sc.nextInt();
name = sc.next();

while(true){

course = sc.next();
System.out.println("Enter Course Again");
if(course.equalsIgnoreCase ("java") || course.equalsIgnoreCase ("dm") ){
break;
}
}
}

void display(){
System.out.println("Roll no " + roll_no);
System.out.println("Nmae " + name);
System.out.println("Course " + course);
System.out.println("University name " +university_name);
}


public static void main (String[] args){
student s1 = new student();
s1.input();
s1.display();
}
}
