import java.util.*;
abstract class cal 
{
    abstract int add (int n1,int n2);    
    abstract int minus(int n1,int n2);   
    void display(int n1,int n2,int c,int d)
   {
    	System.out.println("First Number = "+n1+ "\nSecond Number = "+n2+"\nAfter Addition = "+c+"\nAfter Subtraction = "+d);
    }
}
class Simple_calculator extends cal
{
      int r1;
      int r2;
    
      public int add(int p,int q )
      {
      	r1=p+q;
      	return r1 ; 
      }
      public int  minus (int e,int f )
      {
        	r2=e-f;
        	return r2 ;
      }
      Simple_calculator()
      {

      }
      Simple_calculator(int a,int b)
      {
        	r1=a;
        	r2=b;
      }
}

class testcal{

    public static void main(String [] args)
   {
        Simple_calculator s=new Simple_calculator();
        System.out.print("Enter the First number = ");
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.print("Enter the Second number = ");
        Scanner sc1 =new Scanner(System.in);
        int n2=sc1.nextInt();
        System.out.println("First Number  = " +n1);
        System.out.println("Second Number  = " +n2);
        System.out.println("The result after addition is" +s.add(n1,n2));
        System.out.println("The result after subtraction is " +s.minus(n1,n2));
   }
}