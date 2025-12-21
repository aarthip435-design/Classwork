import java.util.*;
class ExampleOfArrayDeque{
public static void main(String[] args){
//Deque d=new ArrayDeque();
ArrayDeque<Integer> d=new ArrayDeque<Integer>();
d.add(50);
d.add(40);
d.add(30);
d.add(20);
System.out.println(d);
System.out.println("...................................");
for(Object i:d){
System.out.println(i);
}
System.out.println("...................................");
System.out.println(d.poll());
System.out.println("...................................");
System.out.println(d.remove(20));
System.out.println("...................................");
System.out.println(d);
}
}