import java.util.Scanner;
interface FirstCalculator{
void add();
void sub();
}
class MyCalculator1 implements FirstCalculator{
public void add(){
int num1=20;
int num2=30;
int sum=num1+num2;
System.out.println("The sum is: "+sum);
}
public void sub(){
int num1=20;
int num2=30;
int diff=num1-num2;
System.out.println("The difference is: "+diff);
}
}
class MyCalculator2 implements FirstCalculator{
public void add(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:");
int num1=sc.nextInt();
System.out.println("Enter the second number:");
int num2=sc.nextInt();
int sum=num1+num2;
System.out.println("The sum is: "+sum);
}
public void sub(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:");
int num1=sc.nextInt();
System.out.println("Enter the second number:");
int num2=sc.nextInt();
int diff=num1-num2;
System.out.println("The Difference is: "+diff);
}
}
public class Interface{
public static void main(String[] args){
MyCalculator1 m1=new MyCalculator1();
MyCalculator2 m2=new MyCalculator2();
m1.add();
m1.sub();
m2.add();
m2.sub();
}
}