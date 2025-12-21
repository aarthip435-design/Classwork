import java.util.*;
public class ExampleOfLinkedHashMap{
public static void main(String[] args){
LinkedHashMap lhm=new LinkedHashMap();
lhm.put("Name", "Aarthi");
lhm.put("Age",21);
System.out.println(lhm);
System.out.println(".........................................");
System.out.println(lhm.get(0));
System.out.println(".........................................");
for(Object i:lhm.keySet()){
System.out.println(i);
}
System.out.println(".........................................");
for(Object i:lhm.values()){
System.out.println(i);
}
System.out.println(".........................................");
for(Object i:lhm.entrySet()){
System.out.println(i);
}
}
}