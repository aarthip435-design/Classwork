import java.util.Scanner;
abstract class Calculator{
abstract void add();
abstract void sub();
abstract void mul();
abstract void div();
}
class MyCalculator extends Calculator{
void add(){
int num1=20;
int num2=30;
int sum=num1+num2;
System.out.println("The sum is: "+sum);
}
void sub(){
int num1=20;
int num2=30;
int diff=num1-num2;
System.out.println("The difference is: "+diff);
}
void mul(){
int num1=20;
int num2=30;
int prod=num1*num2;
System.out.println("The product is: "+prod);
}
void div(){
int num1=20;
int num2=30;
int div=num1/num2;
System.out.println("The Quotient is: "+div);
}
}
class MyCalculator2 extends Calculator{
void add(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:");
int num1=sc.nextInt();
System.out.println("Enter the second number:");
int num2=sc.nextInt();
int sum=num1+num2;
System.out.println("The sum is: "+sum);
}
void sub(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:");
int num1=sc.nextInt();
System.out.println("Enter the second number:");
int num2=sc.nextInt();
int diff=num1-num2;
System.out.println("The Difference is: "+diff);
}
void mul(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:");
int num1=sc.nextInt();
System.out.println("Enter the second number:");
int num2=sc.nextInt();
int prod=num1*num2;
System.out.println("The product is: "+prod);
}
void div(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:");
int num1=sc.nextInt();
System.out.println("Enter the second number:");
int num2=sc.nextInt();
int div=num1/num2;
System.out.println("The Quotient is: "+div);
}
}
class Math{
void arithmetic(Calculator c){
c.add();
c.sub();
c.mul();
c.div();
}
}
public class Abstraction1{
public static void main(String[] args){
MyCalculator m1=new MyCalculator();
MyCalculator2 m2=new MyCalculator2();
Math m=new Math();
m.arithmetic(m1);
m.arithmetic(m2);
}
}