class Car{
private String name;
private String milage;
private String color;
public Car(){
name="anu";
milage="100 KM/H";
color="Grey";
}
public Car(String name,String milage,String color){
this();
this.name=name;
this.milage=milage;
this.color=color;
}
public void setName(String name){
this.name=name;
}
public void setMilage(String milage){
this.milage=milage;
}
public void setColor(String color){
this.color=color;
}
public String getName(){
return name;
}
public String getMilage(){
return milage;
}
public String getColor(){
return color;
}
}
public class Encapsulation1{
public static void main(String[] args){
Car c1=new Car("Ferrari","10 KM/H","Red");
Car c2=new Car();
//c2.setName("Audi");
//c2.setMilage("50 KM/H");
//c2.setColor("Black");
System.out.println("First car name is: "+c1.getName());
System.out.println("First car milage is: "+c1.getMilage());
System.out.println("First car color is: "+c1.getColor());
System.out.println("Second car name is: "+c2.getName());
System.out.println("Second car milage is: "+c2.getMilage());
System.out.println("Second car color is: "+c2.getColor());
}
}