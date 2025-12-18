abstract class Plane{
abstract void takeOff();
abstract void fly();
abstract void land();
}
class CargoPlane extends Plane{
void takeOff(){
System.out.println("Cargo plane is taking off");
}
void fly(){
System.out.println("Cargo plane if flying at low heights");
}
void land(){
System.out.println("Cargo plane is landing");
}
}
class PassengerPlane extends Plane{
void takeOff(){
System.out.println("Passenger plane is taking off");
}
void fly(){
System.out.println("Passenger plane if flying at medium heights");
}
void land(){
System.out.println("Passenger plane is landing");
}
}
class FighterPlane extends Plane{
void takeOff(){
System.out.println("Fighter plane is taking off");
}
void fly(){
System.out.println("Fighter plane if flying at great heights");
}
void land(){
System.out.println("Fighter plane is landing");
}
}
class Airport{
void permit(Plane ref){
ref.takeOff();
ref.fly();
ref.land();
}
}
public class Abstraction{
public static void main(String[] args){
CargoPlane cp=new CargoPlane();
PassengerPlane pp=new PassengerPlane();
FighterPlane fp=new FighterPlane();
Airport a=new Airport();
a.permit(cp);
a.permit(pp);
a.permit(fp);
}
}