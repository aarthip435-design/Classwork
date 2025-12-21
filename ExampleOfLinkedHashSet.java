import java.util.*;
public class ExampleOfLinkedHashSet{
public static void main(String[] args){
LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
lhs.add(10);
lhs.add(20);
lhs.add(30);
lhs.add(40);
System.out.println(lhs);
for(Object o:lhs){
System.out.println(o);
}
}
}