import java.util.List;
import java.util.ArrayList;
public class ExampleOfCollection{
public static void main(String[] args){
List<Integer> l=new ArrayList<Integer>();
l.add(10);
l.add(20);
l.add(30);
l.add(40);
for(Object i:l){
System.out.println(i);
}
System.out.println(l.size());
System.out.println(l.contains(10));
System.out.println(l.get(0));
System.out.println(l.getLast());
for(int i=0;i<=l.size()-1;i++){
System.out.println(l.get(i));
}
System.out.println("..................................");
ArrayList<Integer> al=new ArrayList<Integer>();
al.add(50);
al.add(60);
al.add(70);
al.add(80);
System.out.println("Array List :"+al);
for(Object i:al){
System.out.println(i);
}

}
}