class Plane{
void takeOff(){
System.out.println("Plane is taking off");
}
void fly(){
System.out.println("Plane is flying");
}
void land(){
System.out.println("Plane is landing");
}
}
class CargoPlane extends Plane{
void fly(){//overridden method
System.out.println("Cargoplane is flying at low heights");
}
void carryCargo(){//specialized method
System.out.println("Cargoplane carries cargo");
}
}
class Indigo extends Plane{
void land(){
System.out.println("Indigo plane is landing");
}
void carryIndigo(){
System.out.println("Indigo plane carries indigo");
}
}
public class MethodsOfInheritance{
public static void main(String[] args){
CargoPlane cp=new CargoPlane();
Indigo ig=new Indigo();
cp.takeOff();
cp.fly();
cp.land();
cp.carryCargo();
ig.takeOff();
ig.fly();
ig.land();
ig.carryIndigo();
}
}