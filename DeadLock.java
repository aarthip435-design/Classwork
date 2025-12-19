class Family implements Runnable{
String r1="TV";
String r2="Play Station";
public void run(){
String name=Thread.currentThread().getName();
if(name.equals("CR")==true){
crAccquiredResource();
}
else{
mokshaAccquiredResource();
}
}
void crAccquiredResource(){
synchronized(r2){
try{
System.out.println("CR Accquired the play station");
Thread.sleep(2000);
synchronized(r1){
System.out.println("CR Accquired the TV");
Thread.sleep(1000);
}
}
catch(Exception e){
System.out.println("Rohit failed");
}
}
}
void mokshaAccquiredResource(){
synchronized(r1){
try{
System.out.println("Moksha Accquired the TV");
Thread.sleep(2000);
synchronized(r2){
System.out.println("Moksha Accquired the play station");
Thread.sleep(1000);
}
}
catch(Exception e){
System.out.println("Moksha failed");
}
}
}
}
class DeadLock{
public static void main(String[] args){
Family f=new Family();
Thread t1=new Thread(f);
Thread t2=new Thread(f);
t1.setName("CR");
t2.setName("Moksha");
t1.start();
t2.start();
}
}