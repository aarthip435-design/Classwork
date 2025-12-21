import java.util.*;
class ExampleOfTreeMap{
public static void main(String[] args){
TreeMap<String, String> tm=new TreeMap<String, String>();
tm.put("Name", "AARTHI");
tm.put("Place", "Tirupati");
tm.put("Email", "aarthip265");
System.out.println(tm);
System.out.println("................................................");
for(Object i:tm.keySet()){
System.out.println(i);
}
System.out.println("................................................");
for(Object i:tm.entrySet()){
System.out.println(i);
}
System.out.println("................................................");
for(Object i:tm.values()){
System.out.println(i);
}
}
}