import java.util.*;
class Dog{
private String name;
private String breed;
public Dog(String name,String breed){
super();
this.name=name;
this.breed=breed;
}
public String getName(){
return name;
}
public String getBreed(){
return breed;
}
@Override
public String tostring(){
return "Dog Name: "+name+" Dog Breed: "+breed;
}
}
public class ExampleOfHashSet{
public static void main(String[] args){
Dog d=new Dog("Apam","lab");
HashSet hs=new HashSet();
hs.add(d);
for(Object o:hs){
System.out.println(o);
}
}
}