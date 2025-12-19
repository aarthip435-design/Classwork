class Printer implements Runnable{
synchronized public void run(){
String name=Thread.currentThread().getName();
System.out.println(name+" Printing Started");
for(int i=1;i<=5;i++){
//To synchronize a single line follow this method 
synchronized(this){
System.out.println(name+" is printing");}//
System.out.println(name+" is printing");
try{
Thread.sleep(2000);
}
catch(Exception e){
System.out.println("Some problem occurred");
}
}
System.out.println(name+" Completed the printing");
}
}
class DisadvantagesOfMultithreading{
public static void main(String[] args){
Printer p=new Printer();
Thread t1=new Thread(p);
Thread t2=new Thread(p);
Thread t3=new Thread(p);
t1.setName("Prabhas");
t2.setName("Danush");
t3.setName("Vicky");
t1.start();
t2.start();
t3.start();
}
}