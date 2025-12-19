class Average implements Runnable{
public void run(){
int n=10;
float sum=0f;
for(int i=1;i<=n;i++){
sum=sum+i;
}
float average=sum/n;
System.out.println("The average of first 10 numbers is:" +average);
}
}
class Square implements Runnable{
int arr[]={1,20,50,15,30};
public void run(){
System.out.println("Squares of numbers in the array");
for(int i=0;i<arr.length;i++){
System.out.println("Square of "+ arr[i]+" is:");
 arr[i]=arr[i]*arr[i]; 
System.out.println(arr[i]);
}
}
}
public class ThreadExample{
public static void main(String[] args){
Average a=new Average();
Square s=new Square();
Thread t1=new Thread(a);
Thread t2=new Thread(s);
t1.start();
t2.start();
}
}

