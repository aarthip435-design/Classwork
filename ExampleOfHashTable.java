import java.util.*;
class ExampleOfHashTable{
public static void main(String[] args){
Hashtable<String, String> ht=new Hashtable<String, String>();
ht.put("Name", "Prabhas");
ht.put("Age", "Forty Six");
ht.put("Occupation", "Actor");
System.out.println(ht);
for(Object i:ht.keySet()){
System.out.println(i);
}
for(Object i:ht.entrySet()){
System.out.println(i);
}
for(Object i:ht.values()){
System.out.println(i);
}
}
}