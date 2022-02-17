interface lab9
{
void input();
void add();
void subtract();
void multiply();
void divide();
void modulus();
}
class simple_calculator implements lab9
{
int a;
int b;
public void input()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter 2 Numbers");
a=sc.nextInt();
b=sc.nextInt();
}
public void add()
{
int s=a+b;
System.out.println(a+" + "+b+" : "+s);
}
public void subtract()
{
int s=a-b;
System.out.println(a+" - "+b+" : "+s);
}
public void multiply()
{
int s=a*b;
System.out.println(a+" * "+b+" : "+s);
}
public void divide()
{
int s=a/b;
System.out.println(a+" / "+b+" : "+s);
}
public void modulus()
{
int s=a+b;
System.out.println(a+" % "+b+" : "+s);
}
public static void main(String [] args)
{
Scanner sc = new Scanner (System.in);
simple_calculator obj = new simple_calculator();
obj.input();
System.out.println("Enter + for Addition\nEnter - for Subtraction");
System.out.println("Enter * for Multiplication\nEnter / for Division");
System.out.println("Enter % for Modulus\nEnter 1 to Exit");
char ch= sc.next().charAt(0);
switch (ch)
{
case '+':
obj.add();
break;
case '-':
obj.subtract();
break;
case '*':
obj.multiply();
break;
case '/':
obj.divide();
break;
case '%':
obj.modulus();
break;
default:
System.out.println("Invalid Input");
}
}
}