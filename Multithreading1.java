import java.util.Scanner;
class Addition implements Runnable{
public void run(){
System.out.println("Addition task started");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number: ");
int a=sc.nextInt();
System.out.println("Enter the second number: ");
int b=sc.nextInt();
int sum=a+b;
System.out.println(sum);
System.out.println("Addition task completed");
}
}
class CharacterPrinting implements Runnable{
public void run(){
System.out.println("Character printing started");
for(int i=65;i<=75;i++){
System.out.println((char)i);
try{
Thread.sleep(1000);
}
catch(Exception e){
e.printStackTrace();
}
}
System.out.println("Character printing task is completed");
}
}
class NumberPrinting implements Runnable{
public void run(){
System.out.println("Number printing is started");
for(int i=65;i<=75;i++){
System.out.println(i);
try{
Thread.sleep(1000);
}
catch(Exception e){
e.printStackTrace();
}
}
System.out.println("Number printing is completed");
}
}
public class Multithreading1{
public static void main(String[] args){
Addition a=new Addition();
CharacterPrinting cp=new CharacterPrinting();
NumberPrinting np=new NumberPrinting();
Thread t1=new Thread(a);
Thread t2=new Thread(cp);
Thread t3=new Thread(np);
t1.start();
t2.start();
t3.start();
}
}
