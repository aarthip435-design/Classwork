import java.util.Scanner;
public class ExceptionalHandling{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numerator: ");
int a=sc.nextInt();
System.out.println("Enter the denominator: ");
int b=sc.nextInt();
try{
int quotient=a/b;
System.out.println("The quotient is: "+quotient);
}
catch(ArithmeticException e){
System.out.println("We can't divide a number by 0");
}
catch(NullPointerException e){
System.out.println();
}
catch(Exception e){
System.out.println();
}
}
}
