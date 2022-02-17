import java.util.*;

class cbr{

int a ;
int b;

 void value( cbr sw){
Scanner sc = new Scanner (System.in);
a = sc.nextInt();
b = sc.nextInt();
sw.a = sw.b * sw.a ;
sw.b = sw.a + 1 ;
System.out.println("Actual Value of a   = " + sw.a);
System.out.println("Actual Value of b   = " + sw.b);

}

public static void main(String[] args){

cbr obj_ref = new cbr ();
obj_ref . value(obj_ref);
System.out.println("Value of a   = " + obj_ref.a);
System.out.println("Value of b   = " + obj_ref.b);
}}


