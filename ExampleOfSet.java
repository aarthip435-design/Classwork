import java.util.*;
public class ExampleOfSet{
public static void main(String[] args){
HashSet hs=new HashSet();
hs.add(10);
hs.add("java");
hs.add("Python");
System.out.println(hs);
System.out.println("..................................");
System.out.println(hs.size());
System.out.println("..................................");
System.out.println(hs.isEmpty());
System.out.println("..................................");
System.out.println(hs.clone());
for(Object o:hs){
System.out.println(o);
}
}
}