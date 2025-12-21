import java.util.*;
public class ExampleOfMap{
public static void main(String[] args){
//Map m=new HashMap();
HashMap<String, String> hm=new HashMap<String, String>();
hm.put("Name", "Prabhas");
hm.put("Place", "Tirupati");
System.out.println(hm);
System.out.println("..........................................");
System.out.println(hm.get("Name"));
System.out.println("..........................................");
for(Object i:hm.keySet()){
System.out.println(i);
}
for(Object i:hm.values()){
System.out.println(i);
}
for(Object i:hm.entrySet()){
System.out.println(i);
}
}
}