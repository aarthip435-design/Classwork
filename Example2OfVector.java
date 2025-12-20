import java.util.*;
class Car{
private String carName;
private String carColor;
public Car(String carName, String carColor){
this.carName=carName;
this.carColor=carColor;
}
public String getCarName(){
return carName;
}
public String getCarColor(){
return carColor;
}
@Override
public String tostring(){
return "Car Name: "+carName+" Car Color: "+carColor;
}
}
public class Example2OfVector{
public static void main(String[] args){
Car c1=new Car("Ferrari","Dark Blue");
Car c2=new Car("Thar","Black");
Vector<Car> v=new Vector<Car>();
v.add(c1);
v.add(c2);
for(Object obj:v){
System.out.println(obj);
}
}
}
