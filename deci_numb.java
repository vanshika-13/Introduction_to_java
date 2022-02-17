import java.util.Scanner;
public class deci_num {
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter two decimal numbers: ");
 double a=sc.nextDouble();
 double b=sc.nextDouble();
 a=Math.round(a*10000);
 a=a/10000;
 
 b=Math.round(b*10000);
 
 b=b/10000;
 if(a==b){
 System.out.println("Same");
 
 }
 else{
 System.out.println("Not Same");
 }
}
 
}