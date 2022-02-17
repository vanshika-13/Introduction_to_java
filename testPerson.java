import java.util.*;
import java.util.GregorianCalendar;

// Implement Person class
class Person {
	private String name;
	private String address;
	private String phone;
	private String email;

	/** Construct default Person object */
	public Person() {
		this("Unknown","Unknown","Unknown","Unknown");
	}

	/** Construct Person object with specified name, address, phone and email */
	public Person(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	} 

	/** Return name */
	public String getName() {
		return name;
	}

	/** Return address */
	public String getAddress() {
		return address;
	}

	/** Return phone */
	public String getPhone() {
		return phone;
	}

	/** Return email */
	public String getEmail() {
		return email;
	}

	/** Set new name */
	public void setName(String name) {
		this.name = name;
	}

	/** Set new address */
	public void setAddress(String address) {
		this.address = address;
	}

	/** Set new phone number */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/** Set new email */
	public void setEmail(String email) {
		this.email = email;
	}

	/** Return a string discription of the class */
	public String toString() {
		return "\nName: " + name + "\nAddress: " + address + 
				 "\nPhone number: " + phone + "\nEmail address: " + email;
	}
}
// Implement Student class
class Student
		extends Person {
	private int status;
	public final static int FRESHMAN = 1;
	public final static int SOPHOMORE = 3;
	public final static int JUNIOR = 2;
	public final static int SENIOR = 4;

	public Student(String name, String address,  
		String phone, String email, int status) {
		super(name, address, phone, email);
		this.status = status;
	}

	/** Set new status */
	public void setStatus(int status) {
		this.status = status; 
	}

	/** Return status */
	public String getStatus() {
		switch (status) {
			case 1 : return "freshman"; 
			case 2 : return "sophomore"; 
			case 3 : return "junior"; 
			case 4 : return "senior";
			default : return "Unknown"; 
		}
	}

	/** Return a string discription of the class */
	public String toString() {
		return super.toString() + "\nStatus: " + getStatus();
	}
}
// Implement Staff class
class Staff
		extends Employee {
	// Data Fields
	private String title;

	// Constructors
	/** Construct a Staff object */
	public Staff(String name, String address, String phone,  
		String email, int office, double salary, String title) {
		super(name, address, phone, email, office, salary);
		this.title = title;
	}

	/** Return title */
	public String getTitle() {
		return title;
	}

	/** Set new title */
	public void setTitle(String title) {
		this.title = title;
	}

	/** Return a string discription of the class */
	public String toString() {
		return super.toString() + "\nTitle: " + title;
	}
}
// Implement MyDate class
class MyDate {
	// Data Fields
	private int year;
	private int month;
	private int day;

	/** Creates a MyDate object for the current date */
	MyDate() {
		GregorianCalendar calander = new GregorianCalendar();
		year = calander.get(GregorianCalendar.YEAR);
		month = calander.get(GregorianCalendar.MONTH);
		day = calander.get(GregorianCalendar.DAY_OF_MONTH);
	}

	/** Creates a MyDate object with a specified elapsed time
	*	 since midnight, January 1, 1970, in milliseconds */
	MyDate(long elapsedTime) {
		setDate(elapsedTime);
	}

	/** Creates a MyDate object with the 
	*   specified year, month, and day */
	MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	/** Return year */
	public int getYear() {
		return year;
	}

	/** Return month */
	public String getMonth() {
		String m = String.valueOf(month + 1);
		return (month < 10 ? "0" + m : m);
	}

	/** Return day */
	public String getDay() {
		String d = String.valueOf(day);
		return (day < 10 ? "0" + d : d);
	}

	/** Sets a new date for the object using the elapsed time */
	public void setDate(long elapsedTime) {
		GregorianCalendar calander = new GregorianCalendar();
		calander.setTimeInMillis(elapsedTime);
		year = calander.get(GregorianCalendar.YEAR);
		month = calander.get(GregorianCalendar.MONTH);
		day = calander.get(GregorianCalendar.DAY_OF_MONTH);
	} 
}
// Implement Faculty class
class Faculty 
		extends Employee {
	// Data fields
	private String officeHours;
	private String rank;

	// Constructors
	/** Construct a Faculty object with specified name, address, phone number,
	  * email address, office, salary, office hours and rank */
	public Faculty(String name, String address, String phone, String email, 
		int office, double salary, String officeHours, String rank) {
		super(name, address, phone, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	/** Return officeHours */
	public String getOfficeHours() {
		return officeHours;
	}

	/** Set new officeHours */
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	/** Return rank */
	public String getRank() {
		return rank;
	}

	/** Set new rank */
	public void setRank(String rank) {
		this.rank = rank;
	}

	/** Return a string discription of the class */
	public String toString() {
		return super.toString() + "\nOffice hours: " + officeHours +
		"\nRank: " + rank;
	}
}
public class testPerson{
	// Main method
	public static void main(String[] args) {
		// Create a Person, Student, Employee, Faculty, and Staff objects
		Person person = new Person("Vanshika", "12 Bell street", 
			"3473339999", "vanshika12@gmail.com");

		Student student = new Student("Keerti", "100 Town Ave", "5149993333", 
			"keerti100@gmail.com", Student.FRESHMAN);

		Employee employee = new Employee("Rudrika", "34 West street", "6189999999",
			"rudrika80@gmail.com", 910, 60000);

		Faculty faculty = new Faculty("Jayathi", "28 Well street", "4133333333",
			"jayathi28@gmail.com", 101, 50000, "4pm to 6pm", "Professor");

		Staff staff = new Staff("Anchal", "90 Country road", "2030000000",
			"anchal@gmail.com", 12, 65000, "Executive Assistant");

		// Invoke toString of Person, Student, Employee, Faculty and Staff
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
}
// Implement Employee class
class Employee
		extends Person {
	private int office;
	private double salary;
	private MyDate dateHired;

	/** Construct Employee object */
	public Employee(String name, String address, String phone, 
		String email, int office, double salary) {
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = new MyDate();
	}

	/** Return office */
	public int getOffice() {
		return office;
	}

	/** Return salaray */
	public String getSalary() {
		return String.format("%.2f", salary);
	}

	/** Return date hired */
	public String getDateHired() {
		return dateHired.getMonth() + "/" + dateHired.getDay() 
				 + "/" + dateHired.getYear();
	}

	/** Set new office */
	public void setOffice(int office) {
		this.office = office;
	}

	/** Set new salary */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/** Set new dateHired */
	public void setDateHired() {
		dateHired = new MyDate();
	}

	/** Return a string discription of the class */
	public String toString() {
		return super.toString() + "\nOffice: " + office + 
				 "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
	}
}